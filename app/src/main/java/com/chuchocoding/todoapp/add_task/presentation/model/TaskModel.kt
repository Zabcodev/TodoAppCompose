package com.chuchocoding.todoapp.add_task.presentation.model

data class TaskModel(
    val id: Int = System.currentTimeMillis().hashCode(),
    val task: String,
    val selected: Boolean = false
)
