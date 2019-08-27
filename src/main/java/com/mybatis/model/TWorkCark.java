package com.mybatis.model;

public class TWorkCark {
    private Integer id;
    private Integer empId;//雇员编号
    private String realName;//姓名
    private String department;//手机
    private String mobile;//邮件
    private String position;//职位
    private String note;//备注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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
        return "TWorkCark{" +
                "id=" + id +
                ", empId=" + empId +
                ", realName='" + realName + '\'' +
                ", department='" + department + '\'' +
                ", mobile='" + mobile + '\'' +
                ", position='" + position + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}