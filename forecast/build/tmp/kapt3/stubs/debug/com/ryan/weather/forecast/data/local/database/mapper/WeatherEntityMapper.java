package com.ryan.weather.forecast.data.local.database.mapper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\n\u0010\u0003\u001a\u00020\n*\u00020\u000bJ\n\u0010\u0003\u001a\u00020\f*\u00020\rJ\n\u0010\u0003\u001a\u00020\u000e*\u00020\u000fJ\n\u0010\u0003\u001a\u00020\u0010*\u00020\u0011J\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\n\u0010\u0003\u001a\u00020\u0007*\u00020\u0013J\n\u0010\u0014\u001a\u00020\u000b*\u00020\nJ\u0012\u0010\u0014\u001a\u00020\r*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\n\u0010\u0014\u001a\u00020\u000f*\u00020\u000eJ\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017J\n\u0010\u0014\u001a\u00020\u0011*\u00020\u0010J\n\u0010\u0014\u001a\u00020\u0013*\u00020\u0007J\n\u0010\u0014\u001a\u00020\r*\u00020\f\u00a8\u0006\u0018"}, d2 = {"Lcom/ryan/weather/forecast/data/local/database/mapper/WeatherEntityMapper;", "", "()V", "toDomainModel", "Lcom/ryan/weather/forecast/domain/model/Forecast;", "Lcom/ryan/weather/forecast/data/local/database/dao/ForecastWithDays;", "location", "Lcom/ryan/weather/forecast/domain/model/Location;", "current", "Lcom/ryan/weather/forecast/domain/model/Current;", "Lcom/ryan/weather/forecast/domain/model/Condition;", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ConditionEntity;", "Lcom/ryan/weather/forecast/domain/model/Weather;", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/CurrentWeatherEntity;", "Lcom/ryan/weather/forecast/domain/model/DayForecast;", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/DayForecastEntity;", "Lcom/ryan/weather/forecast/domain/model/ForecastDay;", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastDayEntity;", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherWithDays;", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/LocationWeatherEntity;", "toEntity", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherEntity;", "city", "", "forecast_debug"})
public final class WeatherEntityMapper {
    @org.jetbrains.annotations.NotNull
    public static final com.ryan.weather.forecast.data.local.database.mapper.WeatherEntityMapper INSTANCE = null;
    
    private WeatherEntityMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.domain.model.Location toDomainModel(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.LocationWeatherEntity $this$toDomainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.LocationWeatherEntity toEntity(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Location $this$toEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.domain.model.Weather toDomainModel(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity $this$toDomainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity toEntity(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Weather $this$toEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity toEntity(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Current $this$toEntity, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Location location) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.ForecastWeatherEntity toEntity(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Forecast $this$toEntity, @org.jetbrains.annotations.NotNull
    java.lang.String city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.domain.model.Forecast toDomainModel(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.ForecastWeatherWithDays $this$toDomainModel, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Location location, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Current current) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.domain.model.ForecastDay toDomainModel(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.ForecastDayEntity $this$toDomainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.ForecastDayEntity toEntity(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.ForecastDay $this$toEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.domain.model.DayForecast toDomainModel(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.DayForecastEntity $this$toDomainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.DayForecastEntity toEntity(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.DayForecast $this$toEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.domain.model.Condition toDomainModel(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.ConditionEntity $this$toDomainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.ConditionEntity toEntity(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Condition $this$toEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.domain.model.Forecast toDomainModel(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.dao.ForecastWithDays $this$toDomainModel, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Location location, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.model.Current current) {
        return null;
    }
}