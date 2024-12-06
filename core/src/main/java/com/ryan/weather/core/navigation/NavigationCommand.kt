package com.ryan.weather.core.navigation

sealed interface NavigationCommand {
    object NavigateBack : NavigationCommand
    data class NavigateToRoute(
        val route: Route,
        val popUpTo: Route? = null,
        val inclusive: Boolean = false
    ) : NavigationCommand
}