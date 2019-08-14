package com.spring.AutoProxy;

import org.springframework.stereotype.Component;

@Component(value = "studentDaoImpl")
public class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("保存学生");
    }

    @Override
    public void find() {
        System.out.println("查找学生");
    }
}
