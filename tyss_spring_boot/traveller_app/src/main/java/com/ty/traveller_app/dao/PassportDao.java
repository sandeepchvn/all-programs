package com.ty.traveller_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.traveller_app.entity.Passport;
import com.ty.traveller_app.entity.Place;
import com.ty.traveller_app.repository.PassportRepository;

@Repository
public class PassportDao {

	@Autowired
	private PassportRepository repository;

	public Passport savePassport(Passport passport) {
		return repository.save(passport);
	}

	public Passport updatePassport(Passport passport) {
		return repository.save(passport);
	}

	public void deletePassportById(int id) {
		repository.deleteById(id);
	}

	public List<Passport> findAll() {
		return repository.findAll();
	}

	public Optional<Passport> findPassportById(int id) {
		return repository.findById(id);
	}
}
