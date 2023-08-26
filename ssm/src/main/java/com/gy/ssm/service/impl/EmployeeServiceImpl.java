package com.gy.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gy.ssm.mapper.EmployeeMapper;
import com.gy.ssm.pojo.Employee;
import com.gy.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/26 15:12
 * @Description:
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployees();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        // 开启分页功能
        PageHelper.startPage(pageNum, 4);
        // 查询所有的员工信息
        List<Employee> list = employeeMapper.getAllEmployees();
        // 获取分页相关数据
        PageInfo<Employee> page = new PageInfo<>(list, 3);
        return page;
    }
}
