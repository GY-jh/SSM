package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/11 16:15
 * @Description:
 */
@Controller
public class ProtalController {

    @RequestMapping("/")
    public String protal() {
        return "index";
    }

}
