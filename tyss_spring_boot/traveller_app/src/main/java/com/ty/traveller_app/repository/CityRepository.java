package com.ty.traveller_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.traveller_app.entity.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
