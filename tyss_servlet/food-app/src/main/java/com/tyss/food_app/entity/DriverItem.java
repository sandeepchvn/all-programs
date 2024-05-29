package com.tyss.food_app.entity;

import com.tyss.food_app.dao_implementation.ItemDaoImplementation;

public class DriverItem {
	public static void main(String[] args) {
		ItemDaoImplementation dao = new ItemDaoImplementation();
	
//		Item item = new Item();
//		item.setName("milk");
//		dao.saveItem(item);
//		
//		Item item = dao.findItem(1);
//		System.out.println(item.getName());
		
		Item item = dao.findItem(1);
		item.setPrice(84);
		dao.updateItem(item);
		System.out.println(item.getPrice());
		
//		dao.deleteItem(1);
	}
}
