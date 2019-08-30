package com.springmvc.interceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    /**
     * 跳转index界面
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
