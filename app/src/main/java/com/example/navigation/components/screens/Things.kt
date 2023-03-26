package com.example.navigation.components.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.navigation.R


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Things() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /* ... */ }, modifier = Modifier.padding(vertical = 60.dp)) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        },

        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.things),
                    contentDescription = "Things Icon",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .fillMaxWidth()
                        .padding(20.dp)
                )
                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "No Things",
                        fontSize = MaterialTheme.typography.h4.fontSize,
                        fontWeight = FontWeight.Light,
                        color = Color.Black
                    )
                    Text(
                        text = "Looks like we didn't discover any devices!",
                        fontSize = MaterialTheme.typography.h5.fontSize,
                        fontWeight = FontWeight.Light,
                        color = Color.LightGray,
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Try an option below.",
                        fontSize = MaterialTheme.typography.h5.fontSize,
                        fontWeight = FontWeight.Light,
                        color = Color.LightGray
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Box( modifier = Modifier.clip(CircleShape).background(Color.Blue)) {
                            Icon(imageVector = Icons.Default.Search, contentDescription = "Search icon")
                        }
                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "Run discovery",
                            fontSize = MaterialTheme.typography.h4.fontSize,
                            fontWeight = FontWeight.Light,
                            color = Color.Blue,
                        )
                    }
                }

            }
        })
}