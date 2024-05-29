package com.tyss.food_app.service;

import java.util.List;

import com.tyss.food_app.entity.FoodProduct;

public interface FoodProductService {
	public FoodProduct saveFoodProduct(FoodProduct foodProduct);

	public FoodProduct findFoodProductById(int id);

	public FoodProduct updateFoodProduct(FoodProduct foodProduct);

	public boolean deleteFoodProduct(int id);
	
	public FoodProduct findFoodProductByName(String name);
 
	public List<FoodProduct> findFoodProductByBranchId(int branchId);
	
	public List<FoodProduct> findFoodProductByMenuId(int menuId);

}
