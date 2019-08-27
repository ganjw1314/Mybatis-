package com.mybatis.mapper;

import com.mybatis.model.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    public Role findRoleById(int id) throws Exception;//根据角色id查询角色信息
    public int insertRole(Role role) throws Exception;//插入一条角色信息。
    public int updateRole(Role role) throws Exception;//更新一条角色信息。
    public int deleteRole(int id) throws Exception;//删除一条角色信息。
    public List<Role> findRolesByMap(Map<String, Object> parameterMap) throws Exception;//根据名称进行模糊查询
}
