package com.spring.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyHandler implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        //装载模型数据和逻辑试图
        ModelAndView modelAndView = new ModelAndView();
        //添加数据模型
        modelAndView.addObject("name","Tom");
        //添加逻辑视图
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
