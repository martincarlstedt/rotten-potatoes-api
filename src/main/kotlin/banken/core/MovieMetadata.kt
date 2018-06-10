package banken.core

data class MovieMetadata(
        val id: String,
        val title: String,
        val year: Int,
        val ratings: Ratings,
        val posters: Posters) {
    fun withActualRating(rating: Int) = copy(ratings = ratings.copy(actual = rating))
}

data class Ratings(
        val critics: Int,
        val audience: Int,
        val actual: Int
)

data class Posters(
        val thumbnail: String = "",
        val profile: String = "",
        val detailed: String = "",
        val original: String = ""
)