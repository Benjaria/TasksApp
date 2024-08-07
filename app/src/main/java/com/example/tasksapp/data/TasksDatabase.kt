package com.example.tasksapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1, exportSchema = false)
abstract class TasksDatabase: RoomDatabase() {
    abstract fun taskDao(): TaskDao

}