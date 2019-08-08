package com.spring.demo;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LoggingAspect {
    @Before("execution(* com.spring.demo.Calculator.*(..))")
    private void arithmeticDoLog(JoinPoint joinPoint){
        System.out.println(joinPoint.toString());
    }
}

