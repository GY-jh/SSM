package com.gy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/22 9:43
 * @Description :
 * 查询所有的用户信息--> /user --> get
 * 根据id查询用户信息--> /user/1 --> get
 * 添加用户信息--> /user --> post
 * 修改用户信息--> /user --> put
 * 删除用户信息--> /user/1 --> delete
 */
@Controller
public class TestRestController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser() {
        System.out.println("查询所有的用户信息--> /user --> get");
        return "success";
    }


}
