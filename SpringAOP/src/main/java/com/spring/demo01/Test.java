package com.spring.demo01;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext01.xml")
public class Test {
    @Resource(name = "studentDaoProxy")
    private CustomerDao customerDao;

    @org.junit.Test
    public void test01() {
        customerDao.find();
        customerDao.save();
    }
}
