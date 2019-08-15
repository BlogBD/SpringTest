package com.spring.aspectJ.demo02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext01.xml")
public class TestDemo02 {

    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void test01(){
        customerDao.save();
        customerDao.findAll();
        try {
            customerDao.delete();
        } catch (Exception e) {
        }
        customerDao.findOne();
        customerDao.update();
    }
}
