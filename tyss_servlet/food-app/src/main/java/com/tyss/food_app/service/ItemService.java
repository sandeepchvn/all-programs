package com.tyss.food_app.service;

import java.util.List;

import com.tyss.food_app.entity.Item;

public interface ItemService {
	Item saveItem(Item item);

	Item findItem(int id);

	boolean deleteItem(int id);

	Item updateItem(Item item);
	
	List<Item> findAllItem();
	
}
