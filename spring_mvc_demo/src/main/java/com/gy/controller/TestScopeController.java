package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/16 16:15
 * @Description :
 * 向域对象共享数据：
 * 1、使用ModelAndView时，可以使用其Model功能向请求域共享数据
 * 使用View功能设置逻辑视图，但是控制器方法一定要将ModelAndView作为方法的返回值
 */
@Controller
public class TestScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMAV() {
        /**
         * ModelAndView包含Model和View的功能
         * Model：向请求域中共享数据
         * View：设置罗技视图实现页面跳转
         */
        ModelAndView mav = new ModelAndView();
        // 往请求域中共享数据
        mav.addObject("testRequestScope", "hello，ModelAndView");
        // 设置逻辑视图
        mav.setViewName("success");
        return mav;
    }

}
