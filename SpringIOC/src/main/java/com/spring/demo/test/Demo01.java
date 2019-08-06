package com.spring.demo.test;

import com.spring.demo.service.Impl.UserServiceHibernateImpl;
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
        //模拟调用UserServiceImpl实现
        UserService userService = new UserServiceImpl();
        /**
         * 如果把换成hibernate，需要修改源码才能达到效果
         */
        //UserService userService = new UserServiceHibernateImpl();
        userService.save();
    }

    /**
     * spring方式的调用
     *
     * 如果想使用hibernate，只需要修改spring的配置文件即可，
     * 不会修改源码，在编译
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
