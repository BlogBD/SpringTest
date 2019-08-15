package com.spring.aspectJ.demo02;

public interface CustomerDao {
    public void save();
    public void findOne();
    public void update();
    public void delete() throws Exception;
    public String findAll();
}
