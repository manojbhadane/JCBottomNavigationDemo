package com.jcbottomnavigationdemo.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.List
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(var route: String, val icon: ImageVector?, var title: String) {
    object Home : NavigationItem("Home", Icons.Rounded.Home, "Home")
    object History : NavigationItem("History", Icons.Rounded.List, "History")
    object Profile : NavigationItem("Profile", Icons.Rounded.Info, "Profile")
}
