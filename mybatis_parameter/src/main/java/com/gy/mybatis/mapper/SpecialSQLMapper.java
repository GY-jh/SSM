package com.gy.mybatis.mapper;

import com.gy.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Guyue
 * @date 2023/7/29 10:36
 */
public interface SpecialSQLMapper {

    /**
     * 通过用户名模糊查询用户信息
     *
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 批量删除用户
     *
     * @param ids
     */
    void deleteMoreUser(@Param("ids") String ids);

    /**
     * 动态设置表名，查询用户信息
     *
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);

    /**
     * 添加用户信息并获得自增的主键
     *
     * @param user
     */
    void insertUser(User user);

}
