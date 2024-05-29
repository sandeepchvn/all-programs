package com.tyss.food_app.dao;

import com.tyss.food_app.entity.Menu;

public interface MenuDao {

	public Menu saveMenu(Menu menu);
	
	public Menu findMenu(int id);
	
	public boolean deleteMenu(int id);
	
	public Menu updateMenu(Menu menu);
}
