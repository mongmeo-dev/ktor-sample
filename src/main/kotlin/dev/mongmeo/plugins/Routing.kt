package dev.mongmeo.plugins

import io.github.smiley4.ktorswaggerui.SwaggerUI
import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.server.webjars.*

fun Application.configureRouting() {
  install(Webjars) {
    path = "/webjars" //defaults to /webjars
  }
  install(SwaggerUI) {
    swagger {
      swaggerUrl = "swagger-ui"
      forwardRoot = true
    }
    info {
      title = "Example API"
      version = "latest"
      description = "Example API for testing and demonstration purposes."
    }
    server {
      url = "http://localhost:8080"
      description = "Development Server"
    }
  }
  routing {
  }
}
