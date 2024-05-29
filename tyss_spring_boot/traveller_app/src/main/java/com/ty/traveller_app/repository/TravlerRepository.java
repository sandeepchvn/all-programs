package com.ty.traveller_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.traveller_app.entity.Travler;


public interface TravlerRepository extends JpaRepository<Travler, Integer>{

}
