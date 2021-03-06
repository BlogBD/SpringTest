package com.springjdbc.mybatis;

import com.springjdbc.demo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
       /* MybatisUserDao mybatisUserDao = context.getBean("mybatisUserDao", MybatisUserDao.class);
        // mybatisUserDao.getAll().forEach(System.out::println);
        Student userById = mybatisUserDao.getUserById("2016211045");
        System.out.println(userById);*/

        MybatisUserService service = context.getBean("mybatisUserService", MybatisUserService.class);
        System.out.println(service.findById("2016211045"));
        service.getAll().forEach(System.out::println);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
