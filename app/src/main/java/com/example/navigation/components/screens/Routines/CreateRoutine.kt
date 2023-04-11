package com.example.navigation.components.screens.Routines

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CreateRoutine(
    navController: NavHostController,
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
                        text = "Create A Routine",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier.align(Alignment.Center)
                    )
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close",
                        tint = Color.Black,
                        modifier = Modifier.align(Alignment.CenterStart)
                    )

                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "Submit",
                        tint = Color.Black,
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
            }
        },
        content = {
            var title by remember { mutableStateOf(TextFieldValue("")) }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .padding(top = 10.dp),
            ) {
                Column( modifier = Modifier
                    .verticalScroll(rememberScrollState())
                ) {
                    TextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp),
                        value = title,
                        onValueChange = {
                            title = it
                        },
                        placeholder = { Text(text = "Routine Name") },
                    )
                    Text(
                        text = "When",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 30.sp)
                    Text(
                        text = "Want this event to run automatically? Add an event below.",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Gray)
                            .padding(20.dp)
                    )

                        Box(contentAlignment = Alignment.CenterStart) {
                            Text(text = "Add Event",

                                fontSize = 25.sp)
                            Spacer(
                                modifier = Modifier.width(20.dp)
                            )
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
                                    modifier = Modifier
                                        .size(35.dp)
                                        .align(Alignment.CenterEnd)
                                )
                            }
                    }

                }
            }
        }
    )
}