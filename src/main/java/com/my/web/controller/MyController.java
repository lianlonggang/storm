package com.my.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.web.model.Food;
import com.my.web.service.FoodService;

@Controller
@RequestMapping("/my")
public class MyController {
	@Resource
	private FoodService foodService;
	@RequestMapping("/login") //用来处理前台的login请求  
    private @ResponseBody String hello(  
            @RequestParam(value = "username", required = false)String username,  
            @RequestParam(value = "password", required = false)String password  
            ){  
		
		Food food = new Food();
		food.setAcronym("test1");
		food.setDescription("test2");
		food.setHide(true);
//		food.setId(2);
		food.setName("test3");
		food.setNumber("test4");
		food.setPrice(1d);
		food.setType(1);
		try {
			foodService.insertSelective(food);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Food food = foodService.selectByPrimaryKey(1);
		System.out.println(food.getAcronym());
        return "Hello "+username+",Your password is: "+password;  
          
    }  
}
