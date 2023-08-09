package com.gy.spring.controller;

import com.gy.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Guyue
 * @date 2023/8/8 17:18
 */
@Controller("controller")
public class UserController {

    @Autowired
    private UserService userService;

    /*@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }*/

    /*@Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    public void saveUser() {
        userService.saveUser();
    }

}
