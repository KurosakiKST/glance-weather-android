package com.ryan.weather.forecast.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/ryan/weather/forecast/domain/usecase/WeatherUseCase;", "", "weatherRepository", "Lcom/ryan/weather/forecast/domain/repository/WeatherRepository;", "(Lcom/ryan/weather/forecast/domain/repository/WeatherRepository;)V", "getCurrentWeather", "Lcom/ryan/weather/core/domain/utils/NetworkResult;", "Lcom/ryan/weather/forecast/domain/model/Weather;", "Lcom/ryan/weather/core/domain/utils/NetworkError;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForecastedWeather", "Lcom/ryan/weather/forecast/domain/model/Forecast;", "days", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecast_debug"})
public final class WeatherUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.domain.repository.WeatherRepository weatherRepository = null;
    
    @javax.inject.Inject
    public WeatherUseCase(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.repository.WeatherRepository weatherRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Weather, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getForecastedWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, int days, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Forecast, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion) {
        return null;
    }
}