package com.gy.mybatis.test;

import com.gy.mybatis.mapper.SelectMapper;
import com.gy.mybatis.pojo.User;
import com.gy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author Guyue
 * @date 2023/7/27 15:50
 */
public class SelectMapperTest {

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }

    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(4);
        //{password=123456, gender=男, id=1, age=23, email=12345@qq.com, username=admin}
        System.out.println(map);
    }

    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        /*List<Map<String, Object>> list = mapper.getAllUserToMap();
        list.forEach(System.out::println);*/
        /*
         * {1={password=123456, gender=男, id=1, age=23, email=12345@qq.com, username=admin},
         * 2={password=123456, gender=女, id=2, age=33, email=12345@qq.com, username=root},
         * 3={password=123, gender=男, id=3, age=23, email=12345@qq.com, username=zhangsan},
         * 4={password=123, id=4, username=lisi}}
         * */
        Map<String, Object> map = mapper.getAllUserToMap();
        System.out.println(map);
    }

}
