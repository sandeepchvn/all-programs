package com.ty.coworkspace.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.coworkspace.entity.User;
import com.ty.coworkspace.util.Role;

@Component
class UserDaoTest {

	@Autowired
	UserDao dao;

	@Test
	void test() {
		User user = new User();
		user.setName("kaustub");
		user.setPassword("123");
		user.setPhone(3456789);
		user.setRole(Role.ADMIN);
		user.setEmail("@dfg");
		dao.saveUser(user);

	}

}
