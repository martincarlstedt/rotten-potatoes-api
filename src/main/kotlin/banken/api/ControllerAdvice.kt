package banken.api

import banken.core.BadRequestException
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import spark.Spark.*

class ControllerAdvice {

    init {
        port(ProcessBuilder().environment()["PORT"]?.toInt() ?: 4567)

        before("/*") { request, response ->
            response.type("application/json")
        }

        notFound { _, _ ->
            jacksonObjectMapper().writeValueAsString(ErrorResponse("404", "Not found"))
        }

        exception(Exception::class.java) { exception, request, response ->
            response.status(500)
            response.body(jacksonObjectMapper().writeValueAsString(ErrorResponse(
                    exception.javaClass.simpleName, exception.message ?: "Internal server error")))
        }

        exception(BadRequestException::class.java) { exception, _, response ->
            response.status(400)
            response.body(jacksonObjectMapper().writeValueAsString(ErrorResponse(
                    exception.javaClass.simpleName, exception.message ?: "")))
        }

    }
}

data class ErrorResponse(val error: String = "", val message: String)
