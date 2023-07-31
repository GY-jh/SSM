package com.gy.mybatis.mapper;

import com.gy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author Guyue
 * @date 2023/7/31 15:52
 */
public interface CacheMapper {

    /**
     * 根据员工id查询员工信息
     *
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 添加员工信息
     *
     * @param emp
     */
    void insertEmp(Emp emp);

}
