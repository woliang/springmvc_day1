package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/request")
public class ReceiveController {

    @RequestMapping("get")
    public String r1(String username,Integer age){
        System.out.println(username+"--------"+age);
        return "index";
    }

    @RequestMapping(value = "post",method = RequestMethod.POST)
    public String r2(String username,Integer age){

        System.out.println(username+"------"+age);
        return "index";

    }




}
