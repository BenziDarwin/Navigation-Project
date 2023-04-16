package com.example.navigation.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Routine(
    val event: String = "",
    val action: String? = null,
    @PrimaryKey
    val title: String
)
