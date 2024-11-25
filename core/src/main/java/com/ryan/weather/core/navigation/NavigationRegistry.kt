package com.ryan.weather.core.navigation

object NavigationRegistry {
    private val destinations = mutableSetOf<ComposableNavigationDestination>()

    fun addDestination(destination: ComposableNavigationDestination) {
        destinations.add(destination)
    }

    fun getDestination(route: String): ComposableNavigationDestination? {
        return destinations.find { it.route == route }
    }
}