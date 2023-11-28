package com.example.pesenin

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.pesenin.nav.NavItem
import com.example.pesenin.ui.screens.BottomNavigationBar
import com.example.pesenin.ui.screens.LihatDaftarMenu
import com.example.pesenin.ui.screens.homeScreen.Home
import com.example.pesenin.ui.screens.loginScreen.LoginScreen
import com.example.pesenin.ui.screens.loginScreen.LoginViewModel
import com.example.pesenin.ui.screens.loginScreen.SignUpScreen
import com.example.pesenin.ui.screens.menukantin.MenuKantin

enum class LoginRoutes{
    SignUp,
    SignIn
}

enum class HomeRoutes{
    Home,
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation(
    navController: NavHostController = rememberNavController(),
    loginViewModel: LoginViewModel
){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    Scaffold (
        modifier = Modifier.fillMaxWidth(),
        bottomBar =
        {
            if (currentDestination?.route != LoginRoutes.SignIn.name && currentDestination?.route != LoginRoutes.SignUp.name) {
                BottomNavigationBar(navController = navController)
            }
        }
    ) { _ ->
        NavHost(navController = navController, startDestination = LoginRoutes.SignIn.name) {
            composable(route = LoginRoutes.SignIn.name){
                LoginScreen(onNavToHomePage = {
                    navController.navigate(HomeRoutes.Home.name){
                        launchSingleTop = true
                        popUpTo(route = LoginRoutes.SignIn.name){
                            inclusive = true
                        }
                    }
                },
                    loginViewModel = loginViewModel

                ) {
                    navController.navigate(LoginRoutes.SignUp.name){
                        launchSingleTop = true
                        popUpTo(LoginRoutes.SignIn.name){
                            inclusive = true
                        }
                    }
                }
            }

            composable(route = LoginRoutes.SignUp.name){
                SignUpScreen(onNavToHomePage = {
                    navController.navigate(HomeRoutes.Home.name){
                        popUpTo(LoginRoutes.SignUp.name){
                            inclusive = true
                        }
                    }
                },
                    loginViewModel = loginViewModel
                ) {
                    navController.navigate(LoginRoutes.SignIn.name)
                }
            }

            composable(route = NavItem.Home.path){
                Home(loginViewModel = loginViewModel, navController)
            }

            composable(NavItem.Home.path) { Home(loginViewModel = LoginViewModel(), navController) }
            composable(NavItem.Restaurant.path) { MenuKantin() }
            composable(NavItem.Profile.path) { LihatDaftarMenu() }
        }
    }
}