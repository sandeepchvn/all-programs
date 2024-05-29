package com.ty.traveller_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.traveller_app.dao.PassportDao;
import com.ty.traveller_app.entity.Passport;

@Service
public class PassportService {

	@Autowired
	private PassportDao dao;

	public Passport savePassport(Passport passport) {
		return dao.savePassport(passport);
	}

	public Passport updatePassport(Passport passport) {
		return dao.updatePassport(passport);
	}

	public List<Passport> findAll() {
		return dao.findAll();
	}

	public Optional<Passport> findPassportById(int id) {
		return dao.findPassportById(id);
	}

	public void deletePassport(int id) {
		dao.deletePassportById(id);
	}
}
