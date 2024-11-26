package com.ryan.weather.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Route() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.WelcomeScreen.route) {
        NavigationRegistry.getDestination(Routes.WelcomeScreen.route)?.let { destination ->
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
    object WelcomeScreen : Routes("welcomeScreen")

    object HomeScreen : Routes("homeScreen")

    object DetailScreen: Routes("detailScreen")
}