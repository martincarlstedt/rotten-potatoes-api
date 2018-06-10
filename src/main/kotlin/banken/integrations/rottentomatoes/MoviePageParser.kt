package banken.integration

import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.nodes.TextNode

class MoviePageParser {
    companion object {
        fun getRatings(doc: Document): List<Double> {
            return doc.select("#reviews > div.review_table").first()
                    .childNodes()
                    .filter { it is Element }
                    .map { (it as Element).select(".fl") }
                    .filter { it.isNotEmpty() }
                    .map { it.first().childNodes() }
                    .map { it.filter { (it is TextNode) && it.text().isNullOrBlank().not() || it is Element } }
                    .map {
                        it.fold(0.0) { sum, element ->
                            sum + when (element) {
                                is Element -> 1.0
                                else -> 0.5
                            }
                        }
                    }
        }
    }
}