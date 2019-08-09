package com.springjdbc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {
    public static void main(String[] args) {
        ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateDao jdbcTemplateDao = (JdbcTemplateDao) context.getBean("jdbcTemplateDao" ,JdbcTemplateDao.class);
        //jdbcTemplateDao.creatTable();
        //jdbcTemplateDao.insertData();
        //  System.out.println(jdbcTemplateDao.count());
        jdbcTemplateDao.getAll().forEach(System.out::println);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
