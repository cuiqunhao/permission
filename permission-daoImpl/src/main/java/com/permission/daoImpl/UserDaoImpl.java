package com.permission.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.permission.common.orm.PageInfo;
import com.permission.dao.IUserDao;
import com.permission.mapping.UserMapper;
import com.permission.pojo.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Resource
	private UserMapper _userMapper;
	
	public Map<String, Object> LoadUsers(Integer pageindex, Integer pagesize) {
		// TODO Auto-generated method stub
		 int currentPage = pageindex;
	     int pageSize = 3;
	     if (currentPage<=0){
	         currentPage =1;
	     }
	    int currentResult = (currentPage-1) * pageSize;	               
	    PageInfo page = new PageInfo();
	    page.setShowCount(pageSize);
	    page.setCurrentResult(currentResult);
	    List<User> users= _userMapper.LoadUsers(page);
	    Map<String, Object> map=new HashMap<String, Object>();
	    map.put("rows", users);
	    map.put("total ",page.getTotalResult());
		return map;	
	}


}
