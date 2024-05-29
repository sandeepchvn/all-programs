package com.ty.traveller_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.traveller_app.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer>{

}
