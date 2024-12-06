package com.ryan.weather.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ryan.weather.core.navigation.NavigationCommand
import com.ryan.weather.core.navigation.NavigationManager
import com.ryan.weather.core.navigation.NavigationRegistry
import com.ryan.weather.core.navigation.Route
import kotlinx.coroutines.flow.collectLatest

@Composable
fun AppNavigation(
    navigationRegistry: NavigationRegistry,
    navigationManager: NavigationManager
) {
    val navController: NavHostController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()

    // Handle navigation commands from NavigationManager
    LaunchedEffect(navigationManager) {
        navigationManager.navigationCommands.collectLatest { command ->
            when (command) {
                is NavigationCommand.NavigateBack -> {
                    navController.popBackStack()
                }
                is NavigationCommand.NavigateToRoute -> {
                    val destinationRoute = command.route.route
                    if (command.popUpTo != null) {
                        navController.navigate(destinationRoute) {
                            popUpTo(command.popUpTo!!.route) {
                                inclusive = command.inclusive
                            }
                        }
                    } else {
                        navController.navigate(destinationRoute)
                    }
                }
            }
        }
    }

    // Define navigation graph using destinations from NavigationRegistry
    NavHost(
        navController = navController,
        startDestination = Route.Welcome.route
    ) {
        navigationRegistry.destinations.forEach { destination ->
            composable(destination.route.route) {
                destination.Content(navigationManager)
            }
        }
    }
}
