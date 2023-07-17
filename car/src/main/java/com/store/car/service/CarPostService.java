package com.store.car.service;

import java.util.List;

import com.store.car.dto.CarPostDTO;

public interface CarPostService {
	
	void newPostDetails(CarPostDTO carPostDTO);
	
	List<CarPostDTO> getCarSales();
	
	void changeCarSale(CarPostDTO carPostDTO, Long postId);
	
	void removeCarSale(Long postId);
}
