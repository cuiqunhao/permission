package com.permission.mapping;

import com.permission.pojo.Relevance;

public interface RelevanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Relevance record);

    int insertSelective(Relevance record);

    Relevance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Relevance record);

    int updateByPrimaryKey(Relevance record);
}