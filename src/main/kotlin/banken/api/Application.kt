package banken.api

import banken.core.RottenPotatoesService
import banken.integrations.rottentomatoes.RottenTomatoesClient
import spark.Spark.port

fun main(args: Array<String>) {

    val rottenTomatoesClient = RottenTomatoesClient()
    val rottenPotatoesService = RottenPotatoesService(rottenTomatoesClient)

    ControllerAdvice()
    MovieController(rottenPotatoesService)
}

