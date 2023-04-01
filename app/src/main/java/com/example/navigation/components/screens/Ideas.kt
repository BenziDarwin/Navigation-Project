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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.navigation.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ideas() {
    Scaffold(
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray),
            ) {
                Text(
                    text = "More Recommendations",
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(start = 5.dp),
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Even more recommendations!",
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(start = 5.dp, top = 30.dp),
                    fontSize = MaterialTheme.typography.h6.fontSize
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.tree),
                        contentDescription = "Tree",
                        modifier = Modifier.padding(top = 80.dp)
                    )
                    Text(
                        text = "Thanksgiving Dinner Ready",
                        color = Color.White,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .padding(start = 10.dp, top = 80.dp),
                        fontSize = MaterialTheme.typography.h4.fontSize
                    )
                    Text(
                        text = "Send me a notification",
                        color = Color.White,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .padding(start = 10.dp, top = 180.dp),
                        fontSize = MaterialTheme.typography.h6.fontSize
                    )

                }

            }
        }
    )

}