package com.example.navigation.components.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.example.navigation.R
import com.example.navigation.components.Modals.MenuItem
import com.example.navigation.components.Modals.MenuTitle

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Settings() {
    Scaffold(
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
                    MenuItem(icon = Icons.Default.Person, title = "Accounts & Hubs", subtitle = null, iconColor = Color.Yellow, iconBackground = null)
                    Spacer(modifier = Modifier.height(2.dp))
                    MenuItem(icon = Icons.Default.Face, title = "Clients", subtitle = null, iconColor = Color.Yellow, iconBackground = null)
                    Spacer(modifier = Modifier.height(2.dp))
                    MenuItem(icon = Icons.Default.Place, title = "Locations", subtitle = null, iconColor = Color.Yellow, iconBackground = null)
                    MenuTitle(title = "Voice")
                    MenuItem(icon = Icons.Default.Call, title = "Voice Assistants", subtitle = null, iconColor = Color.Yellow, iconBackground = null)
                    MenuTitle(title = "App Permissions")
                    MenuItem(icon = Icons.Default.Settings, title = "Notifications", subtitle = null, iconColor = Color.Black, iconBackground = null)
                }
            }
        }
    )

}