package com.spring.demo.test;

import com.spring.demo.Demo05.Cat;
import com.spring.demo.Demo05.Home;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试用注解形式定义bean
 */
public class Demo05 {
    /**
     * 注解方式配置bean
     */
    @Test
    public void test01(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat);
    }

    /**
     * 自动装箱
     */
    @Test
    public void test02(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
        Home home = (Home) applicationContext.getBean("home");
        System.out.println(home.toString());
        ((ClassPathXmlApplicationContext) applicationContext).close();//bean生命周期测试
    }
}
