package com.gy.mybatis.mapper;

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

}
