package com.spring.demo.Demo03;

public class CarInfo {
    private String name;
    public String getName(){
        return this.name;
    }
    public Double calculatorPrice(){
        return Math.random()*3000;
    }

    public void setName(String name) {
        this.name = name;
    }
}
