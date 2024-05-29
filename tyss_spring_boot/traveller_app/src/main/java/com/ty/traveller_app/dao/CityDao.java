package com.ty.traveller_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.traveller_app.entity.City;
import com.ty.traveller_app.repository.CityRepository;

@Repository
public class CityDao {

	@Autowired
	private CityRepository repository;

	public City saveCity(City city) {
		return repository.save(city);
	}

	public City updateCity(City city) {
		return repository.save(city);
	}

	public void deleteCityById(int id) {
		repository.deleteById(id);
	}

	public List<City> findAll() {
		return repository.findAll();
	}

	public Optional<City> findCityById(int id) {
		return repository.findById(id);
	}

}
