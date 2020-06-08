package com.tsxy.lzy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TvExample() {
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

        public Criteria andTvidIsNull() {
            addCriterion("Tvid is null");
            return (Criteria) this;
        }

        public Criteria andTvidIsNotNull() {
            addCriterion("Tvid is not null");
            return (Criteria) this;
        }

        public Criteria andTvidEqualTo(Integer value) {
            addCriterion("Tvid =", value, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvidNotEqualTo(Integer value) {
            addCriterion("Tvid <>", value, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvidGreaterThan(Integer value) {
            addCriterion("Tvid >", value, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Tvid >=", value, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvidLessThan(Integer value) {
            addCriterion("Tvid <", value, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvidLessThanOrEqualTo(Integer value) {
            addCriterion("Tvid <=", value, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvidIn(List<Integer> values) {
            addCriterion("Tvid in", values, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvidNotIn(List<Integer> values) {
            addCriterion("Tvid not in", values, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvidBetween(Integer value1, Integer value2) {
            addCriterion("Tvid between", value1, value2, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvidNotBetween(Integer value1, Integer value2) {
            addCriterion("Tvid not between", value1, value2, "tvid");
            return (Criteria) this;
        }

        public Criteria andTvsrcIsNull() {
            addCriterion("TvSrc is null");
            return (Criteria) this;
        }

        public Criteria andTvsrcIsNotNull() {
            addCriterion("TvSrc is not null");
            return (Criteria) this;
        }

        public Criteria andTvsrcEqualTo(String value) {
            addCriterion("TvSrc =", value, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcNotEqualTo(String value) {
            addCriterion("TvSrc <>", value, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcGreaterThan(String value) {
            addCriterion("TvSrc >", value, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcGreaterThanOrEqualTo(String value) {
            addCriterion("TvSrc >=", value, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcLessThan(String value) {
            addCriterion("TvSrc <", value, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcLessThanOrEqualTo(String value) {
            addCriterion("TvSrc <=", value, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcLike(String value) {
            addCriterion("TvSrc like", value, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcNotLike(String value) {
            addCriterion("TvSrc not like", value, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcIn(List<String> values) {
            addCriterion("TvSrc in", values, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcNotIn(List<String> values) {
            addCriterion("TvSrc not in", values, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcBetween(String value1, String value2) {
            addCriterion("TvSrc between", value1, value2, "tvsrc");
            return (Criteria) this;
        }

        public Criteria andTvsrcNotBetween(String value1, String value2) {
            addCriterion("TvSrc not between", value1, value2, "tvsrc");
            return (Criteria) this;
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