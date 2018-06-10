package banken.core

interface MovieService {
    fun searchMovies(query: String): List<MovieMetadata>
    fun getMovie(id: String): MovieMetadata
    fun getPopularMovies(): List<MovieMetadata>
}
