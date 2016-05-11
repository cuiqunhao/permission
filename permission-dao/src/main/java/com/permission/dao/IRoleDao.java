package com.permission.dao;

import java.util.List;

import com.permission.pojo.Role;

public interface IRoleDao {

	  List<Role> LoadRoles(Integer pageindex, Integer pagesize);
   
	  Integer GetRoleCntInOrgs(Integer... orgIds);
      
	  List<Role> LoadInOrgs(Integer pageindex, Integer pagesize, Integer... orgIds);
     
      void Delete(Integer id);
   
	  List<Role> LoadInOrgs(Integer... orgId);    
}
