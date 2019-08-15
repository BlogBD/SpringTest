package com.spring.aspectJ.demo02;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("保存客户...");
    }

    @Override
    public void findOne() {
        System.out.println("查询一个客户...");
    }

    @Override
    public void update() {
        System.out.println("修改客户...");
    }

    @Override
    public void delete() throws Exception{
        System.out.println("删除客户...");
        int i = 1 / 0;
    }

    @Override
    public String findAll() {
        System.out.println("查询全部客户...");
        return "返回一个list集合...";
    }
}
