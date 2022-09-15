package com.andriiv.WeatherSensorRestApplication.repositories;

import com.andriiv.WeatherSensorRestApplication.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Roman_Andriiv
 */
@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
