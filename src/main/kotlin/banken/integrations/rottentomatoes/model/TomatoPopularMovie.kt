package banken.integrations.rottentomatoes.model

import banken.core.MovieMetadata
import banken.core.Posters
import banken.core.Ratings
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class TomatoPopularMovie(
        val title: String = "",
        val year: Int = 0,
        val posterUrl: String = "",
        val url: String = "") {
    private fun getId() = url.replace("/m/", "")
    fun toCore() = MovieMetadata(getId(), title, year, Ratings(-1, -1, -1), Posters(profile = posterUrl))
}