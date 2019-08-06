package com.spring.demo.service.Impl;

import com.spring.demo.service.UserService;

/**
 * 模拟不同的实现
 */
public class UserServiceHibernateImpl implements UserService {
    @Override
    public void save() {
        System.out.println("UserServiceHibernateImpl执行...");
    }
}
