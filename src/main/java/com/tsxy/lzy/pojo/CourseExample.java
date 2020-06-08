package com.tsxy.lzy.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCouidIsNull() {
            addCriterion("CouId is null");
            return (Criteria) this;
        }

        public Criteria andCouidIsNotNull() {
            addCriterion("CouId is not null");
            return (Criteria) this;
        }

        public Criteria andCouidEqualTo(Integer value) {
            addCriterion("CouId =", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotEqualTo(Integer value) {
            addCriterion("CouId <>", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThan(Integer value) {
            addCriterion("CouId >", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CouId >=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThan(Integer value) {
            addCriterion("CouId <", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThanOrEqualTo(Integer value) {
            addCriterion("CouId <=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidIn(List<Integer> values) {
            addCriterion("CouId in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotIn(List<Integer> values) {
            addCriterion("CouId not in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidBetween(Integer value1, Integer value2) {
            addCriterion("CouId between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotBetween(Integer value1, Integer value2) {
            addCriterion("CouId not between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andCounameIsNull() {
            addCriterion("CouName is null");
            return (Criteria) this;
        }

        public Criteria andCounameIsNotNull() {
            addCriterion("CouName is not null");
            return (Criteria) this;
        }

        public Criteria andCounameEqualTo(String value) {
            addCriterion("CouName =", value, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameNotEqualTo(String value) {
            addCriterion("CouName <>", value, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameGreaterThan(String value) {
            addCriterion("CouName >", value, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameGreaterThanOrEqualTo(String value) {
            addCriterion("CouName >=", value, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameLessThan(String value) {
            addCriterion("CouName <", value, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameLessThanOrEqualTo(String value) {
            addCriterion("CouName <=", value, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameLike(String value) {
            addCriterion("CouName like", value, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameNotLike(String value) {
            addCriterion("CouName not like", value, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameIn(List<String> values) {
            addCriterion("CouName in", values, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameNotIn(List<String> values) {
            addCriterion("CouName not in", values, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameBetween(String value1, String value2) {
            addCriterion("CouName between", value1, value2, "couname");
            return (Criteria) this;
        }

        public Criteria andCounameNotBetween(String value1, String value2) {
            addCriterion("CouName not between", value1, value2, "couname");
            return (Criteria) this;
        }

        public Criteria andCoushowIsNull() {
            addCriterion("CouShow is null");
            return (Criteria) this;
        }

        public Criteria andCoushowIsNotNull() {
            addCriterion("CouShow is not null");
            return (Criteria) this;
        }

        public Criteria andCoushowEqualTo(String value) {
            addCriterion("CouShow =", value, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowNotEqualTo(String value) {
            addCriterion("CouShow <>", value, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowGreaterThan(String value) {
            addCriterion("CouShow >", value, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowGreaterThanOrEqualTo(String value) {
            addCriterion("CouShow >=", value, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowLessThan(String value) {
            addCriterion("CouShow <", value, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowLessThanOrEqualTo(String value) {
            addCriterion("CouShow <=", value, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowLike(String value) {
            addCriterion("CouShow like", value, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowNotLike(String value) {
            addCriterion("CouShow not like", value, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowIn(List<String> values) {
            addCriterion("CouShow in", values, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowNotIn(List<String> values) {
            addCriterion("CouShow not in", values, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowBetween(String value1, String value2) {
            addCriterion("CouShow between", value1, value2, "coushow");
            return (Criteria) this;
        }

        public Criteria andCoushowNotBetween(String value1, String value2) {
            addCriterion("CouShow not between", value1, value2, "coushow");
            return (Criteria) this;
        }

        public Criteria andTeaidIsNull() {
            addCriterion("TeaId is null");
            return (Criteria) this;
        }

        public Criteria andTeaidIsNotNull() {
            addCriterion("TeaId is not null");
            return (Criteria) this;
        }

        public Criteria andTeaidEqualTo(Integer value) {
            addCriterion("TeaId =", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotEqualTo(Integer value) {
            addCriterion("TeaId <>", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidGreaterThan(Integer value) {
            addCriterion("TeaId >", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TeaId >=", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLessThan(Integer value) {
            addCriterion("TeaId <", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLessThanOrEqualTo(Integer value) {
            addCriterion("TeaId <=", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidIn(List<Integer> values) {
            addCriterion("TeaId in", values, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotIn(List<Integer> values) {
            addCriterion("TeaId not in", values, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidBetween(Integer value1, Integer value2) {
            addCriterion("TeaId between", value1, value2, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotBetween(Integer value1, Integer value2) {
            addCriterion("TeaId not between", value1, value2, "teaid");
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