package com.spring.AutoProxy;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext02.xml")
public class Test {
    @Resource(name = "studentDaoImpl")
    private StudentDao studentDao;
    @Resource(name = "customerDao")
    private CustomerDao customerDao;


    @org.junit.Test
    public void test01(){
        studentDao.find();
        customerDao.find();
    }
}
