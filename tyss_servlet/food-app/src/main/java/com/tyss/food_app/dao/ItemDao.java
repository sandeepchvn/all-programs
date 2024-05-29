package com.tyss.food_app.dao;

import com.tyss.food_app.entity.Item;

public interface ItemDao {

	Item saveItem(Item item);

	Item findItem(int id);

	boolean deleteItem(int id);

	Item updateItem(Item item);
}
