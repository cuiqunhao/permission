package com.permission.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.permission.dao.IOrgDao;
import com.permission.mapping.OrgMapper;
import com.permission.pojo.Org;

@Repository
public class OrgDaoImpl implements IOrgDao {

	@Resource
	OrgMapper _orgMapper;
	
	public List<Org> LoadOrgs() {
		// TODO Auto-generated method stub		
		return _orgMapper.LoadOrgs();
	}

	public List<Org> LoadByUser(Integer userId) {
		// TODO Auto-generated method stub
		return _orgMapper.LoadByUser(userId);
	}

	public List<Org> GetSubOrgs(Integer orgId) throws Exception {
		// TODO Auto-generated method stub
		String cascadeId = "0.";
		if (orgId != 0)
        {
			Org org=_orgMapper.selectByPrimaryKey(orgId);
			if (org == null){
				throw new Exception("未能找到指定对象信息");
			}
			cascadeId = org.getCascadeid();
        }
		Map<String,Object> map =new HashMap<String, Object>(2);
		map.put("cascadeId", cascadeId);
		map.put("orgId", orgId);
		return _orgMapper.GetSubOrgs(map);    
	}

}
