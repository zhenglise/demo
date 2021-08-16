package com.it.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KaoQinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KaoQinExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andKaoQinIdIsNull() {
            addCriterion("kao_qin_id is null");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdIsNotNull() {
            addCriterion("kao_qin_id is not null");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdEqualTo(Integer value) {
            addCriterion("kao_qin_id =", value, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdNotEqualTo(Integer value) {
            addCriterion("kao_qin_id <>", value, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdGreaterThan(Integer value) {
            addCriterion("kao_qin_id >", value, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kao_qin_id >=", value, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdLessThan(Integer value) {
            addCriterion("kao_qin_id <", value, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdLessThanOrEqualTo(Integer value) {
            addCriterion("kao_qin_id <=", value, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdIn(List<Integer> values) {
            addCriterion("kao_qin_id in", values, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdNotIn(List<Integer> values) {
            addCriterion("kao_qin_id not in", values, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdBetween(Integer value1, Integer value2) {
            addCriterion("kao_qin_id between", value1, value2, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andKaoQinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kao_qin_id not between", value1, value2, "kaoQinId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPsotIsNull() {
            addCriterion("psot is null");
            return (Criteria) this;
        }

        public Criteria andPsotIsNotNull() {
            addCriterion("psot is not null");
            return (Criteria) this;
        }

        public Criteria andPsotEqualTo(String value) {
            addCriterion("psot =", value, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotNotEqualTo(String value) {
            addCriterion("psot <>", value, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotGreaterThan(String value) {
            addCriterion("psot >", value, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotGreaterThanOrEqualTo(String value) {
            addCriterion("psot >=", value, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotLessThan(String value) {
            addCriterion("psot <", value, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotLessThanOrEqualTo(String value) {
            addCriterion("psot <=", value, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotLike(String value) {
            addCriterion("psot like", value, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotNotLike(String value) {
            addCriterion("psot not like", value, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotIn(List<String> values) {
            addCriterion("psot in", values, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotNotIn(List<String> values) {
            addCriterion("psot not in", values, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotBetween(String value1, String value2) {
            addCriterion("psot between", value1, value2, "psot");
            return (Criteria) this;
        }

        public Criteria andPsotNotBetween(String value1, String value2) {
            addCriterion("psot not between", value1, value2, "psot");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateIsNull() {
            addCriterion("answer_attendance_date is null");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateIsNotNull() {
            addCriterion("answer_attendance_date is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateEqualTo(Integer value) {
            addCriterion("answer_attendance_date =", value, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateNotEqualTo(Integer value) {
            addCriterion("answer_attendance_date <>", value, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateGreaterThan(Integer value) {
            addCriterion("answer_attendance_date >", value, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_attendance_date >=", value, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateLessThan(Integer value) {
            addCriterion("answer_attendance_date <", value, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateLessThanOrEqualTo(Integer value) {
            addCriterion("answer_attendance_date <=", value, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateIn(List<Integer> values) {
            addCriterion("answer_attendance_date in", values, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateNotIn(List<Integer> values) {
            addCriterion("answer_attendance_date not in", values, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateBetween(Integer value1, Integer value2) {
            addCriterion("answer_attendance_date between", value1, value2, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAnswerAttendanceDateNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_attendance_date not between", value1, value2, "answerAttendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIsNull() {
            addCriterion("attendance_date is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIsNotNull() {
            addCriterion("attendance_date is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateEqualTo(Integer value) {
            addCriterion("attendance_date =", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotEqualTo(Integer value) {
            addCriterion("attendance_date <>", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateGreaterThan(Integer value) {
            addCriterion("attendance_date >", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("attendance_date >=", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateLessThan(Integer value) {
            addCriterion("attendance_date <", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateLessThanOrEqualTo(Integer value) {
            addCriterion("attendance_date <=", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIn(List<Integer> values) {
            addCriterion("attendance_date in", values, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotIn(List<Integer> values) {
            addCriterion("attendance_date not in", values, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateBetween(Integer value1, Integer value2) {
            addCriterion("attendance_date between", value1, value2, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotBetween(Integer value1, Integer value2) {
            addCriterion("attendance_date not between", value1, value2, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeIsNull() {
            addCriterion("seven_before is null");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeIsNotNull() {
            addCriterion("seven_before is not null");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeEqualTo(Integer value) {
            addCriterion("seven_before =", value, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeNotEqualTo(Integer value) {
            addCriterion("seven_before <>", value, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeGreaterThan(Integer value) {
            addCriterion("seven_before >", value, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("seven_before >=", value, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeLessThan(Integer value) {
            addCriterion("seven_before <", value, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("seven_before <=", value, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeIn(List<Integer> values) {
            addCriterion("seven_before in", values, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeNotIn(List<Integer> values) {
            addCriterion("seven_before not in", values, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeBetween(Integer value1, Integer value2) {
            addCriterion("seven_before between", value1, value2, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("seven_before not between", value1, value2, "sevenBefore");
            return (Criteria) this;
        }

        public Criteria andSevenAfterIsNull() {
            addCriterion("seven_after is null");
            return (Criteria) this;
        }

        public Criteria andSevenAfterIsNotNull() {
            addCriterion("seven_after is not null");
            return (Criteria) this;
        }

        public Criteria andSevenAfterEqualTo(Integer value) {
            addCriterion("seven_after =", value, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andSevenAfterNotEqualTo(Integer value) {
            addCriterion("seven_after <>", value, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andSevenAfterGreaterThan(Integer value) {
            addCriterion("seven_after >", value, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andSevenAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("seven_after >=", value, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andSevenAfterLessThan(Integer value) {
            addCriterion("seven_after <", value, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andSevenAfterLessThanOrEqualTo(Integer value) {
            addCriterion("seven_after <=", value, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andSevenAfterIn(List<Integer> values) {
            addCriterion("seven_after in", values, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andSevenAfterNotIn(List<Integer> values) {
            addCriterion("seven_after not in", values, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andSevenAfterBetween(Integer value1, Integer value2) {
            addCriterion("seven_after between", value1, value2, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andSevenAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("seven_after not between", value1, value2, "sevenAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterIsNull() {
            addCriterion("eight_after is null");
            return (Criteria) this;
        }

        public Criteria andEightAfterIsNotNull() {
            addCriterion("eight_after is not null");
            return (Criteria) this;
        }

        public Criteria andEightAfterEqualTo(Integer value) {
            addCriterion("eight_after =", value, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterNotEqualTo(Integer value) {
            addCriterion("eight_after <>", value, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterGreaterThan(Integer value) {
            addCriterion("eight_after >", value, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("eight_after >=", value, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterLessThan(Integer value) {
            addCriterion("eight_after <", value, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterLessThanOrEqualTo(Integer value) {
            addCriterion("eight_after <=", value, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterIn(List<Integer> values) {
            addCriterion("eight_after in", values, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterNotIn(List<Integer> values) {
            addCriterion("eight_after not in", values, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterBetween(Integer value1, Integer value2) {
            addCriterion("eight_after between", value1, value2, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andEightAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("eight_after not between", value1, value2, "eightAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterIsNull() {
            addCriterion("nine_after is null");
            return (Criteria) this;
        }

        public Criteria andNineAfterIsNotNull() {
            addCriterion("nine_after is not null");
            return (Criteria) this;
        }

        public Criteria andNineAfterEqualTo(Integer value) {
            addCriterion("nine_after =", value, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterNotEqualTo(Integer value) {
            addCriterion("nine_after <>", value, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterGreaterThan(Integer value) {
            addCriterion("nine_after >", value, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("nine_after >=", value, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterLessThan(Integer value) {
            addCriterion("nine_after <", value, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterLessThanOrEqualTo(Integer value) {
            addCriterion("nine_after <=", value, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterIn(List<Integer> values) {
            addCriterion("nine_after in", values, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterNotIn(List<Integer> values) {
            addCriterion("nine_after not in", values, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterBetween(Integer value1, Integer value2) {
            addCriterion("nine_after between", value1, value2, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andNineAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("nine_after not between", value1, value2, "nineAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterIsNull() {
            addCriterion("ten_after is null");
            return (Criteria) this;
        }

        public Criteria andTenAfterIsNotNull() {
            addCriterion("ten_after is not null");
            return (Criteria) this;
        }

        public Criteria andTenAfterEqualTo(Integer value) {
            addCriterion("ten_after =", value, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterNotEqualTo(Integer value) {
            addCriterion("ten_after <>", value, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterGreaterThan(Integer value) {
            addCriterion("ten_after >", value, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("ten_after >=", value, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterLessThan(Integer value) {
            addCriterion("ten_after <", value, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterLessThanOrEqualTo(Integer value) {
            addCriterion("ten_after <=", value, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterIn(List<Integer> values) {
            addCriterion("ten_after in", values, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterNotIn(List<Integer> values) {
            addCriterion("ten_after not in", values, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterBetween(Integer value1, Integer value2) {
            addCriterion("ten_after between", value1, value2, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTenAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("ten_after not between", value1, value2, "tenAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterIsNull() {
            addCriterion("twelve_after is null");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterIsNotNull() {
            addCriterion("twelve_after is not null");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterEqualTo(Integer value) {
            addCriterion("twelve_after =", value, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterNotEqualTo(Integer value) {
            addCriterion("twelve_after <>", value, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterGreaterThan(Integer value) {
            addCriterion("twelve_after >", value, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("twelve_after >=", value, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterLessThan(Integer value) {
            addCriterion("twelve_after <", value, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterLessThanOrEqualTo(Integer value) {
            addCriterion("twelve_after <=", value, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterIn(List<Integer> values) {
            addCriterion("twelve_after in", values, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterNotIn(List<Integer> values) {
            addCriterion("twelve_after not in", values, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterBetween(Integer value1, Integer value2) {
            addCriterion("twelve_after between", value1, value2, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andTwelveAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("twelve_after not between", value1, value2, "twelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterIsNull() {
            addCriterion("nine_twelve_after is null");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterIsNotNull() {
            addCriterion("nine_twelve_after is not null");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterEqualTo(Integer value) {
            addCriterion("nine_twelve_after =", value, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterNotEqualTo(Integer value) {
            addCriterion("nine_twelve_after <>", value, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterGreaterThan(Integer value) {
            addCriterion("nine_twelve_after >", value, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("nine_twelve_after >=", value, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterLessThan(Integer value) {
            addCriterion("nine_twelve_after <", value, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterLessThanOrEqualTo(Integer value) {
            addCriterion("nine_twelve_after <=", value, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterIn(List<Integer> values) {
            addCriterion("nine_twelve_after in", values, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterNotIn(List<Integer> values) {
            addCriterion("nine_twelve_after not in", values, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterBetween(Integer value1, Integer value2) {
            addCriterion("nine_twelve_after between", value1, value2, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andNineTwelveAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("nine_twelve_after not between", value1, value2, "nineTwelveAfter");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeIsNull() {
            addCriterion("work_overtime is null");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeIsNotNull() {
            addCriterion("work_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeEqualTo(String value) {
            addCriterion("work_overtime =", value, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeNotEqualTo(String value) {
            addCriterion("work_overtime <>", value, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeGreaterThan(String value) {
            addCriterion("work_overtime >", value, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeGreaterThanOrEqualTo(String value) {
            addCriterion("work_overtime >=", value, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeLessThan(String value) {
            addCriterion("work_overtime <", value, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeLessThanOrEqualTo(String value) {
            addCriterion("work_overtime <=", value, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeLike(String value) {
            addCriterion("work_overtime like", value, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeNotLike(String value) {
            addCriterion("work_overtime not like", value, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeIn(List<String> values) {
            addCriterion("work_overtime in", values, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeNotIn(List<String> values) {
            addCriterion("work_overtime not in", values, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeBetween(String value1, String value2) {
            addCriterion("work_overtime between", value1, value2, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andWorkOvertimeNotBetween(String value1, String value2) {
            addCriterion("work_overtime not between", value1, value2, "workOvertime");
            return (Criteria) this;
        }

        public Criteria andIsWorkIsNull() {
            addCriterion("is_work is null");
            return (Criteria) this;
        }

        public Criteria andIsWorkIsNotNull() {
            addCriterion("is_work is not null");
            return (Criteria) this;
        }

        public Criteria andIsWorkEqualTo(String value) {
            addCriterion("is_work =", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkNotEqualTo(String value) {
            addCriterion("is_work <>", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkGreaterThan(String value) {
            addCriterion("is_work >", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkGreaterThanOrEqualTo(String value) {
            addCriterion("is_work >=", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkLessThan(String value) {
            addCriterion("is_work <", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkLessThanOrEqualTo(String value) {
            addCriterion("is_work <=", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkLike(String value) {
            addCriterion("is_work like", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkNotLike(String value) {
            addCriterion("is_work not like", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkIn(List<String> values) {
            addCriterion("is_work in", values, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkNotIn(List<String> values) {
            addCriterion("is_work not in", values, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkBetween(String value1, String value2) {
            addCriterion("is_work between", value1, value2, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkNotBetween(String value1, String value2) {
            addCriterion("is_work not between", value1, value2, "isWork");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthIsNull() {
            addCriterion("kao_qin_month is null");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthIsNotNull() {
            addCriterion("kao_qin_month is not null");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthEqualTo(Date value) {
            addCriterion("kao_qin_month =", value, "kaoQinMonth");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthNotEqualTo(Date value) {
            addCriterion("kao_qin_month <>", value, "kaoQinMonth");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthGreaterThan(Date value) {
            addCriterion("kao_qin_month >", value, "kaoQinMonth");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthGreaterThanOrEqualTo(Date value) {
            addCriterion("kao_qin_month >=", value, "kaoQinMonth");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthLessThan(Date value) {
            addCriterion("kao_qin_month <", value, "kaoQinMonth");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthLessThanOrEqualTo(Date value) {
            addCriterion("kao_qin_month <=", value, "kaoQinMonth");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthIn(List<Date> values) {
            addCriterion("kao_qin_month in", values, "kaoQinMonth");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthNotIn(List<Date> values) {
            addCriterion("kao_qin_month not in", values, "kaoQinMonth");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthBetween(Date value1, Date value2) {
            addCriterion("kao_qin_month between", value1, value2, "kaoQinMonth");
            return (Criteria) this;
        }

        public Criteria andKaoQinMonthNotBetween(Date value1, Date value2) {
            addCriterion("kao_qin_month not between", value1, value2, "kaoQinMonth");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}