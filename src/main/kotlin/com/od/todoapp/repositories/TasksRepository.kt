package com.od.todoapp.repositories

import com.od.todoapp.models.entities.TaskEntity
import com.od.todoapp.models.tables.Tasks
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Repository

@Repository
class TasksRepository {
    fun findById(id: Int): TaskEntity? = transaction {
        Tasks.select( TaskEntity.sequelId  )
            .firstOrNull()
    }
}