package com.ryan.weather.core.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/ryan/weather/core/navigation/Routes;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "DetailScreen", "HomeScreen", "SplashScreen", "Lcom/ryan/weather/core/navigation/Routes$DetailScreen;", "Lcom/ryan/weather/core/navigation/Routes$HomeScreen;", "Lcom/ryan/weather/core/navigation/Routes$SplashScreen;", "core_debug"})
public abstract class Routes {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    
    private Routes(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ryan/weather/core/navigation/Routes$DetailScreen;", "Lcom/ryan/weather/core/navigation/Routes;", "()V", "core_debug"})
    public static final class DetailScreen extends com.ryan.weather.core.navigation.Routes {
        @org.jetbrains.annotations.NotNull
        public static final com.ryan.weather.core.navigation.Routes.DetailScreen INSTANCE = null;
        
        private DetailScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ryan/weather/core/navigation/Routes$HomeScreen;", "Lcom/ryan/weather/core/navigation/Routes;", "()V", "core_debug"})
    public static final class HomeScreen extends com.ryan.weather.core.navigation.Routes {
        @org.jetbrains.annotations.NotNull
        public static final com.ryan.weather.core.navigation.Routes.HomeScreen INSTANCE = null;
        
        private HomeScreen() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ryan/weather/core/navigation/Routes$SplashScreen;", "Lcom/ryan/weather/core/navigation/Routes;", "()V", "core_debug"})
    public static final class SplashScreen extends com.ryan.weather.core.navigation.Routes {
        @org.jetbrains.annotations.NotNull
        public static final com.ryan.weather.core.navigation.Routes.SplashScreen INSTANCE = null;
        
        private SplashScreen() {
        }
    }
}