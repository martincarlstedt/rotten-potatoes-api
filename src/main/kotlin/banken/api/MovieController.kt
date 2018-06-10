package banken.api

import banken.core.BadRequestException
import banken.core.MovieMetadata
import banken.core.MovieService
import banken.core.Ratings
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import spark.Spark.get
import spark.Spark.path

class MovieController(rottenPotatoesService: MovieService) {

    init {
        path("/movies") {
            get("") { request, response ->
                val movies = if (request.queryParams().contains("q")) {
                    val query = request.queryParams("q")
                    rottenPotatoesService.searchMovies(query)
                } else {
                    rottenPotatoesService.getPopularMovies()
                }

                mapper().writeValueAsString(movies
                        .map { MovieMetadataRest.asSearchResult(it) })
            }

            get("/:id") { request, response ->
                val id = request.params(":id") ?: throw BadRequestException("Bad request")
                val movie = rottenPotatoesService.getMovie(id)
                mapper().writeValueAsString(MovieMetadataRest.asMovie(movie))
            }
        }
    }

    private fun mapper() = jacksonObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
}

data class MovieMetadataRest(
        val id: String = "",
        val title: String = "",
        val year: Int = 0,
        val ratings: Ratings? = null,
        val poster: String = "") {

    companion object {
        fun asSearchResult(movie: MovieMetadata) = MovieMetadataRest(
                movie.id,
                movie.title,
                movie.year,
                poster = movie.posters.profile)

        fun asMovie(movie: MovieMetadata): MovieMetadataRest = MovieMetadataRest(
                movie.id,
                movie.title,
                movie.year,
                movie.ratings,
                movie.posters.detailed
        )
    }
}