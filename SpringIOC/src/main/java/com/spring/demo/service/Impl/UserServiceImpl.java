package com.spring.demo.service.Impl;

import com.spring.demo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("保存");
    }
}
