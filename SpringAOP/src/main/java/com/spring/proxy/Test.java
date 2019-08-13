package com.spring.proxy;

import com.spring.proxy.Demo01.MyJDKProxy;
import com.spring.proxy.Demo01.UserDao;
import com.spring.proxy.Demo01.UserDaoImpl;
import com.spring.proxy.Demo02.MyCglibProxy;
import com.spring.proxy.Demo02.ProductDao;

public class Test {
    /**
     * 使用jdk的Proxy代理类
     */
    @org.junit.Test
    public void test01(){
        UserDao userDao = (UserDao) new UserDaoImpl();
        userDao.save();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>代理增强后>>>>>>>>>>>>");
        UserDao proxy=(UserDao) new MyJDKProxy<UserDao>(userDao).createProxy();
        proxy.save();

    }

    /**
     * 使用Cglib
     */
    @org.junit.Test
    public void test02(){
        ProductDao productDao = new ProductDao();
        MyCglibProxy myCglibProxy = new MyCglibProxy(productDao);
        ProductDao proxy = (ProductDao) myCglibProxy.createProxy();
        proxy.save();
    }
}