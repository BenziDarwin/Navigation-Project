package com.example.navigation.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigation.components.screens.Favorites
import com.example.navigation.components.screens.Things

@Composable
fun BottomNavGraph(navController: NavHostController) {
NavHost(navController = navController,
    startDestination = BottomBarScreen.Favorites.route)
{
    composable(route = BottomBarScreen.Favorites.route) {
        Favorites()
    }
    composable(route = BottomBarScreen.Things.route) {
        Things()
    }
}
}