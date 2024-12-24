package com.od.todoapp.services

import com.od.todoapp.models.entities.TaskEntity

class TaskService {

    fun findTaskById(id: Int): TaskEntity? {
        return TaskEntity.findById(id)
    }
}