package com.analytics.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.analytics.data.entity.CarModelAnalyticsEntity;

public interface CarModelAnalyticsRepository extends JpaRepository<CarModelAnalyticsEntity, Long> {

	Optional<CarModelAnalyticsEntity> findByModel(String carModel);

}
