package com.tyss.food_app.entity;

import com.tyss.food_app.dao_implementation.MenuDaoImplementation;
import com.tyss.food_app.dao_implementation.UserDaoImplementation;

public class DriverMenu {
	public static void main(String[] args) {
		MenuDaoImplementation menudao = new MenuDaoImplementation();

		Menu menu = new Menu();

//		Menu menu1=menudao.findMenu(3);
		UserDaoImplementation userdao = new UserDaoImplementation();
//		Users users=new Users();
//		users.setName("xyz");
//		users.setEmail("dfghj");
//		userdao.saveUser(users);
		Users u = userdao.findUser(3);
//		u.setMenu(menu1);
//		userdao.updateUser(u);
		menu.setUsers(u);
		menudao.saveMenu(menu);
	}
}
