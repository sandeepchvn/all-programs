package com.tyss.food_app.dao_implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.food_app.dao.FoodOrderDao;
import com.tyss.food_app.entity.FoodOrder;

public class FoodOrderDaoImplementation implements FoodOrderDao{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	@Override
	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		if(foodOrder != null) {
			et.begin();
			em.persist(foodOrder);
			et.commit();
			return foodOrder;
		}
		return null;
	}

	@Override
	public FoodOrder findFoodOrder(int id) {
		FoodOrder foodOrder=em.find(FoodOrder.class, id);
		if( foodOrder != null) {
			return foodOrder;
		}
		return null;
	}

	@Override
	public boolean deletFoodOrder(int id) {
		FoodOrder foodOrder=em.find(FoodOrder.class, id);
		if(foodOrder !=  null) {
			et.begin();
			em.remove(foodOrder);
			et.commit();
			return true;
		}
		return false;
	}

	@Override
	public FoodOrder updaFoodOrder(FoodOrder foodOrder) {
		if(foodOrder != null) 
		{
			et.begin();
			em.merge(foodOrder);
			et.commit();
			return foodOrder;
		}
		return null;
	}

}
