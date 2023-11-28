package com.example.pesenin.ui.screens

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.pesenin.nav.NavItem

/**
 * Composable function that represents the bottom navigation bar of the application.
 *
 * @param navController The navigation controller used for handling navigation between screens.
 */
@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navItems = listOf(NavItem.Home, NavItem.Restaurant, NavItem.Profile)
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar(
        containerColor = Color.White,
        modifier = Modifier.height(60.dp)
    ){

        val manggoColor = Color(0xFFFF9800)
        navItems.forEachIndexed { _, item ->
            NavigationBarItem(
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = manggoColor,
                    unselectedIconColor = Color.Gray,
                    selectedTextColor = Color.Transparent,
                    unselectedTextColor = Color.Transparent,
                    indicatorColor = Color.White
                ),
                icon = {
                    Icon(imageVector = item.icon, contentDescription = "")
                       },
                label = { },
                selected = item.path == currentDestination?.route,
                onClick = {
                    navController.navigate(item.path) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) { saveState = true }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}