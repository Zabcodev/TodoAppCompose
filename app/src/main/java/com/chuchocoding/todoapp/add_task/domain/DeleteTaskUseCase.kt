package com.chuchocoding.todoapp.add_task.domain

import com.chuchocoding.todoapp.add_task.data.local.TaskRepository
import com.chuchocoding.todoapp.add_task.presentation.model.TaskModel
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.delete(taskModel)
    }

}