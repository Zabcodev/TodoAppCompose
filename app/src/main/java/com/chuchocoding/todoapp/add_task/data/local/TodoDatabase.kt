package com.chuchocoding.todoapp.add_task.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class TodoDatabase: RoomDatabase() {
    abstract fun taskDao(): TaskDao
}