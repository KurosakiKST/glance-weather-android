package com.ryan.weather.forecast.presentation.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/ryan/weather/forecast/presentation/home/HomeVM;", "Landroidx/lifecycle/ViewModel;", "locationUseCase", "Lcom/ryan/weather/forecast/domain/usecase/LocationUseCase;", "(Lcom/ryan/weather/forecast/domain/usecase/LocationUseCase;)V", "_locationState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ryan/weather/core/presentation/utils/ViewState;", "", "Lcom/ryan/weather/forecast/presentation/models/CityUi;", "locationState", "Lkotlinx/coroutines/flow/StateFlow;", "getLocationState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCities", "", "city", "", "forecast_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.domain.usecase.LocationUseCase locationUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ryan.weather.core.presentation.utils.ViewState<java.util.List<com.ryan.weather.forecast.presentation.models.CityUi>>> _locationState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.ryan.weather.core.presentation.utils.ViewState<java.util.List<com.ryan.weather.forecast.presentation.models.CityUi>>> locationState = null;
    
    @javax.inject.Inject
    public HomeVM(@org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.domain.usecase.LocationUseCase locationUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.ryan.weather.core.presentation.utils.ViewState<java.util.List<com.ryan.weather.forecast.presentation.models.CityUi>>> getLocationState() {
        return null;
    }
    
    public final void getCities(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
}