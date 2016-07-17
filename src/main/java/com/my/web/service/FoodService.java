package com.my.web.service;

import com.my.web.model.Food;

public interface FoodService {

	
    public Food selectByPrimaryKey(Integer id);
    public int insertSelective(Food food) throws Exception;

}
