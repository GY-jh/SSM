package com.gy.mybatis.mapper;

import com.gy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author Guyue
 * @date 2023/7/29 16:51
 */
public interface EmpMapper {

    /**
     * 根据id查询员工信息
     *
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

}
