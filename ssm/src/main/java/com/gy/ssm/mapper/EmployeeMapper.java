package com.gy.ssm.mapper;

import com.gy.ssm.pojo.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/26 19:38
 * @Description:
 */
public interface EmployeeMapper {

    /**
     * 查询所有的员工信息
     *
     * @return
     */
    List<Employee> getAllEmployees();
}
