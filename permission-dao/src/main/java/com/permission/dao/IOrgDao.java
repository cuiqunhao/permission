package com.permission.dao;

import java.util.List;

import com.permission.pojo.Org;

public interface IOrgDao {
	
	 List<Org> LoadOrgs();
  
     List<Org> LoadByUser(Integer userId);

     List<Org> GetSubOrgs(Integer orgId) throws Exception;

}
