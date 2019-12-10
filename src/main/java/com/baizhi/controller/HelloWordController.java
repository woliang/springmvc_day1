package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWordController {

    @RequestMapping("/world")
    public String showIndex(){
        System.out.println("我是第一个springMVC程序");
        return "index";
    }

    @RequestMapping("/jumpByRedirect")
    public String jdr(){

        System.out.println("我是重定向到jsp页面！");
        return "redirect:/index.jsp";
    }



}
