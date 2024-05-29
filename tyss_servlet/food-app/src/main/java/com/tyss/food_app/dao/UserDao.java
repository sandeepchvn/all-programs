package com.tyss.food_app.dao;

import com.tyss.food_app.entity.Users;

public interface UserDao {

	Users saveUser(Users user);
	
	Users findUser(int id);
	
	boolean deleteUser(int id);
	
	Users updateUser(Users u);
	
	Users verifyUser(String email, String password);

}
