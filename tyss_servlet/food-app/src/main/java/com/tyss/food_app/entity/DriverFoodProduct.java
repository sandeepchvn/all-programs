package com.tyss.food_app.entity;

import com.tyss.food_app.dao_implementation.FoodProductDaoImplementation;
import com.tyss.food_app.util.Availability;

public class DriverFoodProduct {
public static void main(String[] args) {
	FoodProductDaoImplementation dao=new FoodProductDaoImplementation();

//	
//	FoodProduct foodProduct=new FoodProduct();
//	foodProduct.setName("egg");
//	foodProduct.setAvailability(Availability.AVAILABLE);
//	dao.saveFoodProduct(foodProduct);
	
//	FoodProduct foodProduct=dao.findFoodProduct(1);
//	System.out.println(foodProduct.getName());
	
//	FoodProduct foodProduct=dao.findFoodProduct(1);
//	foodProduct.setAvailability(Availability.NOT_AVAILABLE);;
//	dao.updateFoodProduct(foodProduct);
	
	dao.deleteFoodProduct(1);
}
}
