package com.tyss.food_app.dao;

import com.tyss.food_app.entity.Branch;

public interface BranchDao {
	public Branch saveBranch(Branch branch);

	public Branch findBranch(int id);

	public boolean deleteBranch(int id);

	public Branch updateBranch(Branch branch);
}
