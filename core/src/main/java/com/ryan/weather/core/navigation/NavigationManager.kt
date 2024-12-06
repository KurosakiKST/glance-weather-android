package com.ryan.weather.core.navigation

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigationManager @Inject constructor() {
    private val _navigationCommands = MutableSharedFlow<NavigationCommand>()
    val navigationCommands = _navigationCommands.asSharedFlow()

    suspend fun navigate(command: NavigationCommand) {
        _navigationCommands.emit(command)
    }
}