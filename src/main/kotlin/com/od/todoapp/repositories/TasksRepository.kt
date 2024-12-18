package com.od.todoapp.repositories

import com.od.todoapp.models.entities.Task
import com.od.todoapp.models.tables.Tasks
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Repository

@Repository
class TasksRepository {
    fun findById(id: Int): Task? = transaction {
        Tasks.select( Tasks.id eq id )
            .map { Task(it[Tasks.id], it[Tasks.title], it[Tasks.description], it[Tasks.isCompleted]) }
            .firstOrNull()
    }
}