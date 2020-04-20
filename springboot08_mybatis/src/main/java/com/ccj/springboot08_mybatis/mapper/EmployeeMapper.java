package com.ccj.springboot08_mybatis.mapper;

import com.ccj.springboot08_mybatis.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(int id);

    public void insertEmp(Employee employee);

}
