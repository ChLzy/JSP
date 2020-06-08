package com.tsxy.lzy.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuidIsNull() {
            addCriterion("StuId is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("StuId is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("StuId =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("StuId <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("StuId >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StuId >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("StuId <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("StuId <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("StuId in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("StuId not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("StuId between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("StuId not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("StuName is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("StuName is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("StuName =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("StuName <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("StuName >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("StuName >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("StuName <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("StuName <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("StuName like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("StuName not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("StuName in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("StuName not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("StuName between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("StuName not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStusexIsNull() {
            addCriterion("StuSex is null");
            return (Criteria) this;
        }

        public Criteria andStusexIsNotNull() {
            addCriterion("StuSex is not null");
            return (Criteria) this;
        }

        public Criteria andStusexEqualTo(String value) {
            addCriterion("StuSex =", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotEqualTo(String value) {
            addCriterion("StuSex <>", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThan(String value) {
            addCriterion("StuSex >", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThanOrEqualTo(String value) {
            addCriterion("StuSex >=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThan(String value) {
            addCriterion("StuSex <", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThanOrEqualTo(String value) {
            addCriterion("StuSex <=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLike(String value) {
            addCriterion("StuSex like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotLike(String value) {
            addCriterion("StuSex not like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexIn(List<String> values) {
            addCriterion("StuSex in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotIn(List<String> values) {
            addCriterion("StuSex not in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexBetween(String value1, String value2) {
            addCriterion("StuSex between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotBetween(String value1, String value2) {
            addCriterion("StuSex not between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStupasswordIsNull() {
            addCriterion("StuPassword is null");
            return (Criteria) this;
        }

        public Criteria andStupasswordIsNotNull() {
            addCriterion("StuPassword is not null");
            return (Criteria) this;
        }

        public Criteria andStupasswordEqualTo(String value) {
            addCriterion("StuPassword =", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordNotEqualTo(String value) {
            addCriterion("StuPassword <>", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordGreaterThan(String value) {
            addCriterion("StuPassword >", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordGreaterThanOrEqualTo(String value) {
            addCriterion("StuPassword >=", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordLessThan(String value) {
            addCriterion("StuPassword <", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordLessThanOrEqualTo(String value) {
            addCriterion("StuPassword <=", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordLike(String value) {
            addCriterion("StuPassword like", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordNotLike(String value) {
            addCriterion("StuPassword not like", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordIn(List<String> values) {
            addCriterion("StuPassword in", values, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordNotIn(List<String> values) {
            addCriterion("StuPassword not in", values, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordBetween(String value1, String value2) {
            addCriterion("StuPassword between", value1, value2, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordNotBetween(String value1, String value2) {
            addCriterion("StuPassword not between", value1, value2, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStuphotoIsNull() {
            addCriterion("StuPhoto is null");
            return (Criteria) this;
        }

        public Criteria andStuphotoIsNotNull() {
            addCriterion("StuPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andStuphotoEqualTo(String value) {
            addCriterion("StuPhoto =", value, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoNotEqualTo(String value) {
            addCriterion("StuPhoto <>", value, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoGreaterThan(String value) {
            addCriterion("StuPhoto >", value, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoGreaterThanOrEqualTo(String value) {
            addCriterion("StuPhoto >=", value, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoLessThan(String value) {
            addCriterion("StuPhoto <", value, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoLessThanOrEqualTo(String value) {
            addCriterion("StuPhoto <=", value, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoLike(String value) {
            addCriterion("StuPhoto like", value, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoNotLike(String value) {
            addCriterion("StuPhoto not like", value, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoIn(List<String> values) {
            addCriterion("StuPhoto in", values, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoNotIn(List<String> values) {
            addCriterion("StuPhoto not in", values, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoBetween(String value1, String value2) {
            addCriterion("StuPhoto between", value1, value2, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStuphotoNotBetween(String value1, String value2) {
            addCriterion("StuPhoto not between", value1, value2, "stuphoto");
            return (Criteria) this;
        }

        public Criteria andStumailIsNull() {
            addCriterion("StuMail is null");
            return (Criteria) this;
        }

        public Criteria andStumailIsNotNull() {
            addCriterion("StuMail is not null");
            return (Criteria) this;
        }

        public Criteria andStumailEqualTo(String value) {
            addCriterion("StuMail =", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailNotEqualTo(String value) {
            addCriterion("StuMail <>", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailGreaterThan(String value) {
            addCriterion("StuMail >", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailGreaterThanOrEqualTo(String value) {
            addCriterion("StuMail >=", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailLessThan(String value) {
            addCriterion("StuMail <", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailLessThanOrEqualTo(String value) {
            addCriterion("StuMail <=", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailLike(String value) {
            addCriterion("StuMail like", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailNotLike(String value) {
            addCriterion("StuMail not like", value, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailIn(List<String> values) {
            addCriterion("StuMail in", values, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailNotIn(List<String> values) {
            addCriterion("StuMail not in", values, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailBetween(String value1, String value2) {
            addCriterion("StuMail between", value1, value2, "stumail");
            return (Criteria) this;
        }

        public Criteria andStumailNotBetween(String value1, String value2) {
            addCriterion("StuMail not between", value1, value2, "stumail");
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