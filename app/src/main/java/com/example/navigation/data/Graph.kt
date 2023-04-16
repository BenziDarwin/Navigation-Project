package com.example.navigation.data

import android.content.Context

object Graph {
    lateinit var database: RoutineDatabase
    private set
    val routineRepo by lazy {
        RoutineDataSource(database.routineDao())
    }

    fun provide(context: Context) {
        database = RoutineDatabase.getDatabase(context)
    }
}