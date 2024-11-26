package com.ryan.weather.forecast.data.datasource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/ryan/weather/forecast/data/datasource/LocationDataSource;", "", "getCities", "Lcom/ryan/weather/core/domain/utils/NetworkResult;", "", "Lcom/ryan/weather/forecast/domain/model/City;", "Lcom/ryan/weather/core/domain/utils/Error;", "Lcom/ryan/weather/core/domain/utils/DomainError;", "apiKey", "", "city", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecast_debug"})
public abstract interface LocationDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCities(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ryan.weather.core.domain.utils.NetworkResult<? extends java.util.List<com.ryan.weather.forecast.domain.model.City>, ? extends com.ryan.weather.core.domain.utils.Error>> $completion);
}