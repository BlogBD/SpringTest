package com.spring.demo;

import org.springframework.stereotype.Component;

@Component(value = "calculator")
public class Calculator {
    public int add(int  a,int b){
        return a+b;
    }

    public int sub(int a,int b ){
        return a-b;
    }
}
