package com.andriiv.WeatherSensorRestApplication.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * A DTO for the {@link com.andriiv.WeatherSensorRestApplication.models.Measurement} entity
 */
public class MeasurementDTO{
    @NotNull
    @Min(-100)
    @Max(100)
    private Double value;
    @NotNull
    private Boolean raining;
    @NotNull
    private SensorDTO sensor;


    public Double getValue() {
        return value;
    }

    public Boolean getRaining() {
        return raining;
    }

    public SensorDTO getSensor() {
        return sensor;
    }
}