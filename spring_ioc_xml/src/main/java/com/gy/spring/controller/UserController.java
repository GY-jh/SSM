package com.gy.spring.controller;

import com.gy.spring.service.UserService;

/**
 * @author Guyue
 * @date 2023/8/4 17:03
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
