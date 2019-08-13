package com.spring.SpringAop;

import org.springframework.stereotype.Component;

/**
 * 目标类
 *
 * 通过aop增强StudentDao
 */
@Component(value = "studentDao")
public interface StudentDao {
    public void save();
    public void find();
}
