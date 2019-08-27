package com.mybatis.mapper;

import com.mybatis.model.TEmployee;

public interface EmployeeMapper {
    public TEmployee getEmployeeById(int id) throws Exception;
    public TEmployee getEmployeeById1(int id) throws Exception;
}
