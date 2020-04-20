package com.ccj.springboot08_mybatis.mapper;

import com.ccj.springboot08_mybatis.entity.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id =#{id}")
    public Department getDeptById(int id);

    @Delete("delete from department where id =#{id}")
    public int deleteDeptById(int id);

    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id =#{id}")
    public int updateDept(Department department);

}
