package com.gy.spring.dao.impl;

import com.gy.spring.dao.UserDao;

/**
 * @author Guyue
 * @date 2023/8/4 17:08
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
