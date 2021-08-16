package com.it.demo.model;

import java.util.ArrayList;
import java.util.List;

public class JiXiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiXiaoExample() {
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

        public Criteria andJiXiaoIdIsNull() {
            addCriterion("ji_xiao_id is null");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdIsNotNull() {
            addCriterion("ji_xiao_id is not null");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdEqualTo(Integer value) {
            addCriterion("ji_xiao_id =", value, "jiXiaoId");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdNotEqualTo(Integer value) {
            addCriterion("ji_xiao_id <>", value, "jiXiaoId");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdGreaterThan(Integer value) {
            addCriterion("ji_xiao_id >", value, "jiXiaoId");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ji_xiao_id >=", value, "jiXiaoId");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdLessThan(Integer value) {
            addCriterion("ji_xiao_id <", value, "jiXiaoId");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdLessThanOrEqualTo(Integer value) {
            addCriterion("ji_xiao_id <=", value, "jiXiaoId");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdIn(List<Integer> values) {
            addCriterion("ji_xiao_id in", values, "jiXiaoId");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdNotIn(List<Integer> values) {
            addCriterion("ji_xiao_id not in", values, "jiXiaoId");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdBetween(Integer value1, Integer value2) {
            addCriterion("ji_xiao_id between", value1, value2, "jiXiaoId");
            return (Criteria) this;
        }

        public Criteria andJiXiaoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ji_xiao_id not between", value1, value2, "jiXiaoId");
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

        public Criteria andInitialLevelIsNull() {
            addCriterion("initial_level is null");
            return (Criteria) this;
        }

        public Criteria andInitialLevelIsNotNull() {
            addCriterion("initial_level is not null");
            return (Criteria) this;
        }

        public Criteria andInitialLevelEqualTo(String value) {
            addCriterion("initial_level =", value, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelNotEqualTo(String value) {
            addCriterion("initial_level <>", value, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelGreaterThan(String value) {
            addCriterion("initial_level >", value, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelGreaterThanOrEqualTo(String value) {
            addCriterion("initial_level >=", value, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelLessThan(String value) {
            addCriterion("initial_level <", value, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelLessThanOrEqualTo(String value) {
            addCriterion("initial_level <=", value, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelLike(String value) {
            addCriterion("initial_level like", value, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelNotLike(String value) {
            addCriterion("initial_level not like", value, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelIn(List<String> values) {
            addCriterion("initial_level in", values, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelNotIn(List<String> values) {
            addCriterion("initial_level not in", values, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelBetween(String value1, String value2) {
            addCriterion("initial_level between", value1, value2, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialLevelNotBetween(String value1, String value2) {
            addCriterion("initial_level not between", value1, value2, "initialLevel");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyIsNull() {
            addCriterion("initial_money is null");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyIsNotNull() {
            addCriterion("initial_money is not null");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyEqualTo(Integer value) {
            addCriterion("initial_money =", value, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyNotEqualTo(Integer value) {
            addCriterion("initial_money <>", value, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyGreaterThan(Integer value) {
            addCriterion("initial_money >", value, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("initial_money >=", value, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyLessThan(Integer value) {
            addCriterion("initial_money <", value, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("initial_money <=", value, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyIn(List<Integer> values) {
            addCriterion("initial_money in", values, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyNotIn(List<Integer> values) {
            addCriterion("initial_money not in", values, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyBetween(Integer value1, Integer value2) {
            addCriterion("initial_money between", value1, value2, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andInitialMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("initial_money not between", value1, value2, "initialMoney");
            return (Criteria) this;
        }

        public Criteria andFinalLevelIsNull() {
            addCriterion("final_level is null");
            return (Criteria) this;
        }

        public Criteria andFinalLevelIsNotNull() {
            addCriterion("final_level is not null");
            return (Criteria) this;
        }

        public Criteria andFinalLevelEqualTo(String value) {
            addCriterion("final_level =", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelNotEqualTo(String value) {
            addCriterion("final_level <>", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelGreaterThan(String value) {
            addCriterion("final_level >", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelGreaterThanOrEqualTo(String value) {
            addCriterion("final_level >=", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelLessThan(String value) {
            addCriterion("final_level <", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelLessThanOrEqualTo(String value) {
            addCriterion("final_level <=", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelLike(String value) {
            addCriterion("final_level like", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelNotLike(String value) {
            addCriterion("final_level not like", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelIn(List<String> values) {
            addCriterion("final_level in", values, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelNotIn(List<String> values) {
            addCriterion("final_level not in", values, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelBetween(String value1, String value2) {
            addCriterion("final_level between", value1, value2, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelNotBetween(String value1, String value2) {
            addCriterion("final_level not between", value1, value2, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyIsNull() {
            addCriterion("final_money is null");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyIsNotNull() {
            addCriterion("final_money is not null");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyEqualTo(Integer value) {
            addCriterion("final_money =", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyNotEqualTo(Integer value) {
            addCriterion("final_money <>", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyGreaterThan(Integer value) {
            addCriterion("final_money >", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_money >=", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyLessThan(Integer value) {
            addCriterion("final_money <", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("final_money <=", value, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyIn(List<Integer> values) {
            addCriterion("final_money in", values, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyNotIn(List<Integer> values) {
            addCriterion("final_money not in", values, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyBetween(Integer value1, Integer value2) {
            addCriterion("final_money between", value1, value2, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andFinalMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("final_money not between", value1, value2, "finalMoney");
            return (Criteria) this;
        }

        public Criteria andYearMonthIsNull() {
            addCriterion("year_month is null");
            return (Criteria) this;
        }

        public Criteria andYearMonthIsNotNull() {
            addCriterion("year_month is not null");
            return (Criteria) this;
        }

        public Criteria andYearMonthEqualTo(String value) {
            addCriterion("year_month =", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotEqualTo(String value) {
            addCriterion("year_month <>", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThan(String value) {
            addCriterion("year_month >", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThanOrEqualTo(String value) {
            addCriterion("year_month >=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThan(String value) {
            addCriterion("year_month <", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThanOrEqualTo(String value) {
            addCriterion("year_month <=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLike(String value) {
            addCriterion("year_month like", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotLike(String value) {
            addCriterion("year_month not like", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthIn(List<String> values) {
            addCriterion("year_month in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotIn(List<String> values) {
            addCriterion("year_month not in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthBetween(String value1, String value2) {
            addCriterion("year_month between", value1, value2, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotBetween(String value1, String value2) {
            addCriterion("year_month not between", value1, value2, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksIsNull() {
            addCriterion("work_remarks is null");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksIsNotNull() {
            addCriterion("work_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksEqualTo(String value) {
            addCriterion("work_remarks =", value, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksNotEqualTo(String value) {
            addCriterion("work_remarks <>", value, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksGreaterThan(String value) {
            addCriterion("work_remarks >", value, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("work_remarks >=", value, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksLessThan(String value) {
            addCriterion("work_remarks <", value, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksLessThanOrEqualTo(String value) {
            addCriterion("work_remarks <=", value, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksLike(String value) {
            addCriterion("work_remarks like", value, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksNotLike(String value) {
            addCriterion("work_remarks not like", value, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksIn(List<String> values) {
            addCriterion("work_remarks in", values, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksNotIn(List<String> values) {
            addCriterion("work_remarks not in", values, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksBetween(String value1, String value2) {
            addCriterion("work_remarks between", value1, value2, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andWorkRemarksNotBetween(String value1, String value2) {
            addCriterion("work_remarks not between", value1, value2, "workRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksIsNull() {
            addCriterion("superior_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksIsNotNull() {
            addCriterion("superior_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksEqualTo(String value) {
            addCriterion("superior_remarks =", value, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksNotEqualTo(String value) {
            addCriterion("superior_remarks <>", value, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksGreaterThan(String value) {
            addCriterion("superior_remarks >", value, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("superior_remarks >=", value, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksLessThan(String value) {
            addCriterion("superior_remarks <", value, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksLessThanOrEqualTo(String value) {
            addCriterion("superior_remarks <=", value, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksLike(String value) {
            addCriterion("superior_remarks like", value, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksNotLike(String value) {
            addCriterion("superior_remarks not like", value, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksIn(List<String> values) {
            addCriterion("superior_remarks in", values, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksNotIn(List<String> values) {
            addCriterion("superior_remarks not in", values, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksBetween(String value1, String value2) {
            addCriterion("superior_remarks between", value1, value2, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andSuperiorRemarksNotBetween(String value1, String value2) {
            addCriterion("superior_remarks not between", value1, value2, "superiorRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksIsNull() {
            addCriterion("executive_remarks is null");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksIsNotNull() {
            addCriterion("executive_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksEqualTo(String value) {
            addCriterion("executive_remarks =", value, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksNotEqualTo(String value) {
            addCriterion("executive_remarks <>", value, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksGreaterThan(String value) {
            addCriterion("executive_remarks >", value, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("executive_remarks >=", value, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksLessThan(String value) {
            addCriterion("executive_remarks <", value, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksLessThanOrEqualTo(String value) {
            addCriterion("executive_remarks <=", value, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksLike(String value) {
            addCriterion("executive_remarks like", value, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksNotLike(String value) {
            addCriterion("executive_remarks not like", value, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksIn(List<String> values) {
            addCriterion("executive_remarks in", values, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksNotIn(List<String> values) {
            addCriterion("executive_remarks not in", values, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksBetween(String value1, String value2) {
            addCriterion("executive_remarks between", value1, value2, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andExecutiveRemarksNotBetween(String value1, String value2) {
            addCriterion("executive_remarks not between", value1, value2, "executiveRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksIsNull() {
            addCriterion("other_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksIsNotNull() {
            addCriterion("other_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksEqualTo(String value) {
            addCriterion("other_remarks =", value, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksNotEqualTo(String value) {
            addCriterion("other_remarks <>", value, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksGreaterThan(String value) {
            addCriterion("other_remarks >", value, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("other_remarks >=", value, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksLessThan(String value) {
            addCriterion("other_remarks <", value, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksLessThanOrEqualTo(String value) {
            addCriterion("other_remarks <=", value, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksLike(String value) {
            addCriterion("other_remarks like", value, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksNotLike(String value) {
            addCriterion("other_remarks not like", value, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksIn(List<String> values) {
            addCriterion("other_remarks in", values, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksNotIn(List<String> values) {
            addCriterion("other_remarks not in", values, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksBetween(String value1, String value2) {
            addCriterion("other_remarks between", value1, value2, "otherRemarks");
            return (Criteria) this;
        }

        public Criteria andOtherRemarksNotBetween(String value1, String value2) {
            addCriterion("other_remarks not between", value1, value2, "otherRemarks");
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