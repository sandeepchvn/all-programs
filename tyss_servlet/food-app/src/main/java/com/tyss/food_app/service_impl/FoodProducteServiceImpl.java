package com.tyss.food_app.service_impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.food_app.dao_implementation.FoodProductDaoImplementation;
import com.tyss.food_app.entity.Branch;
import com.tyss.food_app.entity.FoodProduct;
import com.tyss.food_app.entity.Menu;
import com.tyss.food_app.entity.Users;
import com.tyss.food_app.service.FoodProductService;

public class FoodProducteServiceImpl implements FoodProductService{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	FoodProductDaoImplementation dao=new FoodProductDaoImplementation();
	
	@Override
	public FoodProduct saveFoodProduct(FoodProduct foodProduct) {
		return dao.saveFoodProduct(foodProduct);
	}

	@Override
	public FoodProduct findFoodProductById(int id) {
		return dao.findFoodProduct(id);
	}

	@Override
	public FoodProduct updateFoodProduct(FoodProduct foodProduct) {
		return dao.updateFoodProduct(foodProduct);
	}

	@Override
	public boolean deleteFoodProduct(int id) {
		return dao.deleteFoodProduct(id);
	}

	@Override
	public FoodProduct findFoodProductByName(String name) {
		Query query=em.createQuery("select f from FoodProduct f where f.name=?1");
		query.setParameter(1, name);
		FoodProduct foodProduct=(FoodProduct)query.getSingleResult();
		return foodProduct;
	}

	@Override
	public List<FoodProduct> findFoodProductByBranchId(int branchId) {
		
		Branch branch=em.find(Branch.class, branchId);
		Users u=branch.getUsers();
		Menu menu= u.getMenu();
		List<FoodProduct> foodProducts=menu.getFoodProducts();
		return foodProducts;
	}

	@Override
	public List<FoodProduct>findFoodProductByMenuId(int menuId) {
		Menu menu=em.find(Menu.class, menuId);
		List<FoodProduct> foodProducts=menu.getFoodProducts();
		return foodProducts;
	}

}
