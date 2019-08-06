package com.spring.demo.test;

import com.spring.demo.Demo01.Impl.UserServiceImpl;
import com.spring.demo.Demo01.service.UserService;
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

    /**
     *传统给属性赋值
     */
    @Test
    public void test03(){
        /**
         * 无法给属性赋值，所以要赋值就不能用多态了，面向接口编程也无法实现
         */
        //UserService userService = new UserServiceImpl();
        //实现给属性赋值
        UserServiceImpl userService = new UserServiceImpl();
        userService.setName("王五");
        userService.save();
    }

    /**
     * 通过spring的DI（依赖注入）
     * <property name="name" value="小红"/>实现了给属性赋值
     */
    @Test
    public void test04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获取类
        UserService userService = (UserService)applicationContext.getBean("UserService");
        userService.save();
    }
}
