package com.gy.spring.service.impl;

import com.gy.spring.dao.UserDao;
import com.gy.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Guyue
 * @date 2023/8/8 17:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    // @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
