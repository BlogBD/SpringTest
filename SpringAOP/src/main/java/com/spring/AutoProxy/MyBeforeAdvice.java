package com.spring.AutoProxy;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 前置通知类型
 */
@Component(value = "myBeforeAdvice")
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("\n================这是前置通知增强==============");
    }
}
