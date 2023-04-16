package com.example.navigation.components

import android.app.Application
import com.example.navigation.data.Graph

class RoutineApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}