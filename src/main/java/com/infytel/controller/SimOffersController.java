package com.infytel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infytel.dto.SimOffersDTO;
import com.infytel.service.SimOffersService;

@RestController
public class SimOffersController {

	@Autowired
	SimOffersService simOffersService;
	
	@GetMapping("/offers/{simId}")
	public ResponseEntity<List<SimOffersDTO>> getOffers(@PathVariable("simId") Long simId){
		
		return ResponseEntity.status(HttpStatus.OK).body(simOffersService.getOffersBySimId(simId));
		
	}
	
}
