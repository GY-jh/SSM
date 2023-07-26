package com.gy.mybatis.mapper;

import com.gy.mybatis.pojo.User;

import java.util.List;

/**
 * @author Guyue
 * @date 2023/7/26 14:35
 */
public interface UserMapper {

    /**
     * 添加用户信息
     *
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     *
     * @return
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据id查询用户信息
     *
     * @return
     */
    User getUserById();

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> getAllUser();

}
