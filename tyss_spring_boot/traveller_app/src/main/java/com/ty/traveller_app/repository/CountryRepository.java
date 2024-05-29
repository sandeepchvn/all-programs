package com.ty.traveller_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.traveller_app.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
