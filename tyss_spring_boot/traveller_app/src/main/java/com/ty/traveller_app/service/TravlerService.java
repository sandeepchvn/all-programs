package com.ty.traveller_app.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.traveller_app.dao.CountryDao;
import com.ty.traveller_app.dao.TravlerDao;
import com.ty.traveller_app.dto.ResponseStructure;
import com.ty.traveller_app.entity.Country;
import com.ty.traveller_app.entity.Travler;

@Service
public class TravlerService {

	@Autowired
	private TravlerDao dao;
	@Autowired
	private CountryDao countryDao;

	public ResponseEntity<ResponseStructure<Travler>> saveTravler(Travler travler) {
		Travler rectravler = dao.saveTravler(travler);
		ResponseStructure<Travler> responseStructure = new ResponseStructure<Travler>();
		responseStructure.setData(rectravler);
		responseStructure.setMessage("saved successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Travler>>(responseStructure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<Travler>> updateTravler(Travler travler) {
		Travler rectravler = dao.updateTravler(travler);
		ResponseStructure<Travler> responseStructure = new ResponseStructure<Travler>();
		responseStructure.setData(rectravler);
		responseStructure.setMessage("saved successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Travler>>(responseStructure, HttpStatus.OK);
	}

	public List<Travler> findAll() {
		return dao.findAllTravler();
	}

	public ResponseEntity<ResponseStructure<Travler>> findTravlerById(int id) {
		Optional<Travler> opt = dao.findTravlerById(id);
		ResponseStructure<Travler> responseStructure = new ResponseStructure<Travler>();
		responseStructure.setData(opt.get());
		responseStructure.setMessage("Traveller Found successfully...");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Travler>>(responseStructure, HttpStatus.OK);
	}

	public void deleteTravler(int id) {
		dao.deleteTravler(id);
	}

	public Travler giveCountryToTravler( Travler travler,  int countryId) {
		Optional<Country> optional =countryDao.findCountryById(countryId);
		if(optional.get() != null) {
			List<Country> countries=Arrays.asList(optional.get());
			travler.setCountries(countries);
			return dao.saveTravler(travler);
		}
		return null;
	}
}
