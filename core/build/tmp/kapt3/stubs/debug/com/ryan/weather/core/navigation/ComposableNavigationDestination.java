package com.ryan.weather.core.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/ryan/weather/core/navigation/ComposableNavigationDestination;", "Lcom/ryan/weather/core/navigation/NavigationDestination;", "Content", "", "navController", "Landroidx/navigation/NavHostController;", "core_debug"})
public abstract interface ComposableNavigationDestination extends com.ryan.weather.core.navigation.NavigationDestination {
    
    @androidx.compose.runtime.Composable
    public abstract void Content(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController);
}