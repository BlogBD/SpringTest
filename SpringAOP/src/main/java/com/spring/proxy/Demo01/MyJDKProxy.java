package com.spring.proxy.Demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyJDKProxy<T> implements InvocationHandler {
    private T t;
    public MyJDKProxy(T t){
        this.t=t;
    }
    public Object createProxy(){
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("save".equals(method.getName())){
            System.out.println("权限校验");
        }
        return method.invoke(t,args);
    }
}
