package com.od.todoapp

import org.jetbrains.exposed.spring.autoconfigure.ExposedAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.jetbrains.exposed.sql.*
import org.springframework.boot.autoconfigure.ImportAutoConfiguration

@SpringBootApplication
@ImportAutoConfiguration(ExposedAutoConfiguration::class)
class TodoAppApplication

fun main(args: Array<String>) {
//    Database.connect(
//        "jdbc:postgresql://localhost:5432/todo_app",
//        driver = "org.postgresql.Driver",
//        user = "todo_app",
//        password = "l3tm31n"
//    )
    runApplication<TodoAppApplication>(*args)
}
