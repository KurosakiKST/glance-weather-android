package com.ryan.weather.core.navigation

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigationRegistry @Inject constructor() {
    private val _destinations = mutableSetOf<NavigationDestination>()
    val destinations: Set<NavigationDestination> = _destinations

    fun register(destination: NavigationDestination) {
        _destinations.add(destination)
    }

    fun getDestination(route: Route): NavigationDestination? {
        return destinations.find { it.route == route }
    }
}