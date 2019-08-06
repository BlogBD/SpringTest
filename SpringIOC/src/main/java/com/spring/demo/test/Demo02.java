package com.spring.demo.test;

import com.spring.demo.Demo02.CustomerDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试demo02的模块
 *
 * Bean的生命周期
 */
public class Demo02 {
    /**
     * 测试Bean 的生命周期
     */
    @Test
    public void test01(){
        ClassPathXmlApplicationContext  applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = (CustomerDao)applicationContext.getBean("customerDao");
        customerDao.save();
        //销毁这个对象
        applicationContext.close();
    }

    /**
     * Bean的作用域
     * 默认以单例创建对象
     */
    @Test
    public void test02(){
        ClassPathXmlApplicationContext  applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao01 = (CustomerDao)applicationContext.getBean("customerDao");
        CustomerDao customerDao02 = (CustomerDao)applicationContext.getBean("customerDao");
        if (customerDao01==customerDao02) {
            System.out.println("单例模式");
        }else {
            System.out.println("不是单例模式");
        }
        applicationContext.close();
    }
}
