package com.ryan.weather.core.navigation

sealed class Route(val route: String) {
    object Welcome : Route("welcome")
    object Home : Route("home")

    companion object {
        fun fromRoute(route: String): Route? {
            return when(route) {
                Welcome.route -> Welcome
                Home.route -> Home
                else -> null
            }
        }
    }
}