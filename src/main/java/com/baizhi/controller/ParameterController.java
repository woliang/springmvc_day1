package com.baizhi.controller;

import com.baizhi.entity.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.security.util.Resources_es;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/parameter")
public class ParameterController {

    @RequestMapping("para1")
    public void para1(HttpServletRequest request, HttpServletResponse response){
        if("梁鑫元".equals(request.getParameter("username"))){
            try {
                response.setCharacterEncoding("UTF-8");
                PrintWriter writer = response.getWriter();
                writer.println("<html><head><meta charset='UTF-8'/></head><body>你是真的酷！</body></html>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @RequestMapping("para2")
    public String para2(@RequestParam("username") String name, String age){
        System.out.println(name+"---------"+age);
        return "index";
    }


    @RequestMapping("para3")
    public String para3(User user){
        System.out.println(user);
        return "index";
    }


}
