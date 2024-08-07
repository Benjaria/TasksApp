package com.example.tasksapp.domain

import com.example.tasksapp.data.TaskRepository
import com.example.tasksapp.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(
    private val taskRepository: TaskRepository
){
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks

}