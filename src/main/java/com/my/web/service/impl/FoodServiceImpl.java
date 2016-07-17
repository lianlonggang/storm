package com.my.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.web.dao.FoodMapper;
import com.my.web.model.Food;
import com.my.web.service.FoodService;

@Service("foodService")
public class FoodServiceImpl implements FoodService {

	@Resource
	private FoodMapper foodMapper;

	@Override
	public Food selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.foodMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insertSelective(Food food) throws Exception {
		// TODO Auto-generated method stub
		int b = this.foodMapper.insertSelective(food);
		return b;
	}

}
