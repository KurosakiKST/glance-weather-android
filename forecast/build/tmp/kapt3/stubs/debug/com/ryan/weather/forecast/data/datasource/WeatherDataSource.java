package com.ryan.weather.forecast.data.datasource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J-\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ5\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/ryan/weather/forecast/data/datasource/WeatherDataSource;", "", "addCurrentWeather", "", "weather", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/CurrentWeatherEntity;", "(Lcom/ryan/weather/forecast/data/local/database/entity/weather/CurrentWeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addForecastDays", "forecastDays", "", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastDayEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addForecastWeather", "forecast", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherEntity;", "(Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addLocationWeather", "locationEntity", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/LocationWeatherEntity;", "(Lcom/ryan/weather/forecast/data/local/database/entity/weather/LocationWeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeather", "Lcom/ryan/weather/core/domain/utils/NetworkResult;", "Lcom/ryan/weather/forecast/domain/model/Weather;", "Lcom/ryan/weather/core/domain/utils/NetworkError;", "apiKey", "", "city", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForecastWeather", "Lcom/ryan/weather/forecast/domain/model/Forecast;", "days", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecast_debug"})
public abstract interface WeatherDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Weather, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getForecastWeather(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    java.lang.String city, int days, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Forecast, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addCurrentWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity weather, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addForecastWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.ForecastWeatherEntity forecast, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addLocationWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.LocationWeatherEntity locationEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addForecastDays(@org.jetbrains.annotations.NotNull
    java.util.List<com.ryan.weather.forecast.data.local.database.entity.weather.ForecastDayEntity> forecastDays, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}