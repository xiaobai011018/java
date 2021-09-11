package com.bsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","这是第一个springmvc程序");
        mv.addObject("func","这是第一个函数");//request.getContext.setAttrubut
        mv.setViewName("/show.jsp");//相当于请求转发
        return mv;
    }
}
