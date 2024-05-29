package com.tyss.food_app.entity;

import com.tyss.food_app.dao_implementation.BranchDaoImplemetation;

public class DriverBranch {
	public static void main(String[] args) {
		BranchDaoImplemetation dao=new BranchDaoImplemetation();
		
//		Branch branch=new Branch();
//		branch.setName("btm");
//		branch.setAddress("btm lay out");
//		dao.saveBranch(branch);
		
//		Branch branch=dao.findBranch(1);
//		branch.setEmail("s@m");
//		dao.updateBranch(branch);
		
		
//		dao.deleteBranch(1);
		
		dao.findBranch(1);
	}
}
