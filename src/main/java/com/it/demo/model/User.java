package com.it.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String sex;

    private Date entryTime;

    private String entryGrade;

    private BigDecimal entrySalary;

    private String currentGrade;

    private BigDecimal currentSalary;

    private String department;

    private String psot;

    private String latelyChangeSalaryTime;

    private BigDecimal ontrialSalary;

    private String graduationSchool;

    private String major;

    private String education;

    private Date graduationTime;

    private BigDecimal entryBeforeYears;

    private String entryRemarks;

    private BigDecimal currentYears;

    private String whetherExtrapolation;

    private String recruitContributionOne;

    private String recruitContributionTwo;

    private String isJob;

    private String entryTime01;
    private String entryTime02;
    private String entryBeforeYears01;
    private String entryBeforeYears02;
    private String entryBeforeYearsAll01;
    private String entryBeforeYearsAll02;

    private String paixu;

    private static final long serialVersionUID = 1L;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntryGrade() {
        return entryGrade;
    }

    public void setEntryGrade(String entryGrade) {
        this.entryGrade = entryGrade == null ? null : entryGrade.trim();
    }

    public BigDecimal getEntrySalary() {
        return entrySalary;
    }

    public void setEntrySalary(BigDecimal entrySalary) {
        this.entrySalary = entrySalary;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade == null ? null : currentGrade.trim();
    }

    public BigDecimal getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(BigDecimal currentSalary) {
        this.currentSalary = currentSalary;
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

    public String getLatelyChangeSalaryTime() {
        return latelyChangeSalaryTime;
    }

    public void setLatelyChangeSalaryTime(String latelyChangeSalaryTime) {
        this.latelyChangeSalaryTime = latelyChangeSalaryTime == null ? null : latelyChangeSalaryTime.trim();
    }

    public BigDecimal getOntrialSalary() {
        return ontrialSalary;
    }

    public void setOntrialSalary(BigDecimal ontrialSalary) {
        this.ontrialSalary = ontrialSalary;
    }

    public String getGraduationSchool() {
        return graduationSchool;
    }

    public void setGraduationSchool(String graduationSchool) {
        this.graduationSchool = graduationSchool == null ? null : graduationSchool.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public BigDecimal getEntryBeforeYears() {
        return entryBeforeYears;
    }

    public void setEntryBeforeYears(BigDecimal entryBeforeYears) {
        this.entryBeforeYears = entryBeforeYears;
    }

    public String getEntryRemarks() {
        return entryRemarks;
    }

    public void setEntryRemarks(String entryRemarks) {
        this.entryRemarks = entryRemarks == null ? null : entryRemarks.trim();
    }

    public BigDecimal getCurrentYears() {
        return currentYears;
    }

    public void setCurrentYears(BigDecimal currentYears) {
        this.currentYears = currentYears;
    }

    public String getWhetherExtrapolation() {
        return whetherExtrapolation;
    }

    public void setWhetherExtrapolation(String whetherExtrapolation) {
        this.whetherExtrapolation = whetherExtrapolation == null ? null : whetherExtrapolation.trim();
    }

    public String getRecruitContributionOne() {
        return recruitContributionOne;
    }

    public void setRecruitContributionOne(String recruitContributionOne) {
        this.recruitContributionOne = recruitContributionOne == null ? null : recruitContributionOne.trim();
    }

    public String getRecruitContributionTwo() {
        return recruitContributionTwo;
    }

    public void setRecruitContributionTwo(String recruitContributionTwo) {
        this.recruitContributionTwo = recruitContributionTwo == null ? null : recruitContributionTwo.trim();
    }

    public String getIsJob() {
        return isJob;
    }

    public void setIsJob(String isJob) {
        this.isJob = isJob == null ? null : isJob.trim();
    }

    public String getEntryTime01() {
        return entryTime01;
    }

    public void setEntryTime01(String entryTime01) {
        this.entryTime01 = entryTime01;
    }

    public String getEntryTime02() {
        return entryTime02;
    }

    public void setEntryTime02(String entryTime02) {
        this.entryTime02 = entryTime02;
    }

    public String getEntryBeforeYears01() {
        return entryBeforeYears01;
    }

    public void setEntryBeforeYears01(String entryBeforeYears01) {
        this.entryBeforeYears01 = entryBeforeYears01;
    }

    public String getEntryBeforeYears02() {
        return entryBeforeYears02;
    }

    public void setEntryBeforeYears02(String entryBeforeYears02) {
        this.entryBeforeYears02 = entryBeforeYears02;
    }

    public String getEntryBeforeYearsAll01() {
        return entryBeforeYearsAll01;
    }

    public void setEntryBeforeYearsAll01(String entryBeforeYearsAll01) {
        this.entryBeforeYearsAll01 = entryBeforeYearsAll01;
    }

    public String getEntryBeforeYearsAll02() {
        return entryBeforeYearsAll02;
    }

    public void setEntryBeforeYearsAll02(String entryBeforeYearsAll02) {
        this.entryBeforeYearsAll02 = entryBeforeYearsAll02;
    }

    public String getPaixu() {
        return paixu;
    }

    public void setPaixu(String paixu) {
        this.paixu = paixu;
    }
}