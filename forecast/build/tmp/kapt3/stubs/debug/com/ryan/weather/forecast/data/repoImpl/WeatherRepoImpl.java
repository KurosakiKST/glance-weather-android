package com.ryan.weather.forecast.data.repoImpl;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ-\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/ryan/weather/forecast/data/repoImpl/WeatherRepoImpl;", "Lcom/ryan/weather/forecast/domain/repository/WeatherRepository;", "weatherRemoteDataSource", "Lcom/ryan/weather/forecast/data/remote/WeatherRemoteDataSource;", "weatherLocalDataSource", "Lcom/ryan/weather/forecast/data/local/datasource/WeatherLocalDataSource;", "(Lcom/ryan/weather/forecast/data/remote/WeatherRemoteDataSource;Lcom/ryan/weather/forecast/data/local/datasource/WeatherLocalDataSource;)V", "getCurrentWeather", "Lcom/ryan/weather/core/domain/utils/NetworkResult;", "Lcom/ryan/weather/forecast/domain/model/Weather;", "Lcom/ryan/weather/core/domain/utils/NetworkError;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForeCastWeather", "Lcom/ryan/weather/forecast/domain/model/Forecast;", "days", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecast_debug"})
public final class WeatherRepoImpl implements com.ryan.weather.forecast.domain.repository.WeatherRepository {
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.data.remote.WeatherRemoteDataSource weatherRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.data.local.datasource.WeatherLocalDataSource weatherLocalDataSource = null;
    
    @javax.inject.Inject
    public WeatherRepoImpl(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.remote.WeatherRemoteDataSource weatherRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.datasource.WeatherLocalDataSource weatherLocalDataSource) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Weather, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getForeCastWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, int days, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<com.ryan.weather.forecast.domain.model.Forecast, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion) {
        return null;
    }
}