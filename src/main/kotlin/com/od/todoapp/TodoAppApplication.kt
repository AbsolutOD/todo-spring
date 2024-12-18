package com.od.todoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.jetbrains.exposed.sql.*

@SpringBootApplication
class TodoAppApplication

fun main(args: Array<String>) {
    Database.connect(
        "jdbc:postgresql://localhost:5432/todo",
        driver = "org.postgresql.Driver",
        user = "todo_app",
        password = "l3tm31n"
    )
    runApplication<TodoAppApplication>(*args)
}
