package com.permission.mapping;

import com.permission.pojo.UserExt;
import com.permission.pojo.UserExtWithBLOBs;

public interface UserExtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserExtWithBLOBs record);

    int insertSelective(UserExtWithBLOBs record);

    UserExtWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserExtWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserExtWithBLOBs record);

    int updateByPrimaryKey(UserExt record);
}