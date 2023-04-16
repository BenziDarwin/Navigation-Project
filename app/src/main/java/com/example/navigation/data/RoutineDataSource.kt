package com.example.navigation.data

import kotlinx.coroutines.Dispatchers

class RoutineDataSource(private val routineDao: RoutineDao){
    val selectAll = routineDao.selectAll()


    suspend fun select(routine: Routine):Routine{
        Dispatchers.IO.apply {
            return routineDao.select(routine.title)
        }
    }

    suspend fun insertRoutine(title: String, event: String = ""){
        Dispatchers.IO.apply {
            val routine = Routine(title =  title, event = event)
            routineDao.insert(routine)
        }
    }
    suspend fun deleteRoutine(routine: Routine){
        Dispatchers.IO.apply {
            routineDao.delete(routine.title)
        }
    }

    suspend fun updateRoutine(title: String, event: String){
        Dispatchers.IO.apply {
            val routine = Routine(title =  title, event = event)
            routineDao.updateRoutine(routine.action!!,routine.title)
        }
    }
}