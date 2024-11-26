package com.ryan.weather.forecast.presentation.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/ryan/weather/forecast/presentation/detail/DetailVM;", "Landroidx/lifecycle/ViewModel;", "weatherUseCase", "Lcom/ryan/weather/forecast/domain/usecase/WeatherUseCase;", "locationUseCase", "Lcom/ryan/weather/forecast/domain/usecase/LocationUseCase;", "(Lcom/ryan/weather/forecast/domain/usecase/WeatherUseCase;Lcom/ryan/weather/forecast/domain/usecase/LocationUseCase;)V", "_forecastState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ryan/weather/core/presentation/utils/ViewState;", "", "Lcom/ryan/weather/forecast/presentation/models/ForecastDayUi;", "_locationState", "Lcom/ryan/weather/forecast/presentation/models/CityUi;", "_weatherState", "Lcom/ryan/weather/forecast/presentation/models/WeatherUi;", "forecastState", "Lkotlinx/coroutines/flow/StateFlow;", "getForecastState", "()Lkotlinx/coroutines/flow/StateFlow;", "locationState", "getLocationState", "weatherState", "getWeatherState", "getCities", "", "city", "", "getCurrentWeather", "getForecastedWeather", "days", "", "forecast_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DetailVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.domain.usecase.WeatherUseCase weatherUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.domain.usecase.LocationUseCase locationUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ryan.weather.core.presentation.utils.ViewState<com.ryan.weather.forecast.presentation.models.WeatherUi>> _weatherState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.ryan.weather.core.presentation.utils.ViewState<com.ryan.weather.forecast.presentation.models.WeatherUi>> weatherState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ryan.weather.core.presentation.utils.ViewState<java.util.List<com.ryan.weather.forecast.presentation.models.ForecastDayUi>>> _forecastState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.ryan.weather.core.presentation.utils.ViewState<java.util.List<com.ryan.weather.forecast.presentation.models.ForecastDayUi>>> forecastState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ryan.weather.core.presentation.utils.ViewState<java.util.List<com.ryan.weather.forecast.presentation.models.CityUi>>> _locationState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.ryan.weather.core.presentation.utils.ViewState<java.util.List<com.ryan.weather.forecast.presentation.models.CityUi>>> locationState = null;
    
    @javax.inject.Inject
    public DetailVM(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.usecase.WeatherUseCase weatherUseCase, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.usecase.LocationUseCase locationUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.ryan.weather.core.presentation.utils.ViewState<com.ryan.weather.forecast.presentation.models.WeatherUi>> getWeatherState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.ryan.weather.core.presentation.utils.ViewState<java.util.List<com.ryan.weather.forecast.presentation.models.ForecastDayUi>>> getForecastState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.ryan.weather.core.presentation.utils.ViewState<java.util.List<com.ryan.weather.forecast.presentation.models.CityUi>>> getLocationState() {
        return null;
    }
    
    public final void getCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
    
    public final void getForecastedWeather(@org.jetbrains.annotations.NotNull
    java.lang.String city, int days) {
    }
    
    public final void getCities(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
}