package com.permission.daoImpl;

import java.util.List;

import com.permission.dao.ICategoryDao;
import com.permission.pojo.Category;

public class CategoryDao implements ICategoryDao {

	public List<Category> LoadCategorys(Integer pageindex, Integer pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> LoadInOrgs(Integer... orgId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int GetCategoryCntInOrgs(Integer... orgIds) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Category> LoadInOrgs(Integer pageindex, Integer pagesize,
			Integer... orgIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
