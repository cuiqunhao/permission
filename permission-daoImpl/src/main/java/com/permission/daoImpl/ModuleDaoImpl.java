package com.permission.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.permission.common.orm.PageInfo;
import com.permission.dao.IModuleDao;
import com.permission.mapping.ModuleMapper;
import com.permission.pojo.Module;

@Repository
public class ModuleDaoImpl implements IModuleDao {

	@Resource
	private ModuleMapper _moduleMapper;
	
	public Map<String, Object> LoadModules(Integer pageindex, Integer pagesize) {
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
	    List<Module> users= _moduleMapper.LoadModules(page);
	    Map<String, Object> map=new HashMap<String, Object>();
	    map.put("rows", users);
	    map.put("total ",page.getTotalResult());
		return map;
	}

	public Map<String, Object> LoadInOrgs(int pageindex, int pagesize,
			Integer... orgIds) {
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
	    List<Module> users= _moduleMapper.LoadInOrgs(page,orgIds);
	    Map<String, Object> map=new HashMap<String, Object>();
	    map.put("rows", users);
	    map.put("total ",page.getTotalResult());
		return map;
	}

	public void Delete(int id) {
		// TODO Auto-generated method stub
		_moduleMapper.deleteByPrimaryKey(id);
	}

}
