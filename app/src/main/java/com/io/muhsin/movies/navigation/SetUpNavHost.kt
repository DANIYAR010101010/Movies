package com.io.muhsin.movies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.io.muhsin.movies.screens.DetailsScreen
import com.io.muhsin.movies.screens.MainScreen
import com.io.muhsin.movies.screens.SplashScreen

sealed class Screens(val route: String) {
    object MainScreen : Screens("main_screen")
    object SplashScreen : Screens("splash_screen")
    object DetailsScreen : Screens("details_screen")
}

@Composable
fun SetUpNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.SplashScreen.route) {
        composable(Screens.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(Screens.MainScreen.route) {
            MainScreen()
        }
        composable(Screens.DetailsScreen.route) {
            DetailsScreen()
        }
    }
}