package com.gy.mybatis.mapper;

import com.gy.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    int deleteByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    Emp selectByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    List<Emp> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Tue Aug 01 16:11:39 HKT 2023
     */
    int updateByPrimaryKey(Emp record);
}