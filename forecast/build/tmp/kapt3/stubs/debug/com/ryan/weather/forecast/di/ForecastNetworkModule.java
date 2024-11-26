package com.ryan.weather.forecast.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/ryan/weather/forecast/di/ForecastNetworkModule;", "", "()V", "provideLocationAPIService", "Lcom/ryan/weather/forecast/data/remote/LocationAPIService;", "retrofit", "Lretrofit2/Retrofit;", "provideWeatherAPIService", "Lcom/ryan/weather/forecast/data/remote/WeatherAPIService;", "forecast_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ForecastNetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final com.ryan.weather.forecast.di.ForecastNetworkModule INSTANCE = null;
    
    private ForecastNetworkModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.remote.WeatherAPIService provideWeatherAPIService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.remote.LocationAPIService provideLocationAPIService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}