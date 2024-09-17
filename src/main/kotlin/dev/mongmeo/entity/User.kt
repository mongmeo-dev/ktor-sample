package dev.mongmeo.entity

import dev.mongmeo.entity.enumerate.EntityStatusEnum
import org.ktorm.entity.Entity
import org.ktorm.schema.*
import java.time.LocalDateTime

object UserTable : Table<User>("users") {

  val id = long("id").primaryKey().bindTo { it.id }
  val username = varchar("username").bindTo { it.username }
  val password = varchar("password").bindTo { it.password }
  val nickname = varchar("nickname").bindTo { it.nickname }
  val createdAt = datetime("created_at").bindTo { it.createdAt }
  val updatedAt = datetime("updated_at").bindTo { it.updatedAt }
  val status = enum<EntityStatusEnum>("status").bindTo { it.status }
}

interface User : Entity<User> {

  companion object : Entity.Factory<User>()

  val id: Long
  val username: String
  val password: String
  val nickname: String
  val createdAt: LocalDateTime
  val updatedAt: LocalDateTime
  val status: EntityStatusEnum
}
