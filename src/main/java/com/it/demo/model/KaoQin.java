package com.it.demo.model;

import java.io.Serializable;
import java.util.Date;

public class KaoQin implements Serializable {
    private Integer kaoQinId;

    private Integer userId;

    private String userName;

    private String department;

    private String psot;

    private Integer answerAttendanceDate;

    private Integer attendanceDate;

    private Integer sevenBefore;

    private Integer sevenAfter;

    private Integer eightAfter;

    private Integer nineAfter;

    private Integer tenAfter;

    private Integer twelveAfter;

    private Integer nineTwelveAfter;

    private String workOvertime;

    private String isWork;

    private Date kaoQinMonth;

    private static final long serialVersionUID = 1L;

    public Integer getKaoQinId() {
        return kaoQinId;
    }

    public void setKaoQinId(Integer kaoQinId) {
        this.kaoQinId = kaoQinId;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPsot() {
        return psot;
    }

    public void setPsot(String psot) {
        this.psot = psot == null ? null : psot.trim();
    }

    public Integer getAnswerAttendanceDate() {
        return answerAttendanceDate;
    }

    public void setAnswerAttendanceDate(Integer answerAttendanceDate) {
        this.answerAttendanceDate = answerAttendanceDate;
    }

    public Integer getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Integer attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public Integer getSevenBefore() {
        return sevenBefore;
    }

    public void setSevenBefore(Integer sevenBefore) {
        this.sevenBefore = sevenBefore;
    }

    public Integer getSevenAfter() {
        return sevenAfter;
    }

    public void setSevenAfter(Integer sevenAfter) {
        this.sevenAfter = sevenAfter;
    }

    public Integer getEightAfter() {
        return eightAfter;
    }

    public void setEightAfter(Integer eightAfter) {
        this.eightAfter = eightAfter;
    }

    public Integer getNineAfter() {
        return nineAfter;
    }

    public void setNineAfter(Integer nineAfter) {
        this.nineAfter = nineAfter;
    }

    public Integer getTenAfter() {
        return tenAfter;
    }

    public void setTenAfter(Integer tenAfter) {
        this.tenAfter = tenAfter;
    }

    public Integer getTwelveAfter() {
        return twelveAfter;
    }

    public void setTwelveAfter(Integer twelveAfter) {
        this.twelveAfter = twelveAfter;
    }

    public Integer getNineTwelveAfter() {
        return nineTwelveAfter;
    }

    public void setNineTwelveAfter(Integer nineTwelveAfter) {
        this.nineTwelveAfter = nineTwelveAfter;
    }

    public String getWorkOvertime() {
        return workOvertime;
    }

    public void setWorkOvertime(String workOvertime) {
        this.workOvertime = workOvertime == null ? null : workOvertime.trim();
    }

    public String getIsWork() {
        return isWork;
    }

    public void setIsWork(String isWork) {
        this.isWork = isWork == null ? null : isWork.trim();
    }

    public Date getKaoQinMonth() {
        return kaoQinMonth;
    }

    public void setKaoQinMonth(Date kaoQinMonth) {
        this.kaoQinMonth = kaoQinMonth;
    }
}