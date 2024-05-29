package com.ty.traveller_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.traveller_app.entity.Travler;
import com.ty.traveller_app.repository.TravlerRepository;

@Repository
public class TravlerDao {
	@Autowired
	private TravlerRepository repository;

	public Travler saveTravler(Travler travler) {
		return repository.save(travler);
	}

	public Travler updateTravler(Travler travler) {
		return repository.save(travler);
	}

	public void deleteTravler(int id) {
		repository.deleteById(id);
	}

	public Optional<Travler> findTravlerById(int id) {
		return repository.findById(id);
	}

	public List<Travler> findAllTravler() {
		return repository.findAll();
	}
}
