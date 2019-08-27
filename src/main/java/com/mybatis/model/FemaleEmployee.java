package com.mybatis.model;

/**
 * 女雇员类
 */
public class FemaleEmployee extends TEmployee {
    private TFemaleHealthForm femaleHealthForm = null;//女性体检表

    public TFemaleHealthForm getFemaleHealthForm() {
        return femaleHealthForm;
    }

    public void setFemaleHealthForm(TFemaleHealthForm femaleHealthForm) {
        this.femaleHealthForm = femaleHealthForm;
    }
}
