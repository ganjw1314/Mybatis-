package com.mybatis.mapper;

import com.mybatis.model.TMaleHealthForm;

/**
 * 男体检表查询数据
 */
public interface MaleHealthFormMapper {
    public TMaleHealthForm getMaleHealthForm(int empId) throws Exception;
}
