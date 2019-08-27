package com.mybatis.model;

/**
 * 男雇员类
 */
public class MaleEmployee extends TEmployee {
    //男性体检报告
    private TMaleHealthForm maleHealthForm = null;

    public TMaleHealthForm getMaleHealthForm() {
        return maleHealthForm;
    }

    public void setMaleHealthForm(TMaleHealthForm maleHealthForm) {
        this.maleHealthForm = maleHealthForm;
    }
}
