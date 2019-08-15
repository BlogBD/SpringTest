package com.spring.aspectJ.demo01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试类
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo01 {

    @Resource(name = "productDao")
    private ProductDao productDao;

    @Test
    public void test01(){
        productDao.save();
        productDao.delete();
        productDao.findAll();
        productDao.update();
        productDao.findAll();
        productDao.findOne();
    }

}
