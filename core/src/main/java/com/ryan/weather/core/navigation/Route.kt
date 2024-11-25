package com.ryan.weather.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Route() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.SplashScreen.route) {
        NavigationRegistry.getDestination(Routes.SplashScreen.route)?.let { destination ->
            composable(destination.route) {
                destination.Content(navController)
            }
        }

        NavigationRegistry.getDestination(Routes.HomeScreen.route)?.let { destination ->
            composable(destination.route) {
                destination.Content(navController)
            }
        }

        NavigationRegistry.getDestination(Routes.DetailScreen.route)?.let { destination ->
            composable(destination.route) {
                destination.Content(navController)
            }
        }
    }
}
sealed class Routes(val route: String) {
    object SplashScreen : Routes("splashScreen")

    object HomeScreen : Routes("homeScreen")

    object DetailScreen: Routes("detailScreen")
}