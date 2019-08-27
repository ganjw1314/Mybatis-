package com.mybatis.mapper;

import com.mybatis.model.TTask;

/**
 * 任务接口
 */
public interface TaskMapper {
    public TTask getTask(int id) throws Exception;
}
