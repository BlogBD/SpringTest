package com.spring.demo.test;

import com.spring.demo.service.Impl.UserServiceImpl;
import com.spring.demo.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01 {
    /**
     * 传统方式的调用
     */
    @Test
    public void test01(){
        UserService userService = new UserServiceImpl();
        userService.save();
    }

    /**
     * spring方式的调用
     */
    @Test
    public void test02(){
        //创建spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获取类
        UserService userService = (UserService)applicationContext.getBean("UserService");
        userService.save();
    }
}
