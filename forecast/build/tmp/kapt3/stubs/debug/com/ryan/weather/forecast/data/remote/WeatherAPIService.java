package com.ryan.weather.forecast.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/ryan/weather/forecast/data/remote/WeatherAPIService;", "", "getCurrentWeather", "Lretrofit2/Response;", "Lcom/ryan/weather/forecast/data/remote/dto/WeatherDto;", "apiKey", "", "city", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForeCastWeather", "Lcom/ryan/weather/forecast/data/remote/dto/ForecastDto;", "days", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecast_debug"})
public abstract interface WeatherAPIService {
    
    @retrofit2.http.GET(value = "/v1/current.json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCurrentWeather(@retrofit2.http.Query(value = "key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.ryan.weather.forecast.data.remote.dto.WeatherDto>> $completion);
    
    @retrofit2.http.GET(value = "/v1/forecast.json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getForeCastWeather(@retrofit2.http.Query(value = "key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull
    java.lang.String city, @retrofit2.http.Query(value = "days")
    int days, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.ryan.weather.forecast.data.remote.dto.ForecastDto>> $completion);
}