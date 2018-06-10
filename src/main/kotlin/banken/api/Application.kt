package banken.api

import banken.core.RottenPotatoesService
import banken.integration.RottenTomatoesClient

fun main(args: Array<String>) {

    val rottenTomatoesClient = RottenTomatoesClient()
    val rottenPotatoesService = RottenPotatoesService(rottenTomatoesClient)

    ControllerAdvice()
    MovieController(rottenPotatoesService)
}

