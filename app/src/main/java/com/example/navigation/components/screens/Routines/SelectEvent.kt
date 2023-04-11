package com.example.navigation.components.screens.Routines

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navigation.components.Modals.EventItem

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SelectEvent(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Yellow
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = "Create A Routine",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier.align(Alignment.Center)
                    )

                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.Black,
                        modifier = Modifier.align(Alignment.CenterStart)
                    )
                }
            }
        },
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
            ){
                Column(modifier = Modifier
                    .padding()
                    .verticalScroll(rememberScrollState())) {
                    EventItem(eventItem = "The time is Time.", route = "createroutinedatepick", navController = navController)
                    Spacer(modifier = Modifier.height(5.dp))
                    EventItem(eventItem = "It's sunset at Location.")
                    Spacer(modifier = Modifier.height(5.dp))
                    EventItem(eventItem = "It's sunrise at Location.")
                    Spacer(modifier = Modifier.height(5.dp))
                    EventItem(eventItem = "It's 15 minutes before sunrise at Location.")
                    Spacer(modifier = Modifier.height(5.dp))
                    EventItem(eventItem = "It's 15 minutes after sunrise at Location.")
                    Spacer(modifier = Modifier.height(5.dp))
                    EventItem(eventItem = "It's 15 minutes before sunset at Location.")
                    Spacer(modifier = Modifier.height(5.dp))
                    EventItem(eventItem = "It's 15 minutes after sunset at Location.")


                }
            }
        }
    )
}