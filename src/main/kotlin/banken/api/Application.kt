package banken.api

import banken.core.RottenPotatoesService
import banken.integrations.rottentomatoes.RottenTomatoesClient

fun main(args: Array<String>) {

    val rottenTomatoesClient = RottenTomatoesClient()
    val rottenPotatoesService = RottenPotatoesService(rottenTomatoesClient)

    ControllerAdvice()
    MovieController(rottenPotatoesService)
}

