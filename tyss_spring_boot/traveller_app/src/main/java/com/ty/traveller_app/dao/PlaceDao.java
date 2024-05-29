package com.ty.traveller_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.traveller_app.entity.Place;
import com.ty.traveller_app.repository.PlaceRepossitory;

@Repository
public class PlaceDao {
	@Autowired
	private PlaceRepossitory repossitory;

	public Place savePlace(Place place) {
		return repossitory.save(place);
	}
	
	public Place updatePlace(Place place) {
		return repossitory.save(place);
	}

	public List<Place> findAll() {
		return repossitory.findAll();
	}

	public void deletePlaceById(int id) {
		repossitory.deleteById(id);
	}
	
	public Optional<Place> findPlaceById(int id){
		return repossitory.findById(id);
	}
}
