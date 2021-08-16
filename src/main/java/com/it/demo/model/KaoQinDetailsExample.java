package com.it.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KaoQinDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KaoQinDetailsExample() {
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

        public Criteria andKaoQinDetailsIdIsNull() {
            addCriterion("kao_qin_details_id is null");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdIsNotNull() {
            addCriterion("kao_qin_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdEqualTo(Integer value) {
            addCriterion("kao_qin_details_id =", value, "kaoQinDetailsId");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdNotEqualTo(Integer value) {
            addCriterion("kao_qin_details_id <>", value, "kaoQinDetailsId");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdGreaterThan(Integer value) {
            addCriterion("kao_qin_details_id >", value, "kaoQinDetailsId");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kao_qin_details_id >=", value, "kaoQinDetailsId");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdLessThan(Integer value) {
            addCriterion("kao_qin_details_id <", value, "kaoQinDetailsId");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("kao_qin_details_id <=", value, "kaoQinDetailsId");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdIn(List<Integer> values) {
            addCriterion("kao_qin_details_id in", values, "kaoQinDetailsId");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdNotIn(List<Integer> values) {
            addCriterion("kao_qin_details_id not in", values, "kaoQinDetailsId");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("kao_qin_details_id between", value1, value2, "kaoQinDetailsId");
            return (Criteria) this;
        }

        public Criteria andKaoQinDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kao_qin_details_id not between", value1, value2, "kaoQinDetailsId");
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

        public Criteria andKaoqinDateIsNull() {
            addCriterion("kaoqin_date is null");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateIsNotNull() {
            addCriterion("kaoqin_date is not null");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateEqualTo(String value) {
            addCriterion("kaoqin_date =", value, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateNotEqualTo(String value) {
            addCriterion("kaoqin_date <>", value, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateGreaterThan(String value) {
            addCriterion("kaoqin_date >", value, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateGreaterThanOrEqualTo(String value) {
            addCriterion("kaoqin_date >=", value, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateLessThan(String value) {
            addCriterion("kaoqin_date <", value, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateLessThanOrEqualTo(String value) {
            addCriterion("kaoqin_date <=", value, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateLike(String value) {
            addCriterion("kaoqin_date like", value, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateNotLike(String value) {
            addCriterion("kaoqin_date not like", value, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateIn(List<String> values) {
            addCriterion("kaoqin_date in", values, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateNotIn(List<String> values) {
            addCriterion("kaoqin_date not in", values, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateBetween(String value1, String value2) {
            addCriterion("kaoqin_date between", value1, value2, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andKaoqinDateNotBetween(String value1, String value2) {
            addCriterion("kaoqin_date not between", value1, value2, "kaoqinDate");
            return (Criteria) this;
        }

        public Criteria andZaoTimeIsNull() {
            addCriterion("zao_time is null");
            return (Criteria) this;
        }

        public Criteria andZaoTimeIsNotNull() {
            addCriterion("zao_time is not null");
            return (Criteria) this;
        }

        public Criteria andZaoTimeEqualTo(String value) {
            addCriterion("zao_time =", value, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeNotEqualTo(String value) {
            addCriterion("zao_time <>", value, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeGreaterThan(String value) {
            addCriterion("zao_time >", value, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("zao_time >=", value, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeLessThan(String value) {
            addCriterion("zao_time <", value, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeLessThanOrEqualTo(String value) {
            addCriterion("zao_time <=", value, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeLike(String value) {
            addCriterion("zao_time like", value, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeNotLike(String value) {
            addCriterion("zao_time not like", value, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeIn(List<String> values) {
            addCriterion("zao_time in", values, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeNotIn(List<String> values) {
            addCriterion("zao_time not in", values, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeBetween(String value1, String value2) {
            addCriterion("zao_time between", value1, value2, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoTimeNotBetween(String value1, String value2) {
            addCriterion("zao_time not between", value1, value2, "zaoTime");
            return (Criteria) this;
        }

        public Criteria andZaoStartIsNull() {
            addCriterion("zao_start is null");
            return (Criteria) this;
        }

        public Criteria andZaoStartIsNotNull() {
            addCriterion("zao_start is not null");
            return (Criteria) this;
        }

        public Criteria andZaoStartEqualTo(String value) {
            addCriterion("zao_start =", value, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartNotEqualTo(String value) {
            addCriterion("zao_start <>", value, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartGreaterThan(String value) {
            addCriterion("zao_start >", value, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartGreaterThanOrEqualTo(String value) {
            addCriterion("zao_start >=", value, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartLessThan(String value) {
            addCriterion("zao_start <", value, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartLessThanOrEqualTo(String value) {
            addCriterion("zao_start <=", value, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartLike(String value) {
            addCriterion("zao_start like", value, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartNotLike(String value) {
            addCriterion("zao_start not like", value, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartIn(List<String> values) {
            addCriterion("zao_start in", values, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartNotIn(List<String> values) {
            addCriterion("zao_start not in", values, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartBetween(String value1, String value2) {
            addCriterion("zao_start between", value1, value2, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andZaoStartNotBetween(String value1, String value2) {
            addCriterion("zao_start not between", value1, value2, "zaoStart");
            return (Criteria) this;
        }

        public Criteria andWanTimeIsNull() {
            addCriterion("wan_time is null");
            return (Criteria) this;
        }

        public Criteria andWanTimeIsNotNull() {
            addCriterion("wan_time is not null");
            return (Criteria) this;
        }

        public Criteria andWanTimeEqualTo(String value) {
            addCriterion("wan_time =", value, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeNotEqualTo(String value) {
            addCriterion("wan_time <>", value, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeGreaterThan(String value) {
            addCriterion("wan_time >", value, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeGreaterThanOrEqualTo(String value) {
            addCriterion("wan_time >=", value, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeLessThan(String value) {
            addCriterion("wan_time <", value, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeLessThanOrEqualTo(String value) {
            addCriterion("wan_time <=", value, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeLike(String value) {
            addCriterion("wan_time like", value, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeNotLike(String value) {
            addCriterion("wan_time not like", value, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeIn(List<String> values) {
            addCriterion("wan_time in", values, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeNotIn(List<String> values) {
            addCriterion("wan_time not in", values, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeBetween(String value1, String value2) {
            addCriterion("wan_time between", value1, value2, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanTimeNotBetween(String value1, String value2) {
            addCriterion("wan_time not between", value1, value2, "wanTime");
            return (Criteria) this;
        }

        public Criteria andWanStartIsNull() {
            addCriterion("wan_start is null");
            return (Criteria) this;
        }

        public Criteria andWanStartIsNotNull() {
            addCriterion("wan_start is not null");
            return (Criteria) this;
        }

        public Criteria andWanStartEqualTo(String value) {
            addCriterion("wan_start =", value, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartNotEqualTo(String value) {
            addCriterion("wan_start <>", value, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartGreaterThan(String value) {
            addCriterion("wan_start >", value, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartGreaterThanOrEqualTo(String value) {
            addCriterion("wan_start >=", value, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartLessThan(String value) {
            addCriterion("wan_start <", value, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartLessThanOrEqualTo(String value) {
            addCriterion("wan_start <=", value, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartLike(String value) {
            addCriterion("wan_start like", value, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartNotLike(String value) {
            addCriterion("wan_start not like", value, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartIn(List<String> values) {
            addCriterion("wan_start in", values, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartNotIn(List<String> values) {
            addCriterion("wan_start not in", values, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartBetween(String value1, String value2) {
            addCriterion("wan_start between", value1, value2, "wanStart");
            return (Criteria) this;
        }

        public Criteria andWanStartNotBetween(String value1, String value2) {
            addCriterion("wan_start not between", value1, value2, "wanStart");
            return (Criteria) this;
        }

        public Criteria andRiqiDateIsNull() {
            addCriterion("riqi_date is null");
            return (Criteria) this;
        }

        public Criteria andRiqiDateIsNotNull() {
            addCriterion("riqi_date is not null");
            return (Criteria) this;
        }

        public Criteria andRiqiDateEqualTo(Date value) {
            addCriterion("riqi_date =", value, "riqiDate");
            return (Criteria) this;
        }

        public Criteria andRiqiDateNotEqualTo(Date value) {
            addCriterion("riqi_date <>", value, "riqiDate");
            return (Criteria) this;
        }

        public Criteria andRiqiDateGreaterThan(Date value) {
            addCriterion("riqi_date >", value, "riqiDate");
            return (Criteria) this;
        }

        public Criteria andRiqiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("riqi_date >=", value, "riqiDate");
            return (Criteria) this;
        }

        public Criteria andRiqiDateLessThan(Date value) {
            addCriterion("riqi_date <", value, "riqiDate");
            return (Criteria) this;
        }

        public Criteria andRiqiDateLessThanOrEqualTo(Date value) {
            addCriterion("riqi_date <=", value, "riqiDate");
            return (Criteria) this;
        }

        public Criteria andRiqiDateIn(List<Date> values) {
            addCriterion("riqi_date in", values, "riqiDate");
            return (Criteria) this;
        }

        public Criteria andRiqiDateNotIn(List<Date> values) {
            addCriterion("riqi_date not in", values, "riqiDate");
            return (Criteria) this;
        }

        public Criteria andRiqiDateBetween(Date value1, Date value2) {
            addCriterion("riqi_date between", value1, value2, "riqiDate");
            return (Criteria) this;
        }

        public Criteria andRiqiDateNotBetween(Date value1, Date value2) {
            addCriterion("riqi_date not between", value1, value2, "riqiDate");
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