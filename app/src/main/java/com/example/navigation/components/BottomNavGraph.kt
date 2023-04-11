package com.example.navigation.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigation.components.screens.*
import com.example.navigation.components.screens.Routines.*

@Composable
fun BottomNavGraph(navController: NavHostController) {
NavHost(navController = navController,
    startDestination = BottomBarScreen.Favorites.route)
{
    composable(route = BottomBarScreen.Favorites.route) {
        Favorites(navController)
    }
    composable(route = BottomBarScreen.Things.route) {
        Things(navController)
    }
    composable(route = BottomBarScreen.Routines.route) {
        Routines(navController)
    }
    composable(route = BottomBarScreen.Ideas.route) {
        Ideas(navController)
    }
    composable(route = BottomBarScreen.Settings.route) {
        Settings(navController)
    }
    composable(route = Screens.SelectRoutine.route) {
        SelectRoutine(navController)
    }

    composable(route = Screens.CreateRoutine.route) {
        CreateRoutine(navController)
    }
    composable(route = Screens.SelectEvent.route) {
        SelectEvent(navController)
    }
    composable(route = Screens.CreateRoutineDatePick.route) {
        CreateRoutine(navController = navController, pickDate = true)
    }
    composable(route = Screens.CreateThing.route) {
        CreateThing(navController)
    }
    composable(route = Screens.Thing.route) {
        Thing(navController)
    }
    composable(route = Screens.ThingSelect.route) {
        ThingSelect(navController)
    }
}
}