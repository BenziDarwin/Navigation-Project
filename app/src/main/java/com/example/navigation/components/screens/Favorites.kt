package com.example.navigation.components.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.navigation.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Favorites() {
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
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "Favorites Icon",
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .fillMaxWidth()
                        .padding(20.dp)
                )
                Text(
                    text = "No Favorites",
                    fontSize = MaterialTheme.typography.h4.fontSize,
                    fontWeight = FontWeight.Light,
                    color = Color.Black
                )
            }
        }
    )

}