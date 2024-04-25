package com.chuchocoding.todoapp.add_task.domain

import com.chuchocoding.todoapp.add_task.data.local.TaskRepository
import com.chuchocoding.todoapp.add_task.presentation.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.task

}