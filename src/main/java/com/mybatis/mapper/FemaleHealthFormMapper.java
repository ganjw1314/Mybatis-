package com.mybatis.mapper;

import com.mybatis.model.TFemaleHealthForm;

/**
 * 女体检表映射查询
 */
public interface FemaleHealthFormMapper {
    public TFemaleHealthForm getFemaleHealthForm(int empId) throws Exception;
}
