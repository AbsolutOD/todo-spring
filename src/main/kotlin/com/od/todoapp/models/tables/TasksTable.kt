package com.od.todoapp.models.tables

import org.jetbrains.exposed.dao.id.*
import org.jetbrains.exposed.sql.javatime.CurrentDateTime
import org.jetbrains.exposed.sql.javatime.datetime


const val MAX_VARCHAR_LENGTH = 128

object Tasks : IntIdTable() {
    val title = varchar("title", MAX_VARCHAR_LENGTH)
    val description = text("description")
    val isCompleted = bool("is_completed").default(false)
    val createdAt = datetime("created_at").defaultExpression(CurrentDateTime)
    val updatedAt = datetime("created_at").defaultExpression(CurrentDateTime)
}
