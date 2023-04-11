package com.example.navigation.components.screens.Routines

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Thing(
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 5.dp, start = 5.dp)
            .clickable { navController.navigate("thingselect") }
    ){
        Column() {
            Icon(imageVector = Icons.Default.Info, contentDescription = "Notifications")
            Text(text = "Notifications", fontSize = 30.sp)
        }
    }
}