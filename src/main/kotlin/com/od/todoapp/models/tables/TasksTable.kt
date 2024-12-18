package com.od.todoapp.models.tables

import org.jetbrains.exposed.sql.Table

const val MAX_VARCHAR_LENGTH = 128

object Tasks : Table("tasks") {
    val id = integer("id").autoIncrement()
    val title = varchar("name", MAX_VARCHAR_LENGTH)
    val description = text("description")
    val isCompleted = bool("is_completed").default(false)
}
