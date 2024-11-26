package com.ryan.weather.forecast.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/ryan/weather/forecast/domain/usecase/LocationUseCase;", "", "locationRepository", "Lcom/ryan/weather/forecast/domain/repository/LocationRepository;", "(Lcom/ryan/weather/forecast/domain/repository/LocationRepository;)V", "getCities", "Lcom/ryan/weather/core/domain/utils/NetworkResult;", "", "Lcom/ryan/weather/forecast/domain/model/City;", "Lcom/ryan/weather/core/domain/utils/NetworkError;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecast_debug"})
public final class LocationUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.domain.repository.LocationRepository locationRepository = null;
    
    @javax.inject.Inject
    public LocationUseCase(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.repository.LocationRepository locationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCities(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<? extends java.util.List<com.ryan.weather.forecast.domain.model.City>, ? extends com.ryan.weather.core.domain.utils.NetworkError>> $completion) {
        return null;
    }
}