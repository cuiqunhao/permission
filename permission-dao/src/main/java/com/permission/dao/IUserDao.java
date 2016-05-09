package com.permission.dao;

import java.util.List;

import com.permission.pojo.User;

public interface IUserDao {

	  List<User> LoadUsers(Integer pageindex, Integer pagesize);

	  List<User> LoadInOrgs(Integer... orgId);
      
	  Integer GetUserCntInOrgs(Integer... orgIds);
      
      List<User> LoadInOrgs(Integer pageindex, Integer pagesize, Integer... orgIds);
}
