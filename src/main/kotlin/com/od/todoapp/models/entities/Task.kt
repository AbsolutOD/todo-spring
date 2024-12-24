package com.od.todoapp.models.entities

import com.od.todoapp.models.tables.Tasks
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID


class TaskEntity(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<TaskEntity>(Tasks)
    var sequelId by Tasks.id
    var title by Tasks.title
    var description by Tasks.description
    var isCompleted by Tasks.isCompleted
    var createdAt by Tasks.createdAt
    var updatedAt by Tasks.updatedAt
}
