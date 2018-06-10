package banken.core

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking

class RottenPotatoesService(private val rottenTomatoesClient: MovieClient) : MovieService {
    override fun getPopularMovies(): List<MovieMetadata> {
        return rottenTomatoesClient.getPopularMovies()
    }

    override fun searchMovies(query: String): List<MovieMetadata> {
        return rottenTomatoesClient.searchMovies(query).sortedByDescending { it.ratings.critics }
    }

    override fun getMovie(id: String): MovieMetadata {
        val movieMetadataCall = getMovieMetadata(id)
        val movieRatingsCall = getMovieRatings(id)

        return runBlocking {
            val movieMetadata = movieMetadataCall.await()
            val rating = MathUtils.averageRatings(movieRatingsCall.await())
            movieMetadata.withActualRating(rating)
        }
    }

    private fun getMovieMetadata(id: String) = async {
        rottenTomatoesClient.getMovieMetadata(id)
    }

    private fun getMovieRatings(id: String) = async {
        rottenTomatoesClient.getMovieRatings(id)
    }

}