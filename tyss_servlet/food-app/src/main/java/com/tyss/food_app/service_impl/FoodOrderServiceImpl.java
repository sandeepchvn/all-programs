package com.tyss.food_app.service_impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.food_app.dao_implementation.FoodOrderDaoImplementation;
import com.tyss.food_app.entity.FoodOrder;
import com.tyss.food_app.entity.Item;
import com.tyss.food_app.service.FoodOrderService;

public class FoodOrderServiceImpl implements FoodOrderService{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	FoodOrderDaoImplementation dao=new FoodOrderDaoImplementation();
	@Override
	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		return dao.saveFoodOrder(foodOrder);
	}

	@Override
	public FoodOrder findFoodOrder(int id) {
		return dao.findFoodOrder(id);
	}

	@Override
	public boolean deletFoodOrder(int id) {
		return dao.deletFoodOrder(id);
	}

	@Override
	public FoodOrder updaFoodOrder(FoodOrder foodOrder) {
		return dao.updaFoodOrder(foodOrder);
	}

	@Override
	public FoodOrder getTotalPriceOfItem(int orderId) {
		FoodOrder foodOrder=em.find(FoodOrder.class, orderId);
		List<Item> items=foodOrder.getItems();
		double totalPrice=0;
		for (Item item : items) {
			totalPrice=totalPrice+item.getPrice();
		}
		foodOrder.setTotalPrice(totalPrice);
		et.begin();
		em.merge(foodOrder);
		et.commit();
		return foodOrder;
	}

	
}
