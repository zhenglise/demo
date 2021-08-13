package com.it.demo.model;

import java.io.Serializable;

public class ErpRecord implements Serializable {
    private Integer erpId;

    private String userCode;

    private String passwork;

    private String aboutMeun;

    private static final long serialVersionUID = 1L;

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork == null ? null : passwork.trim();
    }

    public String getAboutMeun() {
        return aboutMeun;
    }

    public void setAboutMeun(String aboutMeun) {
        this.aboutMeun = aboutMeun == null ? null : aboutMeun.trim();
    }
}