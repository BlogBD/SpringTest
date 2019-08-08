package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculator calculator = (Calculator) context.getBean("calculator" ,Calculator.class);
        System.out.println(calculator.add(4,5));
        System.out.println(calculator.sub(4,5));
    }
}
