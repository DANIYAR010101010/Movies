package com.io.muhsin.movies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.io.muhsin.movies.MainViewModel
import com.io.muhsin.movies.screens.DetailsScreen
import com.io.muhsin.movies.screens.MainScreen
import com.io.muhsin.movies.screens.SplashScreen

sealed class Screens(val route: String) {
    object MainScreen : Screens("main_screen")
    object SplashScreen : Screens("splash_screen")
    object DetailsScreen : Screens("details_screen")
}

@Composable
fun SetUpNavHost(navController: NavHostController,viewModel: MainViewModel) {
    NavHost(navController = navController, startDestination = Screens.SplashScreen.route) {
        composable(Screens.SplashScreen.route) {
            SplashScreen(navController =navController,viewModel =viewModel)
        }
        composable(Screens.MainScreen.route) {
            MainScreen(navController =navController,viewModel =viewModel)
        }
        composable(Screens.DetailsScreen.route+"/{Id}") { backStackEntry ->
                DetailsScreen(navController = navController, viewModel = viewModel,
                    itemId = backStackEntry.arguments?.getString("Id")?: "1")
            }
        }
    }
