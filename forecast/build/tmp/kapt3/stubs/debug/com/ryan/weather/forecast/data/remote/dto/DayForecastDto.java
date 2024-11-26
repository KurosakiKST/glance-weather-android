package com.ryan.weather.forecast.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0011H\u00c6\u0003J\t\u00107\u001a\u00020\u0011H\u00c6\u0003J\t\u00108\u001a\u00020\u0011H\u00c6\u0003J\t\u00109\u001a\u00020\u0011H\u00c6\u0003J\t\u0010:\u001a\u00020\u0011H\u00c6\u0003J\t\u0010;\u001a\u00020\u0017H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\u00d1\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010I\u001a\u00020\u0011H\u00d6\u0001J\t\u0010J\u001a\u00020KH\u00d6\u0001R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001d\u00a8\u0006L"}, d2 = {"Lcom/ryan/weather/forecast/data/remote/dto/DayForecastDto;", "", "maxTempC", "", "maxTempF", "minTempC", "minTempF", "avgTempC", "avgTempF", "maxWindMph", "maxWindKph", "totalPrecipMm", "totalPrecipIn", "totalSnowCm", "avgVisKm", "avgVisMiles", "avgHumidity", "", "dailyWillItRain", "dailyChanceOfRain", "dailyWillItSnow", "dailyChanceOfSnow", "condition", "Lcom/ryan/weather/forecast/data/remote/dto/ConditionDto;", "uv", "(DDDDDDDDDDDDDIIIIILcom/ryan/weather/forecast/data/remote/dto/ConditionDto;D)V", "getAvgHumidity", "()I", "getAvgTempC", "()D", "getAvgTempF", "getAvgVisKm", "getAvgVisMiles", "getCondition", "()Lcom/ryan/weather/forecast/data/remote/dto/ConditionDto;", "getDailyChanceOfRain", "getDailyChanceOfSnow", "getDailyWillItRain", "getDailyWillItSnow", "getMaxTempC", "getMaxTempF", "getMaxWindKph", "getMaxWindMph", "getMinTempC", "getMinTempF", "getTotalPrecipIn", "getTotalPrecipMm", "getTotalSnowCm", "getUv", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "forecast_debug"})
public final class DayForecastDto {
    @com.google.gson.annotations.SerializedName(value = "maxtemp_c")
    private final double maxTempC = 0.0;
    @com.google.gson.annotations.SerializedName(value = "maxtemp_f")
    private final double maxTempF = 0.0;
    @com.google.gson.annotations.SerializedName(value = "mintemp_c")
    private final double minTempC = 0.0;
    @com.google.gson.annotations.SerializedName(value = "mintemp_f")
    private final double minTempF = 0.0;
    @com.google.gson.annotations.SerializedName(value = "avgtemp_c")
    private final double avgTempC = 0.0;
    @com.google.gson.annotations.SerializedName(value = "avgtemp_f")
    private final double avgTempF = 0.0;
    @com.google.gson.annotations.SerializedName(value = "maxwind_mph")
    private final double maxWindMph = 0.0;
    @com.google.gson.annotations.SerializedName(value = "maxwind_kph")
    private final double maxWindKph = 0.0;
    @com.google.gson.annotations.SerializedName(value = "totalprecip_mm")
    private final double totalPrecipMm = 0.0;
    @com.google.gson.annotations.SerializedName(value = "totalprecip_in")
    private final double totalPrecipIn = 0.0;
    @com.google.gson.annotations.SerializedName(value = "totalsnow_cm")
    private final double totalSnowCm = 0.0;
    @com.google.gson.annotations.SerializedName(value = "avgvis_km")
    private final double avgVisKm = 0.0;
    @com.google.gson.annotations.SerializedName(value = "avgvis_miles")
    private final double avgVisMiles = 0.0;
    @com.google.gson.annotations.SerializedName(value = "avghumidity")
    private final int avgHumidity = 0;
    @com.google.gson.annotations.SerializedName(value = "daily_will_it_rain")
    private final int dailyWillItRain = 0;
    @com.google.gson.annotations.SerializedName(value = "daily_chance_of_rain")
    private final int dailyChanceOfRain = 0;
    @com.google.gson.annotations.SerializedName(value = "daily_will_it_snow")
    private final int dailyWillItSnow = 0;
    @com.google.gson.annotations.SerializedName(value = "daily_chance_of_snow")
    private final int dailyChanceOfSnow = 0;
    @com.google.gson.annotations.SerializedName(value = "condition")
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.data.remote.dto.ConditionDto condition = null;
    @com.google.gson.annotations.SerializedName(value = "uv")
    private final double uv = 0.0;
    
    public DayForecastDto(double maxTempC, double maxTempF, double minTempC, double minTempF, double avgTempC, double avgTempF, double maxWindMph, double maxWindKph, double totalPrecipMm, double totalPrecipIn, double totalSnowCm, double avgVisKm, double avgVisMiles, int avgHumidity, int dailyWillItRain, int dailyChanceOfRain, int dailyWillItSnow, int dailyChanceOfSnow, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.remote.dto.ConditionDto condition, double uv) {
        super();
    }
    
    public final double getMaxTempC() {
        return 0.0;
    }
    
    public final double getMaxTempF() {
        return 0.0;
    }
    
    public final double getMinTempC() {
        return 0.0;
    }
    
    public final double getMinTempF() {
        return 0.0;
    }
    
    public final double getAvgTempC() {
        return 0.0;
    }
    
    public final double getAvgTempF() {
        return 0.0;
    }
    
    public final double getMaxWindMph() {
        return 0.0;
    }
    
    public final double getMaxWindKph() {
        return 0.0;
    }
    
    public final double getTotalPrecipMm() {
        return 0.0;
    }
    
    public final double getTotalPrecipIn() {
        return 0.0;
    }
    
    public final double getTotalSnowCm() {
        return 0.0;
    }
    
    public final double getAvgVisKm() {
        return 0.0;
    }
    
    public final double getAvgVisMiles() {
        return 0.0;
    }
    
    public final int getAvgHumidity() {
        return 0;
    }
    
    public final int getDailyWillItRain() {
        return 0;
    }
    
    public final int getDailyChanceOfRain() {
        return 0;
    }
    
    public final int getDailyWillItSnow() {
        return 0;
    }
    
    public final int getDailyChanceOfSnow() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.remote.dto.ConditionDto getCondition() {
        return null;
    }
    
    public final double getUv() {
        return 0.0;
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.remote.dto.ConditionDto component19() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.remote.dto.DayForecastDto copy(double maxTempC, double maxTempF, double minTempC, double minTempF, double avgTempC, double avgTempF, double maxWindMph, double maxWindKph, double totalPrecipMm, double totalPrecipIn, double totalSnowCm, double avgVisKm, double avgVisMiles, int avgHumidity, int dailyWillItRain, int dailyChanceOfRain, int dailyWillItSnow, int dailyChanceOfSnow, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.remote.dto.ConditionDto condition, double uv) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}