package banken.integrations.rottentomatoes

import banken.core.MovieClient
import banken.core.MovieMetadata
import banken.integrations.rottentomatoes.model.TomatoMovieMetadata
import banken.integrations.rottentomatoes.model.TomatoPopularMovie
import banken.integrations.rottentomatoes.model.TomatoSearchResult
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.jsoup.Jsoup
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.web.client.RestTemplate

class RottenTomatoesClient : MovieClient {

    override fun getPopularMovies(): List<MovieMetadata> {
        val url = "https://www.rottentomatoes.com/api/private/v2.0/search/default-list"
        val exchange = RestTemplate().exchange(url, HttpMethod.GET, HttpEntity.EMPTY, String::class.java)

        return if (exchange.statusCode.is2xxSuccessful) {
            return try {
                jacksonObjectMapper().readValue<List<TomatoPopularMovie>>(exchange.body ?: "").map { it.toCore() }
            } catch (e: Exception) {
                emptyList()
            }
        } else {
            emptyList()
        }
    }

    override fun searchMovies(query: String): List<MovieMetadata> {
        val url = "https://www.rottentomatoes.com/api/private/v1.0/movies?q=$query"
        val exchange = RestTemplate().exchange(url, HttpMethod.GET, HttpEntity.EMPTY, String::class.java)

        return if (exchange.statusCode.is2xxSuccessful) {
            return try {
                jacksonObjectMapper()
                        .readValue<TomatoSearchResult>(exchange.body ?: "")
                        .movies.map { it.toCore() }
            } catch (e: Exception) {
                emptyList()
            }
        } else {
            emptyList()
        }
    }

    override fun getMovieMetadata(id: String): MovieMetadata {
        val url = "https://www.rottentomatoes.com/api/private/v1.0/movies/$id"
        val exchange = RestTemplate().getForEntity(url, String::class.java)
        return if (exchange.statusCode.is2xxSuccessful) {
            val body = exchange.body ?: throw IllegalStateException("No data available")
            try {
                jacksonObjectMapper().readValue<TomatoMovieMetadata>(body).toCore()
            } catch (e: Exception) {
                throw IllegalStateException("Bad format of movie metadata")
            }
        } else {
            throw IllegalStateException("Rotten tomatoes responded with status ${exchange.statusCode}")
        }
    }

    override fun getMovieRatings(id: String): List<Double> {
        val url = "https://www.rottentomatoes.com/m/$id/reviews/?type=user"
        val document = Jsoup.connect(url).get() ?: throw IllegalStateException("Failed to fetch movie information")
        return MoviePageParser.getRatings(document)
    }

}