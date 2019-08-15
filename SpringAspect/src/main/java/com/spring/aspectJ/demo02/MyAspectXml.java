package com.spring.aspectJ.demo02;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXml {
    /**
     * 前置通知
     */
    public void before() {
        System.out.println("\n========前置通知=========");
    }

    /**
     * 后置通知
     */
    public void afterReturning(Object o) {
        System.out.println("===========后置通知============\n" + o);
    }

    /**
     * 最终通知
     */
    public void after() {
        System.out.println("==========最终通知========");
    }

    /**
     * 环绕通知
     *
     * @param joinPoint
     * @return
     */
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("\n=======环绕通知==前=======");
        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("=======环绕通知==后=======\n");
        return proceed;
    }

    /**
     * 异常通知
     */
    public void afterThrowing(Throwable e) {
        System.out.println("============异常通知==========" + e);
    }

    /*分割线*/
    public void line() {
        System.err.println("\n----------------------------------------------------------\n");
    }
}
