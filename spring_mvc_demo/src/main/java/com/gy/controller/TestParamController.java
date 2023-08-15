package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/15 21:50
 * @Description: 获取请求参数的方式
 * 1、通过ServletAPI获取
 * 只需要在控制器方法的形参位置设置HttpServletRequest类型的形参，就可以在控制器方法中使用request对象获取请求参数
 * 2、通过控制器方法的形参获取
 * 只需要在控制器方法的形参位置，设置一个形参，形参的名字和请求参数的名字一致即可
 * 3、@RequestParam:将请求参数和控制器方法的形参绑定
 * @RequestParam注解的三个属性 ： value、required、defaultValue
 * value：设置和形参绑定的请求参数的名字
 * required：设置是否必须传输value所对应 请求参数
 * 默认值为true，表示value所对应的请求参数必须传输，否则页面报错：
 * 400 – Required request parameter 'XXX' for method parameter type String is not present
 * 若设置为false，则表示value所对应的请求参数不是必须传输，若为传输，则形参值为null
 * defaultValue：设置当没有传输value所对应的请求参数时，为形参设置的默认值，测试和required属性值无关
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

    @RequestMapping("/param")
    public String getParam(
            @RequestParam(value = "userName", required = false, defaultValue = "hello") String username,
            String password
    ) {
        System.out.println("username:" + username + " password:" + password);
        return "success";
    }

}
