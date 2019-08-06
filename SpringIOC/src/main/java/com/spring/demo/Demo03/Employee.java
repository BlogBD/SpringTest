package com.spring.demo.Demo03;

/**
 * 模拟员工有一辆车
 * 测试属性是一个对象时的属性注入
 */
public class Employee {
    private String name;
    private Car01 car;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car01 car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
