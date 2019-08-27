package com.mybatis.model;

/**
 * 女性体检表
 */
public class TFemaleHealthForm extends HealthForm {
    private String uterus;//子宫

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }
}
