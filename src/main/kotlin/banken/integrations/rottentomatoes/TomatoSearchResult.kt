package banken.integration.model

import banken.core.MovieMetadata
import banken.core.Posters
import banken.core.Ratings
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class TomatoSearchResult(
        val total: Int = 0,
        val movies: List<TomatoSearchResultMovie> = emptyList())

@JsonIgnoreProperties(ignoreUnknown = true)
data class TomatoSearchResultMovie(
        val title: String = "",
        val year: Int = 0,
        val ratings: TomatoRatings = TomatoRatings(),
        val posters: TomatoPosters = TomatoPosters(),
        val links: TomatoSearchResultLinks = TomatoSearchResultLinks()) {
    fun toCore() = MovieMetadata(links.getMovieId(), title, year, ratings.toCore(), posters.toCore())
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class TomatoRatings(
        val critics_rating: String = "",
        val critics_score: Int = 0,
        val audience_rating: String = "",
        val audience_score: Int = 0) {
    fun toCore() = Ratings(critics_score, audience_score, -1)
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class TomatoPosters(
        val thumbnail: String = "",
        val profile: String = "",
        val detailed: String = "",
        val original: String = "") {
    fun toCore() = Posters(thumbnail, profile, detailed, original)
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class TomatoSearchResultLinks(val alternate: String = "") {
    fun getMovieId(): String {
        return alternate
                .replace("http://www.rottentomatoes.com/m", "")
                .replace("/", "")
    }
}