package com.tyss.food_app.dao_implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.food_app.dao.BranchDao;
import com.tyss.food_app.entity.Branch;

public class BranchDaoImplemetation implements BranchDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	@Override
	public Branch saveBranch(Branch branch) {
		if (branch != null) {
			et.begin();
			em.persist(branch);
			et.commit();
			return branch;
		}
		return null;
	}

	@Override
	public Branch findBranch(int id) {
		Branch branch = em.find(Branch.class, id);
		if (branch != null) {
			return branch;
		}
		return null;
	}

	@Override
	public boolean deleteBranch(int id) {

		Branch branch = em.find(Branch.class, id);
		if (branch != null) {
			et.begin();
			em.remove(branch);
			et.commit();
			return true;
		}
		return false;
	}

	@Override
	public Branch updateBranch(Branch branch) {
		if (branch != null) {
			et.begin();
			em.merge(branch);
			et.commit();
			return branch;
		}
		return null;
	}

}
