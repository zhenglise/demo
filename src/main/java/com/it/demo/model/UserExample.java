package com.it.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("entry_time is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("entry_time =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("entry_time <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("entry_time >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_time >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("entry_time <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("entry_time <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("entry_time in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("entry_time not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("entry_time between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("entry_time not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryGradeIsNull() {
            addCriterion("entry_grade is null");
            return (Criteria) this;
        }

        public Criteria andEntryGradeIsNotNull() {
            addCriterion("entry_grade is not null");
            return (Criteria) this;
        }

        public Criteria andEntryGradeEqualTo(String value) {
            addCriterion("entry_grade =", value, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeNotEqualTo(String value) {
            addCriterion("entry_grade <>", value, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeGreaterThan(String value) {
            addCriterion("entry_grade >", value, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeGreaterThanOrEqualTo(String value) {
            addCriterion("entry_grade >=", value, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeLessThan(String value) {
            addCriterion("entry_grade <", value, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeLessThanOrEqualTo(String value) {
            addCriterion("entry_grade <=", value, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeLike(String value) {
            addCriterion("entry_grade like", value, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeNotLike(String value) {
            addCriterion("entry_grade not like", value, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeIn(List<String> values) {
            addCriterion("entry_grade in", values, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeNotIn(List<String> values) {
            addCriterion("entry_grade not in", values, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeBetween(String value1, String value2) {
            addCriterion("entry_grade between", value1, value2, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntryGradeNotBetween(String value1, String value2) {
            addCriterion("entry_grade not between", value1, value2, "entryGrade");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryIsNull() {
            addCriterion("entry_salary is null");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryIsNotNull() {
            addCriterion("entry_salary is not null");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryEqualTo(BigDecimal value) {
            addCriterion("entry_salary =", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryNotEqualTo(BigDecimal value) {
            addCriterion("entry_salary <>", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryGreaterThan(BigDecimal value) {
            addCriterion("entry_salary >", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("entry_salary >=", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryLessThan(BigDecimal value) {
            addCriterion("entry_salary <", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("entry_salary <=", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryIn(List<BigDecimal> values) {
            addCriterion("entry_salary in", values, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryNotIn(List<BigDecimal> values) {
            addCriterion("entry_salary not in", values, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entry_salary between", value1, value2, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entry_salary not between", value1, value2, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeIsNull() {
            addCriterion("current_grade is null");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeIsNotNull() {
            addCriterion("current_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeEqualTo(String value) {
            addCriterion("current_grade =", value, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeNotEqualTo(String value) {
            addCriterion("current_grade <>", value, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeGreaterThan(String value) {
            addCriterion("current_grade >", value, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeGreaterThanOrEqualTo(String value) {
            addCriterion("current_grade >=", value, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeLessThan(String value) {
            addCriterion("current_grade <", value, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeLessThanOrEqualTo(String value) {
            addCriterion("current_grade <=", value, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeLike(String value) {
            addCriterion("current_grade like", value, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeNotLike(String value) {
            addCriterion("current_grade not like", value, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeIn(List<String> values) {
            addCriterion("current_grade in", values, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeNotIn(List<String> values) {
            addCriterion("current_grade not in", values, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeBetween(String value1, String value2) {
            addCriterion("current_grade between", value1, value2, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentGradeNotBetween(String value1, String value2) {
            addCriterion("current_grade not between", value1, value2, "currentGrade");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryIsNull() {
            addCriterion("current_salary is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryIsNotNull() {
            addCriterion("current_salary is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryEqualTo(BigDecimal value) {
            addCriterion("current_salary =", value, "currentSalary");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryNotEqualTo(BigDecimal value) {
            addCriterion("current_salary <>", value, "currentSalary");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryGreaterThan(BigDecimal value) {
            addCriterion("current_salary >", value, "currentSalary");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_salary >=", value, "currentSalary");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryLessThan(BigDecimal value) {
            addCriterion("current_salary <", value, "currentSalary");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_salary <=", value, "currentSalary");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryIn(List<BigDecimal> values) {
            addCriterion("current_salary in", values, "currentSalary");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryNotIn(List<BigDecimal> values) {
            addCriterion("current_salary not in", values, "currentSalary");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_salary between", value1, value2, "currentSalary");
            return (Criteria) this;
        }

        public Criteria andCurrentSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_salary not between", value1, value2, "currentSalary");
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

        public Criteria andLatelyChangeSalaryTimeIsNull() {
            addCriterion("lately_change_salary_time is null");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeIsNotNull() {
            addCriterion("lately_change_salary_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeEqualTo(String value) {
            addCriterion("lately_change_salary_time =", value, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeNotEqualTo(String value) {
            addCriterion("lately_change_salary_time <>", value, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeGreaterThan(String value) {
            addCriterion("lately_change_salary_time >", value, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("lately_change_salary_time >=", value, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeLessThan(String value) {
            addCriterion("lately_change_salary_time <", value, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeLessThanOrEqualTo(String value) {
            addCriterion("lately_change_salary_time <=", value, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeLike(String value) {
            addCriterion("lately_change_salary_time like", value, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeNotLike(String value) {
            addCriterion("lately_change_salary_time not like", value, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeIn(List<String> values) {
            addCriterion("lately_change_salary_time in", values, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeNotIn(List<String> values) {
            addCriterion("lately_change_salary_time not in", values, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeBetween(String value1, String value2) {
            addCriterion("lately_change_salary_time between", value1, value2, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andLatelyChangeSalaryTimeNotBetween(String value1, String value2) {
            addCriterion("lately_change_salary_time not between", value1, value2, "latelyChangeSalaryTime");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryIsNull() {
            addCriterion("ontrial_salary is null");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryIsNotNull() {
            addCriterion("ontrial_salary is not null");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryEqualTo(BigDecimal value) {
            addCriterion("ontrial_salary =", value, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryNotEqualTo(BigDecimal value) {
            addCriterion("ontrial_salary <>", value, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryGreaterThan(BigDecimal value) {
            addCriterion("ontrial_salary >", value, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ontrial_salary >=", value, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryLessThan(BigDecimal value) {
            addCriterion("ontrial_salary <", value, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ontrial_salary <=", value, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryIn(List<BigDecimal> values) {
            addCriterion("ontrial_salary in", values, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryNotIn(List<BigDecimal> values) {
            addCriterion("ontrial_salary not in", values, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ontrial_salary between", value1, value2, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andOntrialSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ontrial_salary not between", value1, value2, "ontrialSalary");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolIsNull() {
            addCriterion("graduation_school is null");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolIsNotNull() {
            addCriterion("graduation_school is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolEqualTo(String value) {
            addCriterion("graduation_school =", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotEqualTo(String value) {
            addCriterion("graduation_school <>", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolGreaterThan(String value) {
            addCriterion("graduation_school >", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduation_school >=", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolLessThan(String value) {
            addCriterion("graduation_school <", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduation_school <=", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolLike(String value) {
            addCriterion("graduation_school like", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotLike(String value) {
            addCriterion("graduation_school not like", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolIn(List<String> values) {
            addCriterion("graduation_school in", values, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotIn(List<String> values) {
            addCriterion("graduation_school not in", values, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolBetween(String value1, String value2) {
            addCriterion("graduation_school between", value1, value2, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotBetween(String value1, String value2) {
            addCriterion("graduation_school not between", value1, value2, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNull() {
            addCriterion("graduation_time is null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNotNull() {
            addCriterion("graduation_time is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeEqualTo(Date value) {
            addCriterion("graduation_time =", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotEqualTo(Date value) {
            addCriterion("graduation_time <>", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThan(Date value) {
            addCriterion("graduation_time >", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("graduation_time >=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThan(Date value) {
            addCriterion("graduation_time <", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThanOrEqualTo(Date value) {
            addCriterion("graduation_time <=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIn(List<Date> values) {
            addCriterion("graduation_time in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotIn(List<Date> values) {
            addCriterion("graduation_time not in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeBetween(Date value1, Date value2) {
            addCriterion("graduation_time between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotBetween(Date value1, Date value2) {
            addCriterion("graduation_time not between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsIsNull() {
            addCriterion("entry_before_years is null");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsIsNotNull() {
            addCriterion("entry_before_years is not null");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsEqualTo(BigDecimal value) {
            addCriterion("entry_before_years =", value, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsNotEqualTo(BigDecimal value) {
            addCriterion("entry_before_years <>", value, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsGreaterThan(BigDecimal value) {
            addCriterion("entry_before_years >", value, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("entry_before_years >=", value, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsLessThan(BigDecimal value) {
            addCriterion("entry_before_years <", value, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("entry_before_years <=", value, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsIn(List<BigDecimal> values) {
            addCriterion("entry_before_years in", values, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsNotIn(List<BigDecimal> values) {
            addCriterion("entry_before_years not in", values, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entry_before_years between", value1, value2, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryBeforeYearsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entry_before_years not between", value1, value2, "entryBeforeYears");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksIsNull() {
            addCriterion("entry_remarks is null");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksIsNotNull() {
            addCriterion("entry_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksEqualTo(String value) {
            addCriterion("entry_remarks =", value, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksNotEqualTo(String value) {
            addCriterion("entry_remarks <>", value, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksGreaterThan(String value) {
            addCriterion("entry_remarks >", value, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("entry_remarks >=", value, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksLessThan(String value) {
            addCriterion("entry_remarks <", value, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksLessThanOrEqualTo(String value) {
            addCriterion("entry_remarks <=", value, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksLike(String value) {
            addCriterion("entry_remarks like", value, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksNotLike(String value) {
            addCriterion("entry_remarks not like", value, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksIn(List<String> values) {
            addCriterion("entry_remarks in", values, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksNotIn(List<String> values) {
            addCriterion("entry_remarks not in", values, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksBetween(String value1, String value2) {
            addCriterion("entry_remarks between", value1, value2, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andEntryRemarksNotBetween(String value1, String value2) {
            addCriterion("entry_remarks not between", value1, value2, "entryRemarks");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsIsNull() {
            addCriterion("current_years is null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsIsNotNull() {
            addCriterion("current_years is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsEqualTo(BigDecimal value) {
            addCriterion("current_years =", value, "currentYears");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsNotEqualTo(BigDecimal value) {
            addCriterion("current_years <>", value, "currentYears");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsGreaterThan(BigDecimal value) {
            addCriterion("current_years >", value, "currentYears");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_years >=", value, "currentYears");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsLessThan(BigDecimal value) {
            addCriterion("current_years <", value, "currentYears");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_years <=", value, "currentYears");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsIn(List<BigDecimal> values) {
            addCriterion("current_years in", values, "currentYears");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsNotIn(List<BigDecimal> values) {
            addCriterion("current_years not in", values, "currentYears");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_years between", value1, value2, "currentYears");
            return (Criteria) this;
        }

        public Criteria andCurrentYearsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_years not between", value1, value2, "currentYears");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationIsNull() {
            addCriterion("whether_extrapolation is null");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationIsNotNull() {
            addCriterion("whether_extrapolation is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationEqualTo(String value) {
            addCriterion("whether_extrapolation =", value, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationNotEqualTo(String value) {
            addCriterion("whether_extrapolation <>", value, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationGreaterThan(String value) {
            addCriterion("whether_extrapolation >", value, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationGreaterThanOrEqualTo(String value) {
            addCriterion("whether_extrapolation >=", value, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationLessThan(String value) {
            addCriterion("whether_extrapolation <", value, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationLessThanOrEqualTo(String value) {
            addCriterion("whether_extrapolation <=", value, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationLike(String value) {
            addCriterion("whether_extrapolation like", value, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationNotLike(String value) {
            addCriterion("whether_extrapolation not like", value, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationIn(List<String> values) {
            addCriterion("whether_extrapolation in", values, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationNotIn(List<String> values) {
            addCriterion("whether_extrapolation not in", values, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationBetween(String value1, String value2) {
            addCriterion("whether_extrapolation between", value1, value2, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andWhetherExtrapolationNotBetween(String value1, String value2) {
            addCriterion("whether_extrapolation not between", value1, value2, "whetherExtrapolation");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneIsNull() {
            addCriterion("recruit_contribution_one is null");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneIsNotNull() {
            addCriterion("recruit_contribution_one is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneEqualTo(String value) {
            addCriterion("recruit_contribution_one =", value, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneNotEqualTo(String value) {
            addCriterion("recruit_contribution_one <>", value, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneGreaterThan(String value) {
            addCriterion("recruit_contribution_one >", value, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_contribution_one >=", value, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneLessThan(String value) {
            addCriterion("recruit_contribution_one <", value, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneLessThanOrEqualTo(String value) {
            addCriterion("recruit_contribution_one <=", value, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneLike(String value) {
            addCriterion("recruit_contribution_one like", value, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneNotLike(String value) {
            addCriterion("recruit_contribution_one not like", value, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneIn(List<String> values) {
            addCriterion("recruit_contribution_one in", values, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneNotIn(List<String> values) {
            addCriterion("recruit_contribution_one not in", values, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneBetween(String value1, String value2) {
            addCriterion("recruit_contribution_one between", value1, value2, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionOneNotBetween(String value1, String value2) {
            addCriterion("recruit_contribution_one not between", value1, value2, "recruitContributionOne");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoIsNull() {
            addCriterion("recruit_contribution_two is null");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoIsNotNull() {
            addCriterion("recruit_contribution_two is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoEqualTo(String value) {
            addCriterion("recruit_contribution_two =", value, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoNotEqualTo(String value) {
            addCriterion("recruit_contribution_two <>", value, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoGreaterThan(String value) {
            addCriterion("recruit_contribution_two >", value, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_contribution_two >=", value, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoLessThan(String value) {
            addCriterion("recruit_contribution_two <", value, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoLessThanOrEqualTo(String value) {
            addCriterion("recruit_contribution_two <=", value, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoLike(String value) {
            addCriterion("recruit_contribution_two like", value, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoNotLike(String value) {
            addCriterion("recruit_contribution_two not like", value, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoIn(List<String> values) {
            addCriterion("recruit_contribution_two in", values, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoNotIn(List<String> values) {
            addCriterion("recruit_contribution_two not in", values, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoBetween(String value1, String value2) {
            addCriterion("recruit_contribution_two between", value1, value2, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andRecruitContributionTwoNotBetween(String value1, String value2) {
            addCriterion("recruit_contribution_two not between", value1, value2, "recruitContributionTwo");
            return (Criteria) this;
        }

        public Criteria andIsJobIsNull() {
            addCriterion("is_job is null");
            return (Criteria) this;
        }

        public Criteria andIsJobIsNotNull() {
            addCriterion("is_job is not null");
            return (Criteria) this;
        }

        public Criteria andIsJobEqualTo(String value) {
            addCriterion("is_job =", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotEqualTo(String value) {
            addCriterion("is_job <>", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobGreaterThan(String value) {
            addCriterion("is_job >", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobGreaterThanOrEqualTo(String value) {
            addCriterion("is_job >=", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobLessThan(String value) {
            addCriterion("is_job <", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobLessThanOrEqualTo(String value) {
            addCriterion("is_job <=", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobLike(String value) {
            addCriterion("is_job like", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotLike(String value) {
            addCriterion("is_job not like", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobIn(List<String> values) {
            addCriterion("is_job in", values, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotIn(List<String> values) {
            addCriterion("is_job not in", values, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobBetween(String value1, String value2) {
            addCriterion("is_job between", value1, value2, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotBetween(String value1, String value2) {
            addCriterion("is_job not between", value1, value2, "isJob");
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