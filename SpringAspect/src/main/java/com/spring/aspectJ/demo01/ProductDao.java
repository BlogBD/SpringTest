package com.spring.aspectJ.demo01;

public class ProductDao {
    public void save(){
        System.out.println("保存商品...");
    }


    public void findAll(){
        System.out.println("查找全部商品...");
    }

    public void findOne(){
        System.out.println("查找一个商品...");
       // int i=1/0;
    }

    public void delete(){
        System.out.println("删除商品...");
    }

    public String update(){
        System.out.println("更新商品...");
        return "hello";
    }
}
