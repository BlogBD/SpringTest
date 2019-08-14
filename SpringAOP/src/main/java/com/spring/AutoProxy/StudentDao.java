package com.spring.AutoProxy;

import org.springframework.stereotype.Component;

/**
 * 目标类
 *
 * 通过aop增强StudentDao
 */
public interface StudentDao {
    public void save();
    public void find();
}
