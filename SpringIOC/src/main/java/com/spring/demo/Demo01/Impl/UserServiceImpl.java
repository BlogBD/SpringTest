package com.spring.demo.Demo01.Impl;

import com.spring.demo.Demo01.service.UserService;

public class UserServiceImpl implements UserService {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("UserServiceImpl执行..."+name);
    }
}
