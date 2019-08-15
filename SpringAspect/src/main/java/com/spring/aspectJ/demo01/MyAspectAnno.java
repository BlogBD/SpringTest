package com.spring.aspectJ.demo01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 */
@Aspect
public class MyAspectAnno {
    /**
     * 前置通知
     * @param joinPoint
     */
    @Before(value = "myPointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("\n》》》》》》》》》前置通知》》》》》》》》》》"+joinPoint);
    }

    /**
     * 后置通知
     * @param result
     */
    @AfterReturning(value = "execution(* com.spring.aspectJ.demo01.ProductDao.update(..))" ,returning = "result")
    public void afterReturning(Object result){
        System.out.println("》》》》》》》》》后置通知》》》》》》》》》》"+result+"\n");
    }

    /**
     * 环绕通知
     * @param joinPoint
     */
    @Around(value = "execution(* com.spring.aspectJ.demo01.ProductDao.delete(..)))")
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("环绕前通知");
        try {
            Object proceed = joinPoint.proceed();//执行目标方法
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后通知");
    }

    /**
     * 最终通知
     */
    @After(value = "execution(* com.spring.aspectJ.demo01.ProductDao.findAll(..)))")
    public void after(){
        System.out.println("》》》》》》》》》最终通知》》》》》》》》》》");
    }

    @AfterThrowing(value = "execution(* com.spring.aspectJ.demo01.ProductDao.findOne(..)))",throwing = "e")
    public void  afterThrowing(Throwable e){
        System.out.println("异常抛出通知============="+e.getMessage());
    }

    @Pointcut(value = "execution(* com.spring.aspectJ.demo01.ProductDao.save(..))")
    public void myPointcut(){}
}
