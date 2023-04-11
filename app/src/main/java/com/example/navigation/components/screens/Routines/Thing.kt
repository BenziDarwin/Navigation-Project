package com.example.navigation.components.screens.Routines

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Thing(
    navController: NavHostController
) {
    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier
            .padding(top = 5.dp, start = 5.dp)
            .clickable { navController.navigate("thingselect") }
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(imageVector = Icons.Default.Info, contentDescription = "Notifications")
            Text(text = "Notifications", fontSize = 30.sp)
        }
    }
}