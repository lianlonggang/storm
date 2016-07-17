package com.my.web.dao;

import com.my.web.model.FoodSub;

public interface FoodSubMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FoodSub record);

    int insertSelective(FoodSub record);

    FoodSub selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FoodSub record);

    int updateByPrimaryKey(FoodSub record);
}