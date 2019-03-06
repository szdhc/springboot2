package com.szdhc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxUserExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSessionkeyIsNull() {
            addCriterion("sessionkey is null");
            return (Criteria) this;
        }

        public Criteria andSessionkeyIsNotNull() {
            addCriterion("sessionkey is not null");
            return (Criteria) this;
        }

        public Criteria andSessionkeyEqualTo(String value) {
            addCriterion("sessionkey =", value, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyNotEqualTo(String value) {
            addCriterion("sessionkey <>", value, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyGreaterThan(String value) {
            addCriterion("sessionkey >", value, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyGreaterThanOrEqualTo(String value) {
            addCriterion("sessionkey >=", value, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyLessThan(String value) {
            addCriterion("sessionkey <", value, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyLessThanOrEqualTo(String value) {
            addCriterion("sessionkey <=", value, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyLike(String value) {
            addCriterion("sessionkey like", value, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyNotLike(String value) {
            addCriterion("sessionkey not like", value, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyIn(List<String> values) {
            addCriterion("sessionkey in", values, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyNotIn(List<String> values) {
            addCriterion("sessionkey not in", values, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyBetween(String value1, String value2) {
            addCriterion("sessionkey between", value1, value2, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSessionkeyNotBetween(String value1, String value2) {
            addCriterion("sessionkey not between", value1, value2, "sessionkey");
            return (Criteria) this;
        }

        public Criteria andSkeyIsNull() {
            addCriterion("skey is null");
            return (Criteria) this;
        }

        public Criteria andSkeyIsNotNull() {
            addCriterion("skey is not null");
            return (Criteria) this;
        }

        public Criteria andSkeyEqualTo(String value) {
            addCriterion("skey =", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyNotEqualTo(String value) {
            addCriterion("skey <>", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyGreaterThan(String value) {
            addCriterion("skey >", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyGreaterThanOrEqualTo(String value) {
            addCriterion("skey >=", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyLessThan(String value) {
            addCriterion("skey <", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyLessThanOrEqualTo(String value) {
            addCriterion("skey <=", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyLike(String value) {
            addCriterion("skey like", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyNotLike(String value) {
            addCriterion("skey not like", value, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyIn(List<String> values) {
            addCriterion("skey in", values, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyNotIn(List<String> values) {
            addCriterion("skey not in", values, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyBetween(String value1, String value2) {
            addCriterion("skey between", value1, value2, "skey");
            return (Criteria) this;
        }

        public Criteria andSkeyNotBetween(String value1, String value2) {
            addCriterion("skey not between", value1, value2, "skey");
            return (Criteria) this;
        }

        public Criteria andUavatarIsNull() {
            addCriterion("uavatar is null");
            return (Criteria) this;
        }

        public Criteria andUavatarIsNotNull() {
            addCriterion("uavatar is not null");
            return (Criteria) this;
        }

        public Criteria andUavatarEqualTo(String value) {
            addCriterion("uavatar =", value, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarNotEqualTo(String value) {
            addCriterion("uavatar <>", value, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarGreaterThan(String value) {
            addCriterion("uavatar >", value, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarGreaterThanOrEqualTo(String value) {
            addCriterion("uavatar >=", value, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarLessThan(String value) {
            addCriterion("uavatar <", value, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarLessThanOrEqualTo(String value) {
            addCriterion("uavatar <=", value, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarLike(String value) {
            addCriterion("uavatar like", value, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarNotLike(String value) {
            addCriterion("uavatar not like", value, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarIn(List<String> values) {
            addCriterion("uavatar in", values, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarNotIn(List<String> values) {
            addCriterion("uavatar not in", values, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarBetween(String value1, String value2) {
            addCriterion("uavatar between", value1, value2, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUavatarNotBetween(String value1, String value2) {
            addCriterion("uavatar not between", value1, value2, "uavatar");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUgenderIsNull() {
            addCriterion("ugender is null");
            return (Criteria) this;
        }

        public Criteria andUgenderIsNotNull() {
            addCriterion("ugender is not null");
            return (Criteria) this;
        }

        public Criteria andUgenderEqualTo(Integer value) {
            addCriterion("ugender =", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotEqualTo(Integer value) {
            addCriterion("ugender <>", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderGreaterThan(Integer value) {
            addCriterion("ugender >", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ugender >=", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLessThan(Integer value) {
            addCriterion("ugender <", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLessThanOrEqualTo(Integer value) {
            addCriterion("ugender <=", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderIn(List<Integer> values) {
            addCriterion("ugender in", values, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotIn(List<Integer> values) {
            addCriterion("ugender not in", values, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderBetween(Integer value1, Integer value2) {
            addCriterion("ugender between", value1, value2, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotBetween(Integer value1, Integer value2) {
            addCriterion("ugender not between", value1, value2, "ugender");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNull() {
            addCriterion("uaddress is null");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNotNull() {
            addCriterion("uaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUaddressEqualTo(String value) {
            addCriterion("uaddress =", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotEqualTo(String value) {
            addCriterion("uaddress <>", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThan(String value) {
            addCriterion("uaddress >", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThanOrEqualTo(String value) {
            addCriterion("uaddress >=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThan(String value) {
            addCriterion("uaddress <", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThanOrEqualTo(String value) {
            addCriterion("uaddress <=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLike(String value) {
            addCriterion("uaddress like", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotLike(String value) {
            addCriterion("uaddress not like", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressIn(List<String> values) {
            addCriterion("uaddress in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotIn(List<String> values) {
            addCriterion("uaddress not in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressBetween(String value1, String value2) {
            addCriterion("uaddress between", value1, value2, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotBetween(String value1, String value2) {
            addCriterion("uaddress not between", value1, value2, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUbalanceIsNull() {
            addCriterion("ubalance is null");
            return (Criteria) this;
        }

        public Criteria andUbalanceIsNotNull() {
            addCriterion("ubalance is not null");
            return (Criteria) this;
        }

        public Criteria andUbalanceEqualTo(Integer value) {
            addCriterion("ubalance =", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceNotEqualTo(Integer value) {
            addCriterion("ubalance <>", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceGreaterThan(Integer value) {
            addCriterion("ubalance >", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubalance >=", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceLessThan(Integer value) {
            addCriterion("ubalance <", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceLessThanOrEqualTo(Integer value) {
            addCriterion("ubalance <=", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceIn(List<Integer> values) {
            addCriterion("ubalance in", values, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceNotIn(List<Integer> values) {
            addCriterion("ubalance not in", values, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceBetween(Integer value1, Integer value2) {
            addCriterion("ubalance between", value1, value2, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("ubalance not between", value1, value2, "ubalance");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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