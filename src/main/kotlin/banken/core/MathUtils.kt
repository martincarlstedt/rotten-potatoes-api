package banken.core

class MathUtils {
    companion object {
        fun averageRatings(ratings: List<Double>) = Math.round(ratings.average() / 5 * 100).toInt()
    }
}
