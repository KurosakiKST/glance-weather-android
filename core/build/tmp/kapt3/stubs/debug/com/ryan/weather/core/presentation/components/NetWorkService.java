package com.ryan.weather.core.presentation.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ryan/weather/core/presentation/components/NetWorkService;", "", "()V", "API_KEY", "", "getAPI_KEY", "()Ljava/lang/String;", "BASE_URL", "getBASE_URL", "CITIES", "CURRENT_WEATHER", "FORECAST_WEATHER", "core_debug"})
public final class NetWorkService {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "https://api.weatherapi.com";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String API_KEY = "f500c2f4a97b47a5a86144643242408";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CURRENT_WEATHER = "/v1/current.json";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FORECAST_WEATHER = "/v1/forecast.json";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CITIES = "/v1/search.json";
    @org.jetbrains.annotations.NotNull
    public static final com.ryan.weather.core.presentation.components.NetWorkService INSTANCE = null;
    
    private NetWorkService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAPI_KEY() {
        return null;
    }
}