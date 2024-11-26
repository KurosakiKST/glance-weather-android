package com.ryan.weather.forecast.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J-\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ5\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/ryan/weather/forecast/data/remote/WeatherRemoteDataSource;", "Lcom/ryan/weather/forecast/data/datasource/WeatherDataSource;", "weatherAPIService", "Lcom/ryan/weather/forecast/data/remote/WeatherAPIService;", "(Lcom/ryan/weather/forecast/data/remote/WeatherAPIService;)V", "addCurrentWeather", "", "weather", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/CurrentWeatherEntity;", "(Lcom/ryan/weather/forecast/data/local/database/entity/weather/CurrentWeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addForecastDays", "forecastDays", "", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastDayEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addForecastWeather", "forecast", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherEntity;", "(Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addLocationWeather", "locationEntity", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/LocationWeatherEntity;", "(Lcom/ryan/weather/forecast/data/local/database/entity/weather/LocationWeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeather", "Lcom/ryan/weather/core/domain/utils/NetworkResult;", "Lcom/ryan/weather/forecast/domain/model/Weather;", "Lcom/ryan/weather/core/domain/utils/NetworkError;", "apiKey", "", "city", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForecastWeather", "Lcom/ryan/weather/forecast/domain/model/Forecast;", "days", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecast_debug"})
public final class WeatherRemoteDataSource implements com.ryan.weather.forecast.data.datasource.WeatherDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.data.remote.WeatherAPIService weatherAPIService = null;
    
    @javax.inject.Inject
    public WeatherRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.remote.WeatherAPIService weatherAPIService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Weather, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getForecastWeather(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    java.lang.String city, int days, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Forecast, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addCurrentWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity weather, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addForecastWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.ForecastWeatherEntity forecast, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addLocationWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.LocationWeatherEntity locationEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addForecastDays(@org.jetbrains.annotations.NotNull
    java.util.List<com.ryan.weather.forecast.data.local.database.entity.weather.ForecastDayEntity> forecastDays, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}