package com.spring.handler;

import com.spring.entity.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class AnnotationHandler {
    @RequestMapping("/modelAndViewTest")
    public ModelAndView modelAndViewTest(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","kangkang");
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping("/modelTest")
    public String ModelTest(Model model ){
        //填充模型数据
        model.addAttribute("name","Jack");
        //设置逻辑视图
        return "show";
    }

    @RequestMapping("/mapTest")
    public String MapTest(Map<String,String> map){
        //填充模型数据
        map.put("name","Cat");
        //设置逻辑视图
        return "show";
    }


    /**
     * 展示商品
     */
    @RequestMapping("/addGoods")
    public ModelAndView addGoods(Goods goods){
        System.out.println(goods);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods",goods);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
