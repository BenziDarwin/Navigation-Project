package com.example.navigation.components.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navigation.R
import com.example.navigation.components.Modals.MenuItem
import com.example.navigation.components.Modals.MenuTitle

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Settings(navController: NavHostController) {
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
                        text = "My Smart Home",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        modifier = Modifier.align(Alignment.Center)
                    )
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "Menu",
                        tint = Color.Black,
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )
                }
            }
        },
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray),
            ) {
                Column() {
                    MenuTitle(title = "User Settings")
                    MenuItem(icon = Icons.Default.Person, title = "Moses", subtitle = "kmntanda@gmail.com", iconColor = Color.White, iconBackground = Color.Yellow)
                    MenuTitle(title = "Home Settings")
                    MenuItem(icon = Icons.Default.Person, title = "Accounts & Hubs", iconColor = Color.Yellow)
                    Spacer(modifier = Modifier.height(2.dp))
                    MenuItem(icon = Icons.Default.Face, title = "Clients", iconColor = Color.Yellow)
                    Spacer(modifier = Modifier.height(2.dp))
                    MenuItem(icon = Icons.Default.Place, title = "Locations", iconColor = Color.Yellow)
                    MenuTitle(title = "Voice")
                    MenuItem(icon = Icons.Default.Call, title = "Voice Assistants", iconColor = Color.Yellow)
                    MenuTitle(title = "App Permissions")
                    MenuItem(icon = Icons.Default.Settings, title = "Notifications", iconColor = Color.Black)
                }
            }
        }
    )

}