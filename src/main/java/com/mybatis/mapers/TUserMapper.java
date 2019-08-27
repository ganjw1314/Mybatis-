package com.mybatis.mapers;

import com.mybatis.bo.TUser;

import java.util.List;

public interface TUserMapper {
    public List<TUser> findUserByRoleId(String roleId) throws Exception;//根据角色编号查询用户信息
    public TUser getUser(String userId) throws Exception;//根据用户编号查询用户信息
    public int insertUser(TUser user) throws Exception;//插入用户信息记录
}
