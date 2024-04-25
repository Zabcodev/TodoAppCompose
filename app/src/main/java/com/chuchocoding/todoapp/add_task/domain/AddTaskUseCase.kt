package com.chuchocoding.todoapp.add_task.domain

import com.chuchocoding.todoapp.add_task.data.local.TaskRepository
import com.chuchocoding.todoapp.add_task.presentation.model.TaskModel
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val todoRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        todoRepository.add(taskModel)
    }

}