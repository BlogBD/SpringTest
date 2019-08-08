package com.spring.demo.Demo05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component( value = "cat")
public class Cat {
    @Value("小菊")
    private  String name;
    @Value("白色")
    private String color;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
