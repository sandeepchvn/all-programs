package com.tyss.food_app.service_impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.food_app.dao_implementation.BranchDaoImplemetation;
import com.tyss.food_app.entity.Branch;
import com.tyss.food_app.entity.Users;
import com.tyss.food_app.service.BranchService;

public class BranchServiceImple implements BranchService{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	BranchDaoImplemetation dao=new BranchDaoImplemetation();
	@Override
	public Branch saveBranch(Branch branch) {
		return dao.saveBranch(branch);
	}

	@Override
	public Branch findBranchById(int id) {
		return dao.findBranch(id);
	}

	@Override
	public boolean deleteBranch(int id) {
		return dao.deleteBranch(id);
	}

	@Override
	public Branch updateBranch(Branch branch) {
		return dao.updateBranch(branch);
	}

	@Override
	public Users getBranchManagerByBranchId(int branchId) {
		Query query=em.createQuery("select b.users from Branch b where b.id=?1");
		query.setParameter(1, branchId);
		Users u=(Users)query.getSingleResult();
		return u;
	}

	@Override
	public Branch getBranchByBranchName(String name) {
		Query query=em.createQuery("select b from Branch b where b.name=?1");
		query.setParameter(1, name);
		Branch b=(Branch)query.getSingleResult();
		return b;
	}

	@Override
	public List<Branch> getAllBranch() {
		Query query=em.createQuery("select b from Branch b");
		List<Branch> branchs=query.getResultList();
		return branchs;
	}

}
