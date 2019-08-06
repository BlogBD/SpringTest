package com.spring.demo.test;

import com.spring.demo.Demo03.Car;
import com.spring.demo.Demo03.Car01;
import com.spring.demo.Demo03.Employee;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试属性注入的方式
 */
public class Demo03 {
    /**
     * 测试构造方法注入属性
     */
    @Test
    public void test01(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car.toString());
    }

    /**
     * 使用set方法属性注入
     */
    @Test
    public void test02(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car01 car = (Car01) applicationContext.getBean("car01");
        System.out.println(car.toString());
    }
    /**
     * 使用set方法属性注入一个对象
     */
    @Test
    public void test03(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.toString());
    }
}
