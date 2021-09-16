package com.bsc.controller;

import com.bsc.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping(value = "/returnstring.do")
    public String doSome(HttpServletRequest request, String name, int age){
        ModelAndView mv = new ModelAndView();
        request.setAttribute("name",name);
        request.setAttribute("age",age);
        return "show";
    }

}
