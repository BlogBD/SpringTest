package com.spring.demo.Demo01.Impl;

import com.spring.demo.Demo01.service.UserService;

/**
 * 模拟不同的实现
 */
public class UserServiceHibernateImpl implements UserService {
    @Override
    public void save() {
        System.out.println("UserServiceHibernateImpl执行...");
    }
}
