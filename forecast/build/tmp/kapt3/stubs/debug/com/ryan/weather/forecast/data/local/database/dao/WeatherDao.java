package com.ryan.weather.forecast.data.local.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/ryan/weather/forecast/data/local/database/dao/WeatherDao;", "", "getCurrentWeather", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/CurrentWeatherEntity;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForecastWeather", "Lcom/ryan/weather/forecast/data/local/database/dao/ForecastWithDays;", "getForecastWeatherWithDays", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherWithDays;", "getLocationWeather", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/LocationWeatherEntity;", "getWeather", "insertCurrentWeather", "", "currentWeather", "(Lcom/ryan/weather/forecast/data/local/database/entity/weather/CurrentWeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertForecastDays", "forecastDays", "", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastDayEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertForecastWeather", "forecastWeather", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherEntity;", "(Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocationWeather", "locationWeather", "(Lcom/ryan/weather/forecast/data/local/database/entity/weather/LocationWeatherEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWeather", "weather", "forecast_debug"})
@androidx.room.Dao
public abstract interface WeatherDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity weather, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM weather WHERE city = :city")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertForecastWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.ForecastWeatherEntity forecastWeather, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertForecastDays(@org.jetbrains.annotations.NotNull
    java.util.List<com.ryan.weather.forecast.data.local.database.entity.weather.ForecastDayEntity> forecastDays, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction
    @androidx.room.Query(value = "SELECT * FROM forecast_weather WHERE city = :city")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getForecastWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.forecast.data.local.database.dao.ForecastWithDays> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertLocationWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.LocationWeatherEntity locationWeather, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM location_weather WHERE city = :city")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getLocationWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.forecast.data.local.database.entity.weather.LocationWeatherEntity> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertCurrentWeather(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity currentWeather, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM weather WHERE city = :city")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity> $completion);
    
    @androidx.room.Transaction
    @androidx.room.Query(value = "SELECT * FROM forecast_weather WHERE city = :city")
    @org.jetbrains.annotations.NotNull
    public abstract com.ryan.weather.forecast.data.local.database.entity.weather.ForecastWeatherWithDays getForecastWeatherWithDays(@org.jetbrains.annotations.NotNull
    java.lang.String city);
}