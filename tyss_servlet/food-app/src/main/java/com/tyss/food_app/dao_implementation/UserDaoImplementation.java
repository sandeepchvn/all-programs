package com.tyss.food_app.dao_implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.food_app.dao.UserDao;
import com.tyss.food_app.entity.Users;

public class UserDaoImplementation implements UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public Users saveUser(Users users) {
		if (users != null) {
			et.begin();
			em.persist(users);
			et.commit();
			return users;
		}
		return null;
	}

	public Users findUser(int id) {
		Users users = em.find(Users.class, id);
		if (users != null) {
			return users;
		}
		return null;
	}

	public boolean deleteUser(int id) {
		Users users = em.find(Users.class, id);
		if (users != null) {
			et.begin();
			em.remove(users);
			et.commit();
			return true;
		}
		return false;
	}

	public Users updateUser(Users users) {
		if (users != null) {
			et.begin();
			em.merge(users);
			et.commit();
			return users;
		}
		return null;
	}

	public Users verifyUser(String email, String password) {
		Query query = em.createQuery("select u from Users u where u.email=?1 and u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		try {
			Users user = (Users) query.getSingleResult();
			return user;
		} catch (NoResultException e) {
			return null;
		}

//		List<Users> users = query.getResultList();
//		if (users.size() > 0) {
//			return users.get(0);
//		}
//		return null;
	}
}
