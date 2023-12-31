package com.gy.mybatis.mapper;

import com.gy.mybatis.pojo.Dept;

import java.util.List;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    int deleteByPrimaryKey(Integer deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    Dept selectByPrimaryKey(Integer deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    List<Dept> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    int updateByPrimaryKey(Dept record);
}