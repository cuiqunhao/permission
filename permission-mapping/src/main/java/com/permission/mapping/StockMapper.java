package com.permission.mapping;

import com.permission.pojo.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKeyWithBLOBs(Stock record);

    int updateByPrimaryKey(Stock record);
}