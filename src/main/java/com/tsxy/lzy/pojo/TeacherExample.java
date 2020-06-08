package com.tsxy.lzy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeanameIsNull() {
            addCriterion("TeaName is null");
            return (Criteria) this;
        }

        public Criteria andTeanameIsNotNull() {
            addCriterion("TeaName is not null");
            return (Criteria) this;
        }

        public Criteria andTeanameEqualTo(String value) {
            addCriterion("TeaName =", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotEqualTo(String value) {
            addCriterion("TeaName <>", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThan(String value) {
            addCriterion("TeaName >", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThanOrEqualTo(String value) {
            addCriterion("TeaName >=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThan(String value) {
            addCriterion("TeaName <", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThanOrEqualTo(String value) {
            addCriterion("TeaName <=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLike(String value) {
            addCriterion("TeaName like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotLike(String value) {
            addCriterion("TeaName not like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameIn(List<String> values) {
            addCriterion("TeaName in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotIn(List<String> values) {
            addCriterion("TeaName not in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameBetween(String value1, String value2) {
            addCriterion("TeaName between", value1, value2, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotBetween(String value1, String value2) {
            addCriterion("TeaName not between", value1, value2, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeasexIsNull() {
            addCriterion("TeaSex is null");
            return (Criteria) this;
        }

        public Criteria andTeasexIsNotNull() {
            addCriterion("TeaSex is not null");
            return (Criteria) this;
        }

        public Criteria andTeasexEqualTo(String value) {
            addCriterion("TeaSex =", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexNotEqualTo(String value) {
            addCriterion("TeaSex <>", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexGreaterThan(String value) {
            addCriterion("TeaSex >", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexGreaterThanOrEqualTo(String value) {
            addCriterion("TeaSex >=", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexLessThan(String value) {
            addCriterion("TeaSex <", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexLessThanOrEqualTo(String value) {
            addCriterion("TeaSex <=", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexLike(String value) {
            addCriterion("TeaSex like", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexNotLike(String value) {
            addCriterion("TeaSex not like", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexIn(List<String> values) {
            addCriterion("TeaSex in", values, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexNotIn(List<String> values) {
            addCriterion("TeaSex not in", values, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexBetween(String value1, String value2) {
            addCriterion("TeaSex between", value1, value2, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexNotBetween(String value1, String value2) {
            addCriterion("TeaSex not between", value1, value2, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeapasswordIsNull() {
            addCriterion("TeaPassword is null");
            return (Criteria) this;
        }

        public Criteria andTeapasswordIsNotNull() {
            addCriterion("TeaPassword is not null");
            return (Criteria) this;
        }

        public Criteria andTeapasswordEqualTo(String value) {
            addCriterion("TeaPassword =", value, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordNotEqualTo(String value) {
            addCriterion("TeaPassword <>", value, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordGreaterThan(String value) {
            addCriterion("TeaPassword >", value, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordGreaterThanOrEqualTo(String value) {
            addCriterion("TeaPassword >=", value, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordLessThan(String value) {
            addCriterion("TeaPassword <", value, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordLessThanOrEqualTo(String value) {
            addCriterion("TeaPassword <=", value, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordLike(String value) {
            addCriterion("TeaPassword like", value, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordNotLike(String value) {
            addCriterion("TeaPassword not like", value, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordIn(List<String> values) {
            addCriterion("TeaPassword in", values, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordNotIn(List<String> values) {
            addCriterion("TeaPassword not in", values, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordBetween(String value1, String value2) {
            addCriterion("TeaPassword between", value1, value2, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeapasswordNotBetween(String value1, String value2) {
            addCriterion("TeaPassword not between", value1, value2, "teapassword");
            return (Criteria) this;
        }

        public Criteria andTeasubjectIsNull() {
            addCriterion("TeaSubject is null");
            return (Criteria) this;
        }

        public Criteria andTeasubjectIsNotNull() {
            addCriterion("TeaSubject is not null");
            return (Criteria) this;
        }

        public Criteria andTeasubjectEqualTo(String value) {
            addCriterion("TeaSubject =", value, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectNotEqualTo(String value) {
            addCriterion("TeaSubject <>", value, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectGreaterThan(String value) {
            addCriterion("TeaSubject >", value, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectGreaterThanOrEqualTo(String value) {
            addCriterion("TeaSubject >=", value, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectLessThan(String value) {
            addCriterion("TeaSubject <", value, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectLessThanOrEqualTo(String value) {
            addCriterion("TeaSubject <=", value, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectLike(String value) {
            addCriterion("TeaSubject like", value, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectNotLike(String value) {
            addCriterion("TeaSubject not like", value, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectIn(List<String> values) {
            addCriterion("TeaSubject in", values, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectNotIn(List<String> values) {
            addCriterion("TeaSubject not in", values, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectBetween(String value1, String value2) {
            addCriterion("TeaSubject between", value1, value2, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeasubjectNotBetween(String value1, String value2) {
            addCriterion("TeaSubject not between", value1, value2, "teasubject");
            return (Criteria) this;
        }

        public Criteria andTeamailIsNull() {
            addCriterion("TeaMail is null");
            return (Criteria) this;
        }

        public Criteria andTeamailIsNotNull() {
            addCriterion("TeaMail is not null");
            return (Criteria) this;
        }

        public Criteria andTeamailEqualTo(String value) {
            addCriterion("TeaMail =", value, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailNotEqualTo(String value) {
            addCriterion("TeaMail <>", value, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailGreaterThan(String value) {
            addCriterion("TeaMail >", value, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailGreaterThanOrEqualTo(String value) {
            addCriterion("TeaMail >=", value, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailLessThan(String value) {
            addCriterion("TeaMail <", value, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailLessThanOrEqualTo(String value) {
            addCriterion("TeaMail <=", value, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailLike(String value) {
            addCriterion("TeaMail like", value, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailNotLike(String value) {
            addCriterion("TeaMail not like", value, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailIn(List<String> values) {
            addCriterion("TeaMail in", values, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailNotIn(List<String> values) {
            addCriterion("TeaMail not in", values, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailBetween(String value1, String value2) {
            addCriterion("TeaMail between", value1, value2, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeamailNotBetween(String value1, String value2) {
            addCriterion("TeaMail not between", value1, value2, "teamail");
            return (Criteria) this;
        }

        public Criteria andTeaphotoIsNull() {
            addCriterion("TeaPhoto is null");
            return (Criteria) this;
        }

        public Criteria andTeaphotoIsNotNull() {
            addCriterion("TeaPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andTeaphotoEqualTo(String value) {
            addCriterion("TeaPhoto =", value, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoNotEqualTo(String value) {
            addCriterion("TeaPhoto <>", value, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoGreaterThan(String value) {
            addCriterion("TeaPhoto >", value, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoGreaterThanOrEqualTo(String value) {
            addCriterion("TeaPhoto >=", value, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoLessThan(String value) {
            addCriterion("TeaPhoto <", value, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoLessThanOrEqualTo(String value) {
            addCriterion("TeaPhoto <=", value, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoLike(String value) {
            addCriterion("TeaPhoto like", value, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoNotLike(String value) {
            addCriterion("TeaPhoto not like", value, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoIn(List<String> values) {
            addCriterion("TeaPhoto in", values, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoNotIn(List<String> values) {
            addCriterion("TeaPhoto not in", values, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoBetween(String value1, String value2) {
            addCriterion("TeaPhoto between", value1, value2, "teaphoto");
            return (Criteria) this;
        }

        public Criteria andTeaphotoNotBetween(String value1, String value2) {
            addCriterion("TeaPhoto not between", value1, value2, "teaphoto");
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