package com.springjdbc.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
        MybatisUserDao mybatisUserDao = context.getBean("mybatisUserDao", MybatisUserDao.class);
        mybatisUserDao.getAll().forEach(System.out::println);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
