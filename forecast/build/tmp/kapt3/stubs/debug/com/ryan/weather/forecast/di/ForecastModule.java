package com.ryan.weather.forecast.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/ryan/weather/forecast/di/ForecastModule;", "", "()V", "provideLocationDataSource", "Lcom/ryan/weather/forecast/data/datasource/LocationDataSource;", "impl", "Lcom/ryan/weather/forecast/data/remote/LocationRemoteDataSource;", "provideLocationRepository", "Lcom/ryan/weather/forecast/domain/repository/LocationRepository;", "Lcom/ryan/weather/forecast/data/repoImpl/LocationRepoImpl;", "provideWeatherDataSource", "Lcom/ryan/weather/forecast/data/datasource/WeatherDataSource;", "Lcom/ryan/weather/forecast/data/remote/WeatherRemoteDataSource;", "provideWeatherRepository", "Lcom/ryan/weather/forecast/domain/repository/WeatherRepository;", "Lcom/ryan/weather/forecast/data/repoImpl/WeatherRepoImpl;", "forecast_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class ForecastModule {
    
    public ForecastModule() {
        super();
    }
    
    /**
     * -------DataSources--------
     */
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.ryan.weather.forecast.data.datasource.WeatherDataSource provideWeatherDataSource(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.remote.WeatherRemoteDataSource impl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.ryan.weather.forecast.data.datasource.LocationDataSource provideLocationDataSource(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.remote.LocationRemoteDataSource impl);
    
    /**
     * -------Repositories-------
     */
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.ryan.weather.forecast.domain.repository.WeatherRepository provideWeatherRepository(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.repoImpl.WeatherRepoImpl impl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.ryan.weather.forecast.domain.repository.LocationRepository provideLocationRepository(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.repoImpl.LocationRepoImpl impl);
}