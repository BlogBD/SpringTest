package com.spring.demo.Demo02;

public class CustomerDaoImpl implements CustomerDao {
    public void setup(){
        System.out.println("CustomerDaoImpl被初始化了...");
    }

    @Override
    public void save() {
        System.out.println("CustomerDaoImpl执行了...");
    }

    public void destroy(){
        System.out.println("CustomerDaoImpl被销毁了...");
    }
}
