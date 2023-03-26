package com.example.navigation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    var route: String,
    var title: String,
    val icon: ImageVector,
){
    object Favorites: BottomBarScreen(
        route = "favorites",
        title = "Favorites",
        icon = Icons.Default.FavoriteBorder,
    )
    object Things: BottomBarScreen(
        route = "things",
        title = "Things",
        icon = Icons.Default.List,
    )
    object Routines: BottomBarScreen(
        route = "routines",
        title = "Routines",
        icon = Icons.Default.Refresh,
    )
    object Ideas: BottomBarScreen(
        route = "ideas",
        title = "Ideas",
        icon = Icons.Default.Search,
    )
    object Settings: BottomBarScreen(
        route = "settings",
        title = "Settings",
        icon = Icons.Default.Settings,
    )
}
