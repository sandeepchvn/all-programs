package com.tyss.food_app.service;

import com.tyss.food_app.entity.Users;

public interface UserService {

	Users loginUser(String email,String password);
	Users saveUser(Users u);
	Users getByUserId(int id);
	Users getByUserName(String name);
	Users getByEmail(String email);
	Users updateUser(Users u);
	boolean deleteUser(int id);
}
