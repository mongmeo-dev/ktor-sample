package dev.mongmeo.edge.database

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.ktorm.database.Database

object DatabaseConnection {
  val database = Database.connect(dataSource = HikariDataSource(HikariConfig().apply { 
    jdbcUrl = "jdbc:mysql://localhost:3306/ktor_sample"
    driverClassName = "com.mysql.jdbc.Driver"
    username = "root"
    password = "!Test1234!"
  }))
}
