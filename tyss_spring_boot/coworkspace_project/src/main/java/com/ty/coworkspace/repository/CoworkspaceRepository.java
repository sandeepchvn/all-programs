package com.ty.coworkspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.coworkspace.entity.User;

public interface CoworkspaceRepository extends JpaRepository<User, Integer>{

}
