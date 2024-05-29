package com.tyss.food_app.dao_implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.food_app.dao.MenuDao;
import com.tyss.food_app.entity.Menu;

public class MenuDaoImplementation implements MenuDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	@Override
	public Menu saveMenu(Menu menu) {
		if(menu != null) {
			et.begin();
			em.persist(menu);
			et.commit();
		}
		return null;
	}

	@Override
	public Menu findMenu(int id) {
		Menu menu=em.find(Menu.class, id);
		if(menu != null) {
			return menu;
		}
		return null;
	}

	@Override
	public boolean deleteMenu(int id) {
		
		Menu menu=em.find(Menu.class, id);
		if(menu != null) {
			et.begin();
			em.remove(menu);
			et.commit();
			return true;
		}
		return false;
	}

	@Override
	public Menu updateMenu(Menu menu) {
		if(menu != null) {
			et.begin();
			em.merge(menu);
			et.commit();
		}
		return null;
	}

}
