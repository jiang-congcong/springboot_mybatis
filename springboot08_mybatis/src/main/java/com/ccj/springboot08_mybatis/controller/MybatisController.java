package com.ccj.springboot08_mybatis.controller;

import com.ccj.springboot08_mybatis.entity.Department;
import com.ccj.springboot08_mybatis.entity.Employee;
import com.ccj.springboot08_mybatis.mapper.DepartmentMapper;
import com.ccj.springboot08_mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MybatisController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @RequestMapping("/dept/{id}")
    @ResponseBody
    public Department getDepartment(@PathVariable("id") int id){
        return departmentMapper.getDeptById(id);
    }

    @ResponseBody
    @RequestMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") int id){
        return employeeMapper.getEmpById(id);
    }



}
