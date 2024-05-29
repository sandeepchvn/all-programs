package com.tyss.food_app.dao;

import com.tyss.food_app.entity.FoodOrder;

public interface FoodOrderDao {

	FoodOrder saveFoodOrder(FoodOrder foodOrder);
	
	FoodOrder findFoodOrder(int id);
	
	boolean deletFoodOrder(int id);
	
	FoodOrder updaFoodOrder(FoodOrder foodOrder);
}
