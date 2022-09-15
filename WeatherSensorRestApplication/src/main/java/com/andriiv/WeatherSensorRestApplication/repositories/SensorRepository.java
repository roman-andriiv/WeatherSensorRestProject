package com.andriiv.WeatherSensorRestApplication.repositories;

import com.andriiv.WeatherSensorRestApplication.models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Roman_Andriiv
 */
@Repository
public interface SensorRepository extends JpaRepository<Sensor, String> {
    Optional<Sensor> findByName(String name);
}
