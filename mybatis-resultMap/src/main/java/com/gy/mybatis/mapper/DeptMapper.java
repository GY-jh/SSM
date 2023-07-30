package com.gy.mybatis.mapper;

import com.gy.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author Guyue
 * @date 2023/7/30 10:26
 */
public interface DeptMapper {

    /**
     * 通过分步查询查询员工以及所对应的部门信息的第二步
     *
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

}
