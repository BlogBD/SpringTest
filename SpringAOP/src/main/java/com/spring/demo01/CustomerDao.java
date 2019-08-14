package com.spring.demo01;

import org.springframework.stereotype.Component;

@Component(value = "customerDao")
public class CustomerDao {
    public void find(){
        System.out.println("查询客户...");
    }

    public void save(){
        System.out.println("保存客户..");
    }
}
