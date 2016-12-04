package com.my.web.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.my.web.model.Food;
import com.my.web.service.FoodService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"}) 
public class MyControllerTest {
	private static Logger logger = Logger.getLogger(MyControllerTest.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private FoodService foodService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        Food food = foodService.selectByPrimaryKey(1);  
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(food));  
    } 
}
