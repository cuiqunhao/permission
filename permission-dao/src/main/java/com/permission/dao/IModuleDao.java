package com.permission.dao;


import java.util.Map;

public interface IModuleDao {

	Map<String, Object> LoadModules(Integer pageindex, Integer pagesize);

	Map<String, Object> LoadInOrgs(int pageindex, int pagesize, Integer... orgIds); 
	
    void Delete(int id);
     
}
