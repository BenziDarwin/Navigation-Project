package com.example.navigation.components.Modals

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun EventItem(
    eventItem: String,
    route: String? = null,
    navController: NavHostController? = null) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
        .padding(10.dp).clickable {
            if (route != null) {
                navController?.navigate(route)
            }
        }) {
        Text(text = eventItem, fontSize = 30.sp)
    }
}