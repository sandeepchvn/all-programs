package com.ty.traveller_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.traveller_app.dao.CountryDao;
import com.ty.traveller_app.entity.Country;

@Service
public class CountryService {

	@Autowired
	private CountryDao dao;

	public Country saveCountry(Country country) {
		return dao.saveCountry(country);
	}

	public Country updateCountry(Country country) {
		return dao.updateCountry(country);
	}
}