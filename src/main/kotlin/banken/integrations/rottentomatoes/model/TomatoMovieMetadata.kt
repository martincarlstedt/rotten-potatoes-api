package banken.integrations.rottentomatoes.model

import banken.core.MovieMetadata
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class TomatoMovieMetadata(
        val title: String = "",
        val vanity: String = "",
        val year: Int = 0,
        val ratings: TomatoRatings = TomatoRatings(),
        val posters: TomatoPosters = TomatoPosters()) {
    fun toCore() = MovieMetadata(vanity, title, year, ratings.toCore(), posters.toCore())
}