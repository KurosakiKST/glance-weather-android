package com.ryan.weather.forecast.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/ryan/weather/forecast/domain/repository/WeatherRepository;", "", "getCurrentWeather", "Lcom/ryan/weather/core/domain/utils/NetworkResult;", "Lcom/ryan/weather/forecast/domain/model/Weather;", "Lcom/ryan/weather/core/domain/utils/NetworkError;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForeCastWeather", "Lcom/ryan/weather/forecast/domain/model/Forecast;", "days", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecast_debug"})
public abstract interface WeatherRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Weather, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getForeCastWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, int days, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Forecast, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion);
}