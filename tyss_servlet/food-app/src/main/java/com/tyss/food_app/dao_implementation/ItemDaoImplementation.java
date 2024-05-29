package com.tyss.food_app.dao_implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.food_app.dao.ItemDao;
import com.tyss.food_app.entity.Item;

public class ItemDaoImplementation implements ItemDao{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	@Override
	public Item saveItem(Item item) {
		if(item != null) {
			et.begin();
			em.persist(item);
			et.commit();
		}
		return null;
	}

	@Override
	public Item findItem(int id) {
		Item item=em.find(Item.class, id);
		if(item != null) {
			return item;
		}
		return null;
	}

	@Override
	public boolean deleteItem(int id) {
		Item item=em.find(Item.class, id);
		if(item != null) {
			et.begin();
			em.remove(item);
			et.commit();
			return true;
		}
		return false;
	}

	@Override
	public Item updateItem(Item item) {
		if(item != null) {
			et.begin();
			em.merge(item);
			et.commit();
			return item;
		}
		return item;
	}

}
