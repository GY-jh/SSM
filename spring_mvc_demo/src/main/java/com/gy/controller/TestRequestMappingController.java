package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/11 16:14
 * @Description :
 * 1、@RequestMapping注解标识的位置
 * @RequestMapping标识一个类：设置映射请求的请求路径的初始信息
 * @RequestMapping标识一个方法：设置映射请求请求路径的具体信息 .
 * 2、@RequestMapping注解value属性
 * 作用：通过请求的请求路径匹配请求
 * value属性是数组类型，即当前浏览器所发送请求的请求路径匹配value属性中的任何一个值
 * 则当前请求就会被注解所标识的方法进行处理
 * 3、@RequestMapping注解的method属性
 * 作用：通过请求的请求方式匹配请求
 * method属性是RequestMethod类型是数组，即当前浏览器所发送请求的请求方式匹配method属性中任何一种请求方式
 *则当前请求就会被注解所标识的方法进行处理
 * 若浏览器所方式的请求的请求路径和@RequestMapping注解value属性匹配，但是请求方式不匹配
 * 此时页面报错：405 – Request method 'XXX' not supported
 */
@Controller
// @RequestMapping("/test")
public class TestRequestMappingController {

    // 此时控制器方法所匹配的请求的请求路径为/test/hello
    @RequestMapping(
            value = {"/hello", "/abc"},
            method = {RequestMethod.POST, RequestMethod.GET})
    public String hello() {
        return "success";
    }

}
