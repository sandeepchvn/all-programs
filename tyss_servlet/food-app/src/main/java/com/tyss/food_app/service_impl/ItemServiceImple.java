package com.tyss.food_app.service_impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.food_app.dao_implementation.ItemDaoImplementation;
import com.tyss.food_app.entity.Item;
import com.tyss.food_app.service.ItemService;

public class ItemServiceImple implements ItemService {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	ItemDaoImplementation dao = new ItemDaoImplementation();

	@Override
	public Item saveItem(Item item) {
		return dao.saveItem(item);
	}

	@Override
	public Item findItem(int id) {
		return dao.findItem(id);
	}

	@Override
	public boolean deleteItem(int id) {
		return dao.deleteItem(id);
	}

	@Override
	public Item updateItem(Item item) {
		return dao.updateItem(item);
	}

	@Override
	public List<Item> findAllItem() {
		Query query=em.createQuery("select i from Item i");
		return query.getResultList();
	}

}
