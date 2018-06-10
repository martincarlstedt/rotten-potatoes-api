package banken.core

interface MovieClient {
    fun searchMovies(query: String): List<MovieMetadata>
    fun getMovieMetadata(id: String): MovieMetadata
    fun getMovieRatings(id: String): List<Double>
    fun getPopularMovies(): List<MovieMetadata>
}