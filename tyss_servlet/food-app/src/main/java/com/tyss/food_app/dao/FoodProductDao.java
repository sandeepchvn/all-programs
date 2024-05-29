package com.tyss.food_app.dao;

import com.tyss.food_app.entity.FoodProduct;

public interface FoodProductDao {

	public FoodProduct saveFoodProduct(FoodProduct foodProduct);
	
	public FoodProduct findFoodProduct(int id);
	
	public FoodProduct updateFoodProduct(FoodProduct foodProduct);
	
	public boolean deleteFoodProduct(int id);
	
}
