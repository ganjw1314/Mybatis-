package com.mybatis.mapper;

import com.mybatis.model.TEmployeeTask;

public interface EmployeeTaskMapper {
    public TEmployeeTask getEmployeeTaskByEmpId(int empId) throws Exception;
}
