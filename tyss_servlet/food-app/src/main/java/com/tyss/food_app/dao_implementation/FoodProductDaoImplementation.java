package com.tyss.food_app.dao_implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.food_app.dao.FoodProductDao;
import com.tyss.food_app.entity.FoodProduct;

public class FoodProductDaoImplementation implements FoodProductDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	@Override
	public FoodProduct saveFoodProduct(FoodProduct foodProduct) {
		if (foodProduct != null) {
			et.begin();
			em.persist(foodProduct);
			et.commit();
			return foodProduct;
		}
		return null;
	}

	@Override
	public FoodProduct findFoodProduct(int id) {
		FoodProduct foodProduct = em.find(FoodProduct.class, id);
		if (foodProduct != null) {
			return foodProduct;
		}
		return null;
	}

	@Override
	public FoodProduct updateFoodProduct(FoodProduct foodProduct) {
		if (foodProduct != null) {
			et.begin();
			em.merge(foodProduct);
			et.commit();
		}
		return null;
	}

	@Override
	public boolean deleteFoodProduct(int id) {
		FoodProduct foodProduct = em.find(FoodProduct.class, id);
		if (foodProduct != null) {
			et.begin();
			em.remove(foodProduct);
			et.commit();
			return true;
		}
		return false;
	}

}
