package com.ty.coworkspace.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.coworkspace.dao.UserDao;
import com.ty.coworkspace.entity.User;

public class Driver {
	@Autowired
	UserDao dao;
//	@Autowired
//	static Driver driver;
//	public static void main(String[] args) {
////		Driver driver=new Driver();
//		driver.saveUser();
//	}
//	public void saveUser() {
//		User user=new User();
//		user.setName("kaustub");
//		user.setPassword("123");
//		user.setPhone(3456789);
//		user.setRole(Role.ADMIN);
//		user.setEmail("@dfg");
//		dao.saveUser(user);
//	}

}
