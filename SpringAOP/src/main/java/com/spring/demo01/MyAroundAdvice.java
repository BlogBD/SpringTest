package com.spring .demo01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * 带有切入点的切面
 */
@Component(value = "myAroundAdvice")
public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前========增强");
        Object proceed = methodInvocation.proceed();
        System.out.println("环绕后========增强");
        return proceed;
    }
}
