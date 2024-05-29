package com.ty.traveller_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.traveller_app.dao.PlaceDao;
import com.ty.traveller_app.entity.Place;

@Service
public class PlaceService {

	@Autowired
	private PlaceDao dao;
	
	public Place savePlace(Place place) {
		return dao.savePlace(place);
	}
	
	public Place updatePlace(Place place) {
		return dao.savePlace(place);
	}
	
	public List<Place> findAll(){
		return dao.findAll();
	}
	
	public Optional<Place> fiindPlaceById(int id){
		return dao.findPlaceById(id);
	}
	
	public void deletePlaceById(int id) {
		dao.deletePlaceById(id);
	}
}
