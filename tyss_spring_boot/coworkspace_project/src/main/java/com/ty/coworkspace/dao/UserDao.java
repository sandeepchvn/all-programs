package com.ty.coworkspace.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.coworkspace.entity.User;
import com.ty.coworkspace.repository.CoworkspaceRepository;

@Repository
public class UserDao {

	@Autowired
	private CoworkspaceRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}
}
