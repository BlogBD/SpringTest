package com.spring.SpringAop;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {

  //  @Resource(name = "studentDaoImpl")
    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao;

    @org.junit.Test
    public void test01(){
        studentDao.find();
        studentDao.save();
    }

}
