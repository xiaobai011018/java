package com.bsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/test")
public class MyController {
    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","这是第一个springmvc程序");
        mv.addObject("func","这是第一个函数");//request.getContext.setAttrubut
        mv.setViewName("show");//相当于请求转发
        return mv;
    }
    @RequestMapping(value = "/other.do",method = RequestMethod.GET)
    public ModelAndView doOther(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","这是第一个springmvc程序");
        mv.addObject("func","这是第一个函数");//request.getContext.setAttrubut
        mv.setViewName("show");//相当于请求转发
        return mv;
    }
}
