package com.example.navigation.components

import androidx.compose.runtime.Composable

data class TabRowItem(
    val title: String,
    val screen: @Composable () -> Unit,
)