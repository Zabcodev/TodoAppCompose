package com.chuchocoding.todoapp.add_task.presentation

import com.chuchocoding.todoapp.add_task.presentation.model.TaskModel

sealed interface TaskUiState {
    data object Loading: TaskUiState
    data class Error(val throwable: Throwable)
    data class Success(val task: List<TaskModel>): TaskUiState
}