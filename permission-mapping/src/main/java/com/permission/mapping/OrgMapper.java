package com.permission.mapping;

import java.util.List;
import java.util.Map;

import com.permission.pojo.Org;

public interface OrgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(Integer id);
    
    List<Org> LoadOrgs();
    
    List<Org> LoadByUser(Integer userId);
    
    List<Org> GetSubOrgs(Map<String,Object> map);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKeyWithBLOBs(Org record);

    int updateByPrimaryKey(Org record);
}