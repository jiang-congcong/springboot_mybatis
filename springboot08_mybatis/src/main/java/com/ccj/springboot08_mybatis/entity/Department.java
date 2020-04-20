package com.ccj.springboot08_mybatis.entity;

public class Department {

    private int id;
    private String departmentName;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department='" + departmentName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartment(String departmentName) {
        this.departmentName = departmentName;
    }
}
