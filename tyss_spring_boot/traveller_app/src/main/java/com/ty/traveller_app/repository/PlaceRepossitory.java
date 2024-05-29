package com.ty.traveller_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.traveller_app.entity.Place;

public interface PlaceRepossitory extends JpaRepository<Place, Integer>{

}