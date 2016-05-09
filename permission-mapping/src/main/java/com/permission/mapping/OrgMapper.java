package com.permission.mapping;

import com.permission.pojo.Org;

public interface OrgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKeyWithBLOBs(Org record);

    int updateByPrimaryKey(Org record);
}