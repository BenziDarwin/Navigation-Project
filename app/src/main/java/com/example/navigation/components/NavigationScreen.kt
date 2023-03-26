package com.example.navigation.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NavigationScreen() {
    val navController = rememberNavController()
Scaffold(
    topBar = {
        TopAppBar(backgroundColor = Color.Yellow) {
            // this is row scope
            // add your layout here
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "My Smart Home",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            }
        }
    },
    bottomBar = {BottomBar(navController = navController)}) {
    BottomNavGraph(navController = navController)

}
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Favorites,
        BottomBarScreen.Things,
        BottomBarScreen.Routines,
        BottomBarScreen.Ideas,
        BottomBarScreen.Settings
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    
    BottomNavigation(backgroundColor = Color.Yellow) {
        screens.forEach{screen ->
    AddItem(screen = screen, currentDestination = currentDestination, navController = navController)
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
BottomNavigationItem(
    label = {
        Text(text = screen.title)
            },
    icon = {
        Icon(imageVector = screen.icon, contentDescription = "Navigation icon")
    },
    selected = currentDestination?.hierarchy?.any {
        it.route == screen.route
    } == true,
    onClick = {
        if( screen.title == "Favorites" || screen.title == "Things") {
            navController.navigate(screen.route)
        }
    }
)
}