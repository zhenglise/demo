package com.it.demo.model;

import java.io.Serializable;
import java.util.Date;

public class KaoQinDetails implements Serializable {
    private Integer kaoQinDetailsId;

    private String userName;

    private Integer userId;

    private String kaoqinDate;

    private String zaoTime;

    private String zaoStart;

    private String wanTime;

    private String wanStart;

    private Date riqiDate;

    private String riqiDateString;

    private static final long serialVersionUID = 1L;

    public Integer getKaoQinDetailsId() {
        return kaoQinDetailsId;
    }

    public void setKaoQinDetailsId(Integer kaoQinDetailsId) {
        this.kaoQinDetailsId = kaoQinDetailsId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getKaoqinDate() {
        return kaoqinDate;
    }

    public void setKaoqinDate(String kaoqinDate) {
        this.kaoqinDate = kaoqinDate == null ? null : kaoqinDate.trim();
    }

    public String getZaoTime() {
        return zaoTime;
    }

    public void setZaoTime(String zaoTime) {
        this.zaoTime = zaoTime == null ? null : zaoTime.trim();
    }

    public String getZaoStart() {
        return zaoStart;
    }

    public void setZaoStart(String zaoStart) {
        this.zaoStart = zaoStart == null ? null : zaoStart.trim();
    }

    public String getWanTime() {
        return wanTime;
    }

    public void setWanTime(String wanTime) {
        this.wanTime = wanTime == null ? null : wanTime.trim();
    }

    public String getWanStart() {
        return wanStart;
    }

    public void setWanStart(String wanStart) {
        this.wanStart = wanStart == null ? null : wanStart.trim();
    }

    public Date getRiqiDate() {
        return riqiDate;
    }

    public void setRiqiDate(Date riqiDate) {
        this.riqiDate = riqiDate;
    }

    public String getRiqiDateString() {
        return riqiDateString;
    }

    public void setRiqiDateString(String riqiDateString) {
        this.riqiDateString = riqiDateString;
    }
}