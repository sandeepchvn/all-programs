package com.tyss.food_app.service;

import com.tyss.food_app.entity.FoodOrder;

public interface FoodOrderService {

	FoodOrder saveFoodOrder(FoodOrder foodOrder);

	FoodOrder findFoodOrder(int id);

	boolean deletFoodOrder(int id);

	FoodOrder updaFoodOrder(FoodOrder foodOrder);
	
	FoodOrder getTotalPriceOfItem(int orderId);
}
