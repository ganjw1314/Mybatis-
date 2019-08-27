package com.mybatis.model;

import java.io.Serializable;

/**
 * 角色表  : ROLE
 * @author gan
 * @author 2019-8-19
 */

public class Role implements Serializable {
    private int id;//角色id
    private String roleName;//角色名称
    private String note;//备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
