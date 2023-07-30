package com.gy.mybatis.mapper;

import com.gy.mybatis.pojo.Emp;

import java.util.List;

/**
 * @author Guyue
 * @date 2023/7/30 16:51
 */
public interface DynamicSQLMapper {

    /**
     * 根据条件查询员工信息
     *
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

}
