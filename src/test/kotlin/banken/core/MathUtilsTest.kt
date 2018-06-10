package banken.core

import org.junit.Assert.*
import org.junit.Test

class MathUtilsTest {
    @Test
    fun `should average`() {
        assertEquals(MathUtils.averageRatings(listOf(3.0, 5.0)), 80)
    }
}