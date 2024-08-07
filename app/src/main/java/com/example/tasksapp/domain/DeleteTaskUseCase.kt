package com.example.tasksapp.domain

import com.example.tasksapp.data.TaskRepository
import com.example.tasksapp.ui.model.TaskModel
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel){
        taskRepository.delete(taskModel)
    }
}