package com.permission.dao;

import java.util.List;

import com.permission.pojo.Category;

public interface ICategoryDao {
	
	 List<Category> LoadCategorys(Integer pageindex, Integer pagesize);
   
	 List<Category> LoadInOrgs(Integer... orgId);
  
     int GetCategoryCntInOrgs(Integer... orgIds);
    
     List<Category> LoadInOrgs(Integer pageindex, Integer pagesize,Integer... orgIds);
 
     void Delete(Integer id);  
}
