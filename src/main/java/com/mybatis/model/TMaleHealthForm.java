package com.mybatis.model;

/**
 * 男性体检表
 */
public class TMaleHealthForm extends HealthForm {
    private String prostate;//前列腺

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }
}
