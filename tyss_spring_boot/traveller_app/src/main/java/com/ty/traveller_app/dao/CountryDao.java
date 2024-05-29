package com.ty.traveller_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.traveller_app.entity.Country;
import com.ty.traveller_app.repository.CountryRepository;
@Repository
public class CountryDao {

	@Autowired
	private CountryRepository repository;

	public Country saveCountry(Country country) {
		return repository.save(country);
	}

	public Country updateCountry(Country country) {
		return repository.save(country);
	}

	public Optional<Country> findCountryById(int id) {
		return repository.findById(id);
	}

	public void deleteCountryById(int id) {
		repository.deleteById(id);
	}

	public List<Country> findAll() {
		return repository.findAll();
	}
}
