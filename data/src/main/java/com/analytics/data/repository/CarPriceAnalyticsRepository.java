package com.analytics.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.analytics.data.entity.CarModelPriceEntity;

public interface CarPriceAnalyticsRepository  extends JpaRepository<CarModelPriceEntity, Long>{

}
