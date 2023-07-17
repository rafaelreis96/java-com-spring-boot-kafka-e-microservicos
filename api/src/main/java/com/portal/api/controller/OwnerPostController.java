package com.portal.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.api.dto.OwnerPostDTO;
import com.portal.api.service.OwnerPostService;

@RestController
@RequestMapping("/owner")
public class OwnerPostController {
	
	private final Logger LOG =  LoggerFactory.getLogger(OwnerPostController.class);
	
	@Autowired
	private OwnerPostService ownerPostService;
	
	@PostMapping
	public ResponseEntity<OwnerPostDTO> createOwnerCar(@RequestBody OwnerPostDTO ownerPostDTO) {
		
		LOG.info("USANDO API REST -  Criando Novo Usuário: {} ", ownerPostDTO);

		ownerPostService.createOwnerCar(ownerPostDTO);
		return ResponseEntity.noContent().build();
	}

}
