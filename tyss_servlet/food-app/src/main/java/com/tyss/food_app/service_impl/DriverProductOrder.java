package com.tyss.food_app.service_impl;

import java.util.Arrays;
import java.util.List;

import com.tyss.food_app.entity.FoodOrder;
import com.tyss.food_app.entity.Item;

public class DriverProductOrder {
	public static void main(String[] args) {

		FoodOrderServiceImpl fo=new FoodOrderServiceImpl();
//		FoodOrder foodOrder=new FoodOrder();
//		foodOrder.setContactNumber(654234);
//		foodOrder.setCustomerName("san");
//		foodOrder.setStatus("ordered");
		
//		ItemServiceImple io=new ItemServiceImple();
//		Item i1=io.findItem(1);
//		Item i2=io.findItem(2);
//		List<Item> items=Arrays.asList(i1,i2) ;
//		
//		foodOrder.setItems(items);
		FoodOrder order=fo.getTotalPriceOfItem(2);
		fo.updaFoodOrder(order);
		System.out.println(order.getTotalPrice());
//		fo.saveFoodOrder();
	}
}
