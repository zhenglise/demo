package com.it.demo.model;

import java.io.Serializable;

public class JiXiao implements Serializable {
    private Integer jiXiaoId;

    private Integer userId;

    private String userName;

    private String initialLevel;

    private Integer initialMoney;

    private String finalLevel;

    private Integer finalMoney;

    private String yearMonth;

    private String workRemarks;

    private String superiorRemarks;

    private String executiveRemarks;

    private String otherRemarks;

    private static final long serialVersionUID = 1L;

    public Integer getJiXiaoId() {
        return jiXiaoId;
    }

    public void setJiXiaoId(Integer jiXiaoId) {
        this.jiXiaoId = jiXiaoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getInitialLevel() {
        return initialLevel;
    }

    public void setInitialLevel(String initialLevel) {
        this.initialLevel = initialLevel == null ? null : initialLevel.trim();
    }

    public Integer getInitialMoney() {
        return initialMoney;
    }

    public void setInitialMoney(Integer initialMoney) {
        this.initialMoney = initialMoney;
    }

    public String getFinalLevel() {
        return finalLevel;
    }

    public void setFinalLevel(String finalLevel) {
        this.finalLevel = finalLevel == null ? null : finalLevel.trim();
    }

    public Integer getFinalMoney() {
        return finalMoney;
    }

    public void setFinalMoney(Integer finalMoney) {
        this.finalMoney = finalMoney;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth == null ? null : yearMonth.trim();
    }

    public String getWorkRemarks() {
        return workRemarks;
    }

    public void setWorkRemarks(String workRemarks) {
        this.workRemarks = workRemarks == null ? null : workRemarks.trim();
    }

    public String getSuperiorRemarks() {
        return superiorRemarks;
    }

    public void setSuperiorRemarks(String superiorRemarks) {
        this.superiorRemarks = superiorRemarks == null ? null : superiorRemarks.trim();
    }

    public String getExecutiveRemarks() {
        return executiveRemarks;
    }

    public void setExecutiveRemarks(String executiveRemarks) {
        this.executiveRemarks = executiveRemarks == null ? null : executiveRemarks.trim();
    }

    public String getOtherRemarks() {
        return otherRemarks;
    }

    public void setOtherRemarks(String otherRemarks) {
        this.otherRemarks = otherRemarks == null ? null : otherRemarks.trim();
    }
}