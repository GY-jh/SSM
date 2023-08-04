package com.gy.spring.service.impl;

import com.gy.spring.dao.UserDao;
import com.gy.spring.service.UserService;

/**
 * @author Guyue
 * @date 2023/8/4 17:07
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
