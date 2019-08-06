package com.spring.demo.test;

import com.spring.demo.service.Impl.UserServiceImpl;
import com.spring.demo.service.UserService;
import org.junit.Test;

public class Demo01 {
    /**
     * 传统方式的调用
     */
    @Test
    public void test01(){
        UserService userService = new UserServiceImpl();
        userService.save();
    }
}
