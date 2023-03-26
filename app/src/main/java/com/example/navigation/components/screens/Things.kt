package com.example.navigation.components.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MoreVert
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
                        .padding(20.dp).size(150.dp)
                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        text = "No Things!",
                        fontSize = MaterialTheme.typography.h4.fontSize,
                        fontWeight = FontWeight.Light,
                        color = Color.Black
                    )
                    Text(
                        text = "Looks like we didn't discover any devices!",
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Light,
                        color = Color.Gray,
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Try an option below.",
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Light,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Row(
                        modifier = Modifier
                            .align(Alignment.Start)
                    ){
                        Box( modifier = Modifier
                            .clip(CircleShape)
                            .background(Color.Blue)
                            .size(35.dp),
                            contentAlignment = Alignment.Center) {
                            Icon(imageVector = Icons.Default.Search, contentDescription = "Search icon")
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Run discovery",
                            fontSize = MaterialTheme.typography.h6.fontSize,
                            fontWeight = FontWeight.Light,
                            color = Color.Blue,
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier
                            .align(Alignment.Start)
                    ){
                        Box( modifier = Modifier
                            .clip(CircleShape)
                            .background(Color.Blue)
                            .size(35.dp),
                            contentAlignment = Alignment.Center) {
                            Icon(imageVector = Icons.Default.Add, contentDescription = "Search icon")
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Add a Cloud Account",
                            fontSize = MaterialTheme.typography.h6.fontSize,
                            fontWeight = FontWeight.Light,
                            color = Color.Blue,
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier
                            .align(Alignment.Start)
                    ){
                        Box( modifier = Modifier
                            .clip(CircleShape)
                            .background(Color.Blue)
                            .size(35.dp),
                        contentAlignment = Alignment.Center) {
                            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Search icon")
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "View our supported devices.",
                            fontSize = MaterialTheme.typography.h6.fontSize,
                            fontWeight = FontWeight.Light,
                            color = Color.Blue,
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier
                            .align(Alignment.Start)
                    ){
                        Box( modifier = Modifier
                            .clip(CircleShape)
                            .background(Color.Blue)
                            .size(35.dp),
                            contentAlignment = Alignment.Center) {
                            Icon(imageVector = Icons.Default.Email, contentDescription = "Search icon")
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Contact Support",
                            fontSize = MaterialTheme.typography.h6.fontSize,
                            fontWeight = FontWeight.Light,
                            color = Color.Blue,
                        )
                    }
                }

            }
        })
}