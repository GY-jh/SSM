package com.gy.mybatis.test;

import com.gy.mybatis.mapper.SpecialSQLMapper;
import com.gy.mybatis.pojo.User;
import com.gy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * @author Guyue
 * @date 2023/7/29 10:41
 */
public class SpecialSQLMapperTest {

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }

    @Test
    public void testDeleteMoreUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("9,10");
    }


    @Test
    public void testGetUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserList("t_user");
        list.forEach(System.out::println);
    }

    public void testJDBC() {
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("", "", "");
            String sql = "select * from t_user where username like '% ? %'";
            PreparedStatement ps = connection.prepareStatement(sql);
            // ps.setString(1, "a");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
