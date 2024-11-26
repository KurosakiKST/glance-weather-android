package com.ryan.weather.forecast.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\nH\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\nH\u00c6\u0003J\t\u0010>\u001a\u00020\fH\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\u00bd\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\nH\u00d6\u0001J\t\u0010G\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001f\u00a8\u0006H"}, d2 = {"Lcom/ryan/weather/forecast/data/remote/dto/CurrentDto;", "", "lastUpdatedEpoch", "", "lastUpdated", "", "tempC", "", "tempF", "isDay", "", "condition", "Lcom/ryan/weather/forecast/data/remote/dto/ConditionDto;", "windMph", "windKph", "windDegree", "windDir", "pressureMb", "pressureIn", "precipitationMm", "precipitationIn", "humidity", "cloud", "feelsLikeC", "feelsLikeF", "(JLjava/lang/String;DDILcom/ryan/weather/forecast/data/remote/dto/ConditionDto;DDILjava/lang/String;DDDDIIDD)V", "getCloud", "()I", "getCondition", "()Lcom/ryan/weather/forecast/data/remote/dto/ConditionDto;", "getFeelsLikeC", "()D", "getFeelsLikeF", "getHumidity", "getLastUpdated", "()Ljava/lang/String;", "getLastUpdatedEpoch", "()J", "getPrecipitationIn", "getPrecipitationMm", "getPressureIn", "getPressureMb", "getTempC", "getTempF", "getWindDegree", "getWindDir", "getWindKph", "getWindMph", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "forecast_debug"})
public final class CurrentDto {
    @com.google.gson.annotations.SerializedName(value = "last_updated_epoch")
    private final long lastUpdatedEpoch = 0L;
    @com.google.gson.annotations.SerializedName(value = "last_updated")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastUpdated = null;
    @com.google.gson.annotations.SerializedName(value = "temp_c")
    private final double tempC = 0.0;
    @com.google.gson.annotations.SerializedName(value = "temp_f")
    private final double tempF = 0.0;
    @com.google.gson.annotations.SerializedName(value = "is_day")
    private final int isDay = 0;
    @com.google.gson.annotations.SerializedName(value = "condition")
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.data.remote.dto.ConditionDto condition = null;
    @com.google.gson.annotations.SerializedName(value = "wind_mph")
    private final double windMph = 0.0;
    @com.google.gson.annotations.SerializedName(value = "wind_kph")
    private final double windKph = 0.0;
    @com.google.gson.annotations.SerializedName(value = "wind_degree")
    private final int windDegree = 0;
    @com.google.gson.annotations.SerializedName(value = "wind_dir")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String windDir = null;
    @com.google.gson.annotations.SerializedName(value = "pressure_mb")
    private final double pressureMb = 0.0;
    @com.google.gson.annotations.SerializedName(value = "pressure_in")
    private final double pressureIn = 0.0;
    @com.google.gson.annotations.SerializedName(value = "precip_mm")
    private final double precipitationMm = 0.0;
    @com.google.gson.annotations.SerializedName(value = "precip_in")
    private final double precipitationIn = 0.0;
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private final int humidity = 0;
    @com.google.gson.annotations.SerializedName(value = "cloud")
    private final int cloud = 0;
    @com.google.gson.annotations.SerializedName(value = "feelslike_c")
    private final double feelsLikeC = 0.0;
    @com.google.gson.annotations.SerializedName(value = "feelslike_f")
    private final double feelsLikeF = 0.0;
    
    public CurrentDto(long lastUpdatedEpoch, @org.jetbrains.annotations.NotNull
    java.lang.String lastUpdated, double tempC, double tempF, int isDay, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.remote.dto.ConditionDto condition, double windMph, double windKph, int windDegree, @org.jetbrains.annotations.NotNull
    java.lang.String windDir, double pressureMb, double pressureIn, double precipitationMm, double precipitationIn, int humidity, int cloud, double feelsLikeC, double feelsLikeF) {
        super();
    }
    
    public final long getLastUpdatedEpoch() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final double getTempC() {
        return 0.0;
    }
    
    public final double getTempF() {
        return 0.0;
    }
    
    public final int isDay() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.remote.dto.ConditionDto getCondition() {
        return null;
    }
    
    public final double getWindMph() {
        return 0.0;
    }
    
    public final double getWindKph() {
        return 0.0;
    }
    
    public final int getWindDegree() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWindDir() {
        return null;
    }
    
    public final double getPressureMb() {
        return 0.0;
    }
    
    public final double getPressureIn() {
        return 0.0;
    }
    
    public final double getPrecipitationMm() {
        return 0.0;
    }
    
    public final double getPrecipitationIn() {
        return 0.0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final int getCloud() {
        return 0;
    }
    
    public final double getFeelsLikeC() {
        return 0.0;
    }
    
    public final double getFeelsLikeF() {
        return 0.0;
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
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
    
    public final double component14() {
        return 0.0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.remote.dto.ConditionDto component6() {
        return null;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.remote.dto.CurrentDto copy(long lastUpdatedEpoch, @org.jetbrains.annotations.NotNull
    java.lang.String lastUpdated, double tempC, double tempF, int isDay, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.remote.dto.ConditionDto condition, double windMph, double windKph, int windDegree, @org.jetbrains.annotations.NotNull
    java.lang.String windDir, double pressureMb, double pressureIn, double precipitationMm, double precipitationIn, int humidity, int cloud, double feelsLikeC, double feelsLikeF) {
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