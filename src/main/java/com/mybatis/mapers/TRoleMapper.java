package com.mybatis.mapers;

import com.mybatis.bo.TRole;

import java.util.List;

public interface TRoleMapper {
    public TRole getRole(String roleId) throws  Exception;//根据角色编号查询角色信息
    public List<TRole> findRoleByUserId(String userId) throws Exception;//根据用户编号查询拥有的角色列表信息
    public int insertRole(TRole role) throws Exception;//插入角色信息记录
}
