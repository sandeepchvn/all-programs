package com.ty.traveller_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.traveller_app.entity.Country;
import com.ty.traveller_app.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService service;
	
	@PostMapping
	public Country saveCountry(@RequestBody Country country) {
		
		return service.saveCountry(country);
	}
}
