
package com.ty.traveller_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.traveller_app.dto.ResponseStructure;
import com.ty.traveller_app.entity.Travler;
import com.ty.traveller_app.service.TravlerService;

@RestController
@RequestMapping("/travler")
public class TravlerController {

	@Autowired
	TravlerService service;

	@PostMapping
	public ResponseEntity<ResponseStructure<Travler>> saveTrvaler(@RequestBody Travler travler) {
		return service.saveTravler(travler);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<Travler>> findTraveller(@PathVariable int id){
		return service.findTravlerById(id);
	}
	
	@PostMapping("/{conutryId}")
	public Travler giveCountryToTravler(@RequestBody Travler travler,@PathVariable int conutryId) {
		return service.giveCountryToTravler(travler, conutryId);
	}
	
	
}
