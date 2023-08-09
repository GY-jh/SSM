package com.gy.spring.dao.impl;

import com.gy.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Guyue
 * @date 2023/8/8 17:18
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功！");
    }

}
