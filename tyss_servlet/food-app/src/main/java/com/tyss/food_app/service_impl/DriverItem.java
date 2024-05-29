package com.tyss.food_app.service_impl;

import java.util.List;

import com.tyss.food_app.entity.FoodProduct;
import com.tyss.food_app.entity.Item;
import com.tyss.food_app.entity.Menu;
import com.tyss.food_app.util.Type;

public class DriverItem {
public static void main(String[] args) {
//	ItemServiceImple itemservice=new ItemServiceImple();
//	Item item=new Item();
//	item.setName("milk");
//	item.setPrice(10);
//	item.setProductId(1);
//	item.setQuantity(4);
//	item.setType(Type.VEG);
//	itemservice.saveItem(item);
	
	MenuServiceImlp ms=new MenuServiceImlp();
	Menu menu=ms.findMenu(2);
	List<FoodProduct> foodProducts =menu.getFoodProducts();
	for (FoodProduct foodProduct : foodProducts) {
		System.out.println(foodProduct.getName());
	}
}
}
