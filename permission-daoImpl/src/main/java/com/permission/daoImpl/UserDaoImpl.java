package com.permission.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.permission.dao.IUserDao;
import com.permission.mapping.UserMapper;
import com.permission.pojo.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Resource
	private UserMapper _userMapper;
	
	public List<User> LoadUsers(Integer pageindex, Integer pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> LoadInOrgs(Integer... orgId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer GetUserCntInOrgs(Integer... orgIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> LoadInOrgs(Integer pageindex, Integer pagesize,
			Integer... orgIds) {
		// TODO Auto-generated method stub
		return null;
	}

}
