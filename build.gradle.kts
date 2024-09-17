val kotlin_version: String by project
val logback_version: String by project
val koin_version: String by project
val ktorm_version = "4.1.1"
val mysql_version = "8.0.33"
val hikari_version = "5.1.0"

plugins {
  kotlin("jvm") version "2.0.20"
  id("io.ktor.plugin") version "2.3.12"
  id("org.jetbrains.kotlin.plugin.serialization") version "2.0.20"
}

group = "dev.mongmeo"
version = "0.0.1"

application {
  mainClass.set("dev.mongmeo.ApplicationKt")

  val isDevelopment: Boolean = project.ext.has("development")
  applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("io.ktor:ktor-server-core-jvm")
  implementation("io.ktor:ktor-server-webjars-jvm")
  implementation("org.webjars:jquery:3.2.1")
  implementation("io.github.smiley4:ktor-swagger-ui:2.9.0")
  implementation("io.ktor:ktor-server-cors-jvm")
  implementation("io.ktor:ktor-server-openapi")
  implementation("io.ktor:ktor-server-call-logging-jvm")
  implementation("io.ktor:ktor-server-content-negotiation-jvm")
  implementation("io.ktor:ktor-serialization-kotlinx-json-jvm")
  implementation("io.insert-koin:koin-ktor:$koin_version")
  implementation("io.insert-koin:koin-logger-slf4j:$koin_version")
  implementation("io.ktor:ktor-server-netty-jvm")
  implementation("ch.qos.logback:logback-classic:$logback_version")
  implementation("org.ktorm:ktorm-core:$ktorm_version")
  implementation("org.ktorm:ktorm-jackson:$ktorm_version")
  implementation("org.ktorm:ktorm-support-mysql:$ktorm_version")
  implementation("mysql:mysql-connector-java:$mysql_version")
  implementation("com.zaxxer:HikariCP:$hikari_version")
  testImplementation("io.ktor:ktor-server-test-host-jvm")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
