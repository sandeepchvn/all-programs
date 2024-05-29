package com.ty.coworkspace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.coworkspace.dao.UserDao;
import com.ty.coworkspace.entity.User;

@RestController
public class UserController {

	@Autowired
	UserDao dao;
	
	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {
		
		dao.saveUser(user);
		return "save user";
	}
}
