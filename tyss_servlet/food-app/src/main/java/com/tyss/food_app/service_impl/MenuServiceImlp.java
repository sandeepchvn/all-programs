package com.tyss.food_app.service_impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.food_app.dao_implementation.MenuDaoImplementation;
import com.tyss.food_app.entity.Branch;
import com.tyss.food_app.entity.Menu;
import com.tyss.food_app.entity.Users;
import com.tyss.food_app.service.MenuService;

public class MenuServiceImlp implements MenuService {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	MenuDaoImplementation dao = new MenuDaoImplementation();

	@Override
	public Menu saveMenu(Menu menu) {
		return dao.saveMenu(menu);
	}

	@Override
	public Menu updateMenu(Menu menu) {
		return dao.updateMenu(menu);
	}

	@Override
	public boolean deleteMenu(int id) {
		return dao.deleteMenu(id);
	}

	@Override
	public Menu findMenu(int id) {
		return dao.findMenu(id);
	}

	@Override
	public List<Menu> getAllMenu() {
		Query query = em.createQuery("select m from Menu m");
		List<Menu> menus = query.getResultList();
		return menus;
	}

	@Override
	public Menu getMenuByUserId(int id) {
		Query query = em.createQuery("select m from Menu m where m.users.id=?1");
		query.setParameter(1, id);
		Menu menu = (Menu) query.getSingleResult();
		return menu;
	}

	@Override
	public Menu getMenuByBranchId(int branchId) {
		Branch branch=em.find(Branch.class, branchId);
		Users u= branch.getUsers();
		Menu menu=u.getMenu();
		return menu;
	}

}
