package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/15 21:50
 * @Description: 获取请求参数的方式
 * 1、通过ServletAPI获取
 * 只需要在控制器方法的形参位置设置HttpServletRequest类型的形参，就可以在控制器方法中使用request对象获取请求参数
 */
@Controller
public class TestParamController {

    @RequestMapping("/para/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + " password:" + password);
        return "success";
    }

}
