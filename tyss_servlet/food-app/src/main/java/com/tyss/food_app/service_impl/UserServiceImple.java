package com.tyss.food_app.service_impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.food_app.dao_implementation.UserDaoImplementation;
import com.tyss.food_app.entity.Users;
import com.tyss.food_app.service.UserService;

public class UserServiceImple implements UserService {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	UserDaoImplementation dao=new UserDaoImplementation();
	
	@Override
	public Users loginUser(String email, String password) {

		
		return dao.verifyUser(email, password);
	}

	@Override
	public Users saveUser(Users u) {
		
		return dao.saveUser(u);
	}

	@Override
	public Users getByUserId(int id) {
		
		return dao.findUser(id);
	}

	@Override
	public Users getByUserName(String name) {
		Query query=em.createQuery("select u from Users u where u.name=?1");
		query.setParameter(1, name);
		Users u=(Users)query.getSingleResult();
		return u;
	}

	@Override
	public Users getByEmail(String email) {
		Query query=em.createQuery("select u from Users u where u.email=?1");
		query.setParameter(1, email);
		Users u=(Users)query.getSingleResult();
		return u;
	}

	
	@Override
	public Users updateUser(Users u) {
		
		return dao.updateUser(u);
	}

	@Override
	public boolean deleteUser(int id) {
		
		return dao.deleteUser(id);
	}

	
	

}
