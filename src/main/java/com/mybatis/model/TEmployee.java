package com.mybatis.model;

import java.util.Date;
import java.util.List;

/**
 * 雇员类
 */
public class TEmployee {
    private Integer id;//雇员编号
    private String realname;//雇员名称
    private Integer sex;//性别：1-男，0/NULL - 女
    private Date birthday;//出生日期
    private String mobile;//手机号码
    private String email;//邮箱地址
    private String position;//职位
    private String note;//备注

    //工牌按一对一级联
    private TWorkCark workCark;
    //雇员任务，一对多级联
    private List<TEmployeeTask> employeeTasks = null;

    public TWorkCark getWorkCark() {
        return workCark;
    }

    public void setWorkCark(TWorkCark workCark) {
        this.workCark = workCark;
    }

    public List<TEmployeeTask> getTemployeeTasks() {
        return employeeTasks;
    }

    public void setTemployeeTasks(List<TEmployeeTask> employeeTasks) {
        this.employeeTasks = employeeTasks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
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
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "TEmployee{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", note='" + note + '\'' +
                ", workCark=" + workCark +
                ", employeeTasks=" + employeeTasks +
                '}';
    }
}