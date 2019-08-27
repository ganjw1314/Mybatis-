package com.mybatis.bo;

import java.util.Date;
import java.util.List;

/**
 * 用户信息表
 */
public class TUser {
    private String userId;
    private String realName;//用户名称
    private String userName;//姓名
    private Integer sex;//性别
    private Date birthday;//出生日期
    private String mobile;//手机号码
    private String email;//邮箱
    private String note;//备注
    //对角色一对多关联
    private List<TRole> roleList;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<TRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<TRole> roleList) {
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "userId='" + userId + '\'' +
                ", realName='" + realName + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", note='" + note +
                '}';
    }
}