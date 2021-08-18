package com.it.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ErpRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErpRecordExample() {
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

        public Criteria andErpIdIsNull() {
            addCriterion("erp_id is null");
            return (Criteria) this;
        }

        public Criteria andErpIdIsNotNull() {
            addCriterion("erp_id is not null");
            return (Criteria) this;
        }

        public Criteria andErpIdEqualTo(Integer value) {
            addCriterion("erp_id =", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdNotEqualTo(Integer value) {
            addCriterion("erp_id <>", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdGreaterThan(Integer value) {
            addCriterion("erp_id >", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("erp_id >=", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdLessThan(Integer value) {
            addCriterion("erp_id <", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdLessThanOrEqualTo(Integer value) {
            addCriterion("erp_id <=", value, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdIn(List<Integer> values) {
            addCriterion("erp_id in", values, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdNotIn(List<Integer> values) {
            addCriterion("erp_id not in", values, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdBetween(Integer value1, Integer value2) {
            addCriterion("erp_id between", value1, value2, "erpId");
            return (Criteria) this;
        }

        public Criteria andErpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("erp_id not between", value1, value2, "erpId");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andPassworkIsNull() {
            addCriterion("passwork is null");
            return (Criteria) this;
        }

        public Criteria andPassworkIsNotNull() {
            addCriterion("passwork is not null");
            return (Criteria) this;
        }

        public Criteria andPassworkEqualTo(String value) {
            addCriterion("passwork =", value, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkNotEqualTo(String value) {
            addCriterion("passwork <>", value, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkGreaterThan(String value) {
            addCriterion("passwork >", value, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkGreaterThanOrEqualTo(String value) {
            addCriterion("passwork >=", value, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkLessThan(String value) {
            addCriterion("passwork <", value, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkLessThanOrEqualTo(String value) {
            addCriterion("passwork <=", value, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkLike(String value) {
            addCriterion("passwork like", value, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkNotLike(String value) {
            addCriterion("passwork not like", value, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkIn(List<String> values) {
            addCriterion("passwork in", values, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkNotIn(List<String> values) {
            addCriterion("passwork not in", values, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkBetween(String value1, String value2) {
            addCriterion("passwork between", value1, value2, "passwork");
            return (Criteria) this;
        }

        public Criteria andPassworkNotBetween(String value1, String value2) {
            addCriterion("passwork not between", value1, value2, "passwork");
            return (Criteria) this;
        }

        public Criteria andAboutMeunIsNull() {
            addCriterion("about_meun is null");
            return (Criteria) this;
        }

        public Criteria andAboutMeunIsNotNull() {
            addCriterion("about_meun is not null");
            return (Criteria) this;
        }

        public Criteria andAboutMeunEqualTo(String value) {
            addCriterion("about_meun =", value, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunNotEqualTo(String value) {
            addCriterion("about_meun <>", value, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunGreaterThan(String value) {
            addCriterion("about_meun >", value, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunGreaterThanOrEqualTo(String value) {
            addCriterion("about_meun >=", value, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunLessThan(String value) {
            addCriterion("about_meun <", value, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunLessThanOrEqualTo(String value) {
            addCriterion("about_meun <=", value, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunLike(String value) {
            addCriterion("about_meun like", value, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunNotLike(String value) {
            addCriterion("about_meun not like", value, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunIn(List<String> values) {
            addCriterion("about_meun in", values, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunNotIn(List<String> values) {
            addCriterion("about_meun not in", values, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunBetween(String value1, String value2) {
            addCriterion("about_meun between", value1, value2, "aboutMeun");
            return (Criteria) this;
        }

        public Criteria andAboutMeunNotBetween(String value1, String value2) {
            addCriterion("about_meun not between", value1, value2, "aboutMeun");
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