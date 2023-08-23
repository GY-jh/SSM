package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/23 15:55
 * @Description:
 */
@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String testHello() {
        return "success";
    }

}
