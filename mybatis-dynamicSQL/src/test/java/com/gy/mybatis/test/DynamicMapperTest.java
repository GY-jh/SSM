package com.gy.mybatis.test;

import com.gy.mybatis.mapper.DynamicSQLMapper;
import com.gy.mybatis.pojo.Emp;
import com.gy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Guyue
 * @date 2023/7/30 17:03
 */
public class DynamicMapperTest {

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "", 23, "");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }
}
