package com.example.navigation.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.OnConflictStrategy
import kotlinx.coroutines.flow.Flow


@Dao
interface RoutineDao {
    @Query("SELECT * FROM routine")
    fun selectAll(): Flow<List<Routine>>

    @Query("SELECT * FROM routine where title == :title")
    fun select(title: String): Routine

    @Query("UPDATE routine SET action = :action, title = :title where title == :title")
    fun updateRoutine(action: String, title: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(routine: Routine)

    @Query("DELETE FROM routine WHERE title = :title")
    suspend fun delete(title:String);
}