package com.tyss.food_app.service;

import java.util.List;

import com.tyss.food_app.entity.Branch;
import com.tyss.food_app.entity.Users;

public interface BranchService {
	Branch saveBranch(Branch branch);
	Branch findBranchById(int id);
	boolean deleteBranch(int id);
	Branch updateBranch(Branch branch);
	Users getBranchManagerByBranchId(int branchId);
	Branch getBranchByBranchName(String name);
	List<Branch> getAllBranch();
}
