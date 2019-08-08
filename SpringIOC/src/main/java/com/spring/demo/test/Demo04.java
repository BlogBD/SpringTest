package com.spring.demo.test;

import com.spring.demo.Demo04.CollectionBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 集合类型的属性注入
 */
public class Demo04 {
    /**
     * 注入数组测试
     */
    @Test
    public void test01(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.toString());

    }
    @Test
    public void test02(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.toString());

    }
}
