package com.tyss.food_app.service;

import java.util.List;

import com.tyss.food_app.entity.Menu;

public interface MenuService {

	Menu saveMenu(Menu menu);
    Menu updateMenu(Menu menu);
	boolean deleteMenu(int id);
	Menu findMenu(int id);
	List<Menu> getAllMenu();
	Menu getMenuByBranchId(int branchId);
	Menu getMenuByUserId(int id);
}
