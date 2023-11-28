package com.example.pesenin.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Restaurant

sealed class NavItem {
    object Home :
        Item(path = NavPath.HOME.toString(), icon = Icons.Outlined.Home)

    object Restaurant :
        Item(path = NavPath.RESTAURANT.toString(), icon = Icons.Outlined.Restaurant)

    object Profile :
        Item(path = NavPath.PROFILE.toString(), icon = Icons.Outlined.AccountCircle)
}