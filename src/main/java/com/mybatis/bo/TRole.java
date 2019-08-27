package com.mybatis.bo;

import java.util.List;

/**
 * 角色信息表
 */
public class TRole {
    private String roleId;//角色编号
    private String roleName;//角色名称
    private String note;//备注
    //关联用户信息，一对多关联
    private List<TUser> userList;//关联的用户数据列表

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<TUser> getUserList() {
        return userList;
    }

    public void setUserList(List<TUser> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "TRole{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}