package com.szdhc.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodidIsNull() {
            addCriterion("goodid is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(String value) {
            addCriterion("goodid =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(String value) {
            addCriterion("goodid <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(String value) {
            addCriterion("goodid >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(String value) {
            addCriterion("goodid >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(String value) {
            addCriterion("goodid <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(String value) {
            addCriterion("goodid <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLike(String value) {
            addCriterion("goodid like", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotLike(String value) {
            addCriterion("goodid not like", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<String> values) {
            addCriterion("goodid in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<String> values) {
            addCriterion("goodid not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(String value1, String value2) {
            addCriterion("goodid between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(String value1, String value2) {
            addCriterion("goodid not between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidIsNull() {
            addCriterion("goodtypeid is null");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidIsNotNull() {
            addCriterion("goodtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidEqualTo(String value) {
            addCriterion("goodtypeid =", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidNotEqualTo(String value) {
            addCriterion("goodtypeid <>", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidGreaterThan(String value) {
            addCriterion("goodtypeid >", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("goodtypeid >=", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidLessThan(String value) {
            addCriterion("goodtypeid <", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidLessThanOrEqualTo(String value) {
            addCriterion("goodtypeid <=", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidLike(String value) {
            addCriterion("goodtypeid like", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidNotLike(String value) {
            addCriterion("goodtypeid not like", value, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidIn(List<String> values) {
            addCriterion("goodtypeid in", values, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidNotIn(List<String> values) {
            addCriterion("goodtypeid not in", values, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidBetween(String value1, String value2) {
            addCriterion("goodtypeid between", value1, value2, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodtypeidNotBetween(String value1, String value2) {
            addCriterion("goodtypeid not between", value1, value2, "goodtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNull() {
            addCriterion("goodname is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("goodname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("goodname =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("goodname <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("goodname >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodname >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("goodname <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("goodname <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("goodname like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("goodname not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("goodname in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("goodname not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("goodname between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("goodname not between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNull() {
            addCriterion("goodprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNotNull() {
            addCriterion("goodprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceEqualTo(BigDecimal value) {
            addCriterion("goodprice =", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotEqualTo(BigDecimal value) {
            addCriterion("goodprice <>", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThan(BigDecimal value) {
            addCriterion("goodprice >", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goodprice >=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThan(BigDecimal value) {
            addCriterion("goodprice <", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goodprice <=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIn(List<BigDecimal> values) {
            addCriterion("goodprice in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotIn(List<BigDecimal> values) {
            addCriterion("goodprice not in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodprice between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goodprice not between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionIsNull() {
            addCriterion("gooddescription is null");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionIsNotNull() {
            addCriterion("gooddescription is not null");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionEqualTo(String value) {
            addCriterion("gooddescription =", value, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionNotEqualTo(String value) {
            addCriterion("gooddescription <>", value, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionGreaterThan(String value) {
            addCriterion("gooddescription >", value, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("gooddescription >=", value, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionLessThan(String value) {
            addCriterion("gooddescription <", value, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionLessThanOrEqualTo(String value) {
            addCriterion("gooddescription <=", value, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionLike(String value) {
            addCriterion("gooddescription like", value, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionNotLike(String value) {
            addCriterion("gooddescription not like", value, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionIn(List<String> values) {
            addCriterion("gooddescription in", values, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionNotIn(List<String> values) {
            addCriterion("gooddescription not in", values, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionBetween(String value1, String value2) {
            addCriterion("gooddescription between", value1, value2, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGooddescriptionNotBetween(String value1, String value2) {
            addCriterion("gooddescription not between", value1, value2, "gooddescription");
            return (Criteria) this;
        }

        public Criteria andGoodimageIsNull() {
            addCriterion("goodimage is null");
            return (Criteria) this;
        }

        public Criteria andGoodimageIsNotNull() {
            addCriterion("goodimage is not null");
            return (Criteria) this;
        }

        public Criteria andGoodimageEqualTo(String value) {
            addCriterion("goodimage =", value, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageNotEqualTo(String value) {
            addCriterion("goodimage <>", value, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageGreaterThan(String value) {
            addCriterion("goodimage >", value, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageGreaterThanOrEqualTo(String value) {
            addCriterion("goodimage >=", value, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageLessThan(String value) {
            addCriterion("goodimage <", value, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageLessThanOrEqualTo(String value) {
            addCriterion("goodimage <=", value, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageLike(String value) {
            addCriterion("goodimage like", value, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageNotLike(String value) {
            addCriterion("goodimage not like", value, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageIn(List<String> values) {
            addCriterion("goodimage in", values, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageNotIn(List<String> values) {
            addCriterion("goodimage not in", values, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageBetween(String value1, String value2) {
            addCriterion("goodimage between", value1, value2, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodimageNotBetween(String value1, String value2) {
            addCriterion("goodimage not between", value1, value2, "goodimage");
            return (Criteria) this;
        }

        public Criteria andGoodcountIsNull() {
            addCriterion("goodcount is null");
            return (Criteria) this;
        }

        public Criteria andGoodcountIsNotNull() {
            addCriterion("goodcount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodcountEqualTo(Integer value) {
            addCriterion("goodcount =", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountNotEqualTo(Integer value) {
            addCriterion("goodcount <>", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountGreaterThan(Integer value) {
            addCriterion("goodcount >", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodcount >=", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountLessThan(Integer value) {
            addCriterion("goodcount <", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountLessThanOrEqualTo(Integer value) {
            addCriterion("goodcount <=", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountIn(List<Integer> values) {
            addCriterion("goodcount in", values, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountNotIn(List<Integer> values) {
            addCriterion("goodcount not in", values, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountBetween(Integer value1, Integer value2) {
            addCriterion("goodcount between", value1, value2, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountNotBetween(Integer value1, Integer value2) {
            addCriterion("goodcount not between", value1, value2, "goodcount");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("createuser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createuser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("createuser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("createuser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("createuser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("createuser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("createuser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("createuser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("createuser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("createuser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("createuser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("createuser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("createuser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("createuser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("updateuser is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("updateuser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("updateuser =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("updateuser <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("updateuser >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("updateuser >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("updateuser <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("updateuser <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("updateuser like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("updateuser not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("updateuser in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("updateuser not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("updateuser between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("updateuser not between", value1, value2, "updateuser");
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