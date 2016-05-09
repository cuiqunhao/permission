package com.permission.mapping;

import com.permission.pojo.Param;

public interface ParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Param record);

    int insertSelective(Param record);

    Param selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Param record);

    int updateByPrimaryKey(Param record);
}