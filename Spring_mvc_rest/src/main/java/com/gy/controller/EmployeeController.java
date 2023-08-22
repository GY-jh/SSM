package com.gy.controller;

import com.gy.dao.EmployeeDao;
import com.gy.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/22 16:35
 * @Description :
 * 查询所有的员工信息 --> /employee --> GET
 * 跳转到添加页面 --> /to/add --> GET
 * 新增员工信息 --> /employee --> POST
 * 跳转到修改页面 --> /employee/1 --> GET
 * 修改员工信息 --> /employee --> PUT
 * 删除员工信息 --> /employee --> DELETE
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        // 获取所有的员工信息
        Collection<Employee> allEmployee = employeeDao.getAll();
        // 将所有的员工信息在请求域中共享
        model.addAttribute("allEmployee", allEmployee);
        // 跳转到列表页面
        return "employee_list";
    }

}
