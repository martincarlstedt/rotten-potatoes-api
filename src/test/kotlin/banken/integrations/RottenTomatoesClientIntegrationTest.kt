package banken.integration

import org.junit.Assert.assertNotEquals
import org.junit.Ignore
import org.junit.Test

@Ignore
class RottenTomatoesClientIntegrationTest {

    private val rottenTomatoesClient = RottenTomatoesClient()

    @Test
    fun `should get list with result`() {
        val result = rottenTomatoesClient.searchMovies("avengers")
        assertNotEquals(result.size, 0)
    }

    @Test
    fun `should get ratings`() {
        val ratings = rottenTomatoesClient.getMovieRatings("star_wars_the_last_jedi")
        assertNotEquals(ratings.size, 20)
    }
}