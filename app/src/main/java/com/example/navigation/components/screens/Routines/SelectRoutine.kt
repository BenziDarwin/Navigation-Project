package com.example.navigation.components.screens.Routines

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SelectRoutine(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Yellow,
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = "Select A Routine",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier.align(Alignment.Center)
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterStart).clickable { navController.popBackStack() }
                    )
                }
            }
        },
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White).padding(top = 10.dp, start = 10.dp),
            ) {
                Row {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                        .clip(CircleShape)
                        .size(40.dp)
                        .clickable { navController.navigate("createroutine") }
                        .background(Color.Blue)
                    ){
                        Icon(
                            imageVector = Icons.Default.Add, 
                            contentDescription = "Add Routine",
                            tint = Color.White,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    Spacer(
                        modifier = Modifier.width(20.dp)
                    )
                    Text(
                        text = "Create a new Routine",
                        color = Color.Black,
                    fontSize = 30.sp)
                }
            }
        }
    )
}