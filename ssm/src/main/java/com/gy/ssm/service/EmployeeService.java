package com.gy.ssm.service;

import com.github.pagehelper.PageInfo;
import com.gy.ssm.pojo.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/26 15:12
 * @Description:
 */
public interface EmployeeService {
    /**
     * 查询所有的员工信息
     *
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     *
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
