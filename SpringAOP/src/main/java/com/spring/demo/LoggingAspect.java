package com.spring.demo;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component(value = "loggingAspect")
@Aspect
public class LoggingAspect {
    @Before("execution(* com.spring.demo.Calculator.*(..)) && args(a,b,..)")
    private void arithmeticDoLog(JoinPoint joinPoint ,int a ,int b){
        System.out.println( a+" and "+ b+": "+joinPoint.toString());
    }
}

