package com.bsc.controller;

import com.bsc.pojo.Admin;
import com.bsc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("/login.do")
    public String login(String name, String pwd, HttpServletRequest request, Model model){
        Admin admin = adminService.login(name,pwd);
        if (admin!=null){
//            登录成功
            request.setAttribute("admin",admin);
            model.addAttribute("name",admin.getaName());
            return "main";
        }else {
//            登录失败
            model.addAttribute("errmsg","用户名或密码不正确!");
            return "login";
        }
    }
}
