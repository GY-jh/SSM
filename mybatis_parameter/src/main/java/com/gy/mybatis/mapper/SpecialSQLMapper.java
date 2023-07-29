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

}
