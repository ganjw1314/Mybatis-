package com.mybatis.mapper;

import com.mybatis.model.TWorkCark;

public interface WorkCarkMapper {
    //根据雇员编号查询工作任务
    public TWorkCark getWorkCarkByEmpId(int id) throws Exception;
}
