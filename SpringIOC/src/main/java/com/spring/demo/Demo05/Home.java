package com.spring.demo.Demo05;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Home {
    //@Autowired
    @Resource
    private  Cat cat;

    @PostConstruct
    public void init(){
        System.out.println("destroy the Home");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy the Home");
    }

    @Override
    public String toString() {
        return "Home{" +
                "cat=" + cat +
                '}';
    }
}
