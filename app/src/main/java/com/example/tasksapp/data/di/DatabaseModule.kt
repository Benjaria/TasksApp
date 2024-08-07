package com.example.tasksapp.data.di

import android.content.Context
import androidx.room.Room
import com.example.tasksapp.data.TaskDao
import com.example.tasksapp.data.TasksDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Provides
    @Singleton
    fun provideTasksDatabase(@ApplicationContext appContext: Context): TasksDatabase{
        return Room.databaseBuilder(appContext, TasksDatabase::class.java, "TasksDatabase").build()
    }

    @Provides
    fun provideTaskDao(tasksDatabase: TasksDatabase): TaskDao{
        return tasksDatabase.taskDao()

    }
}