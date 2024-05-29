package com.tyss.food_app.entity;

import com.tyss.food_app.dao_implementation.UserDaoImplementation;
import com.tyss.food_app.util.Role;

public class DriverUser {
public static void main(String[] args) {
	UserDaoImplementation userDao=new  UserDaoImplementation();
//	Users users=new Users();
//	users.setName("xyz");
//	users.setEmail("xyz@gmail.com");
//	users.setPassword("123");
//	users.setRole(Role.BRANCHMANAGER);
//	userDao.saveUser(users);
	
	
	//Users u2=userDao.findUser(1);
//	System.out.println(u2.getName());
	
	
//	
//	Users u=userDao.findUser(1);
//	u.setEmail("3333@g");
//	userDao.updateUser(u);
	
	
	
//	userDao.deleteUser(2);
	
	
	Users users=userDao.verifyUser("3333@g", "123");
	System.out.println(users.getName());
}
}
