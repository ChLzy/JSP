package com.tsxy.lzy.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdidIsNull() {
            addCriterion("AdId is null");
            return (Criteria) this;
        }

        public Criteria andAdidIsNotNull() {
            addCriterion("AdId is not null");
            return (Criteria) this;
        }

        public Criteria andAdidEqualTo(Integer value) {
            addCriterion("AdId =", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotEqualTo(Integer value) {
            addCriterion("AdId <>", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThan(Integer value) {
            addCriterion("AdId >", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdId >=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThan(Integer value) {
            addCriterion("AdId <", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThanOrEqualTo(Integer value) {
            addCriterion("AdId <=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidIn(List<Integer> values) {
            addCriterion("AdId in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotIn(List<Integer> values) {
            addCriterion("AdId not in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidBetween(Integer value1, Integer value2) {
            addCriterion("AdId between", value1, value2, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdId not between", value1, value2, "adid");
            return (Criteria) this;
        }

        public Criteria andAdnameIsNull() {
            addCriterion("AdName is null");
            return (Criteria) this;
        }

        public Criteria andAdnameIsNotNull() {
            addCriterion("AdName is not null");
            return (Criteria) this;
        }

        public Criteria andAdnameEqualTo(String value) {
            addCriterion("AdName =", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotEqualTo(String value) {
            addCriterion("AdName <>", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThan(String value) {
            addCriterion("AdName >", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThanOrEqualTo(String value) {
            addCriterion("AdName >=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThan(String value) {
            addCriterion("AdName <", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThanOrEqualTo(String value) {
            addCriterion("AdName <=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLike(String value) {
            addCriterion("AdName like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotLike(String value) {
            addCriterion("AdName not like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameIn(List<String> values) {
            addCriterion("AdName in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotIn(List<String> values) {
            addCriterion("AdName not in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameBetween(String value1, String value2) {
            addCriterion("AdName between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotBetween(String value1, String value2) {
            addCriterion("AdName not between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andadpasswordIsNull() {
            addCriterion("adpassword is null");
            return (Criteria) this;
        }

        public Criteria andadpasswordIsNotNull() {
            addCriterion("adpassword is not null");
            return (Criteria) this;
        }

        public Criteria andadpasswordEqualTo(String value) {
            addCriterion("adpassword =", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordNotEqualTo(String value) {
            addCriterion("adpassword <>", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordGreaterThan(String value) {
            addCriterion("adpassword >", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adpassword >=", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordLessThan(String value) {
            addCriterion("adpassword <", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordLessThanOrEqualTo(String value) {
            addCriterion("adpassword <=", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordLike(String value) {
            addCriterion("adpassword like", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordNotLike(String value) {
            addCriterion("adpassword not like", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordIn(List<String> values) {
            addCriterion("adpassword in", values, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordNotIn(List<String> values) {
            addCriterion("adpassword not in", values, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordBetween(String value1, String value2) {
            addCriterion("adpassword between", value1, value2, "adpassword");
            return (Criteria) this;
        }

        public Criteria andadpasswordNotBetween(String value1, String value2) {
            addCriterion("adpassword not between", value1, value2, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNull() {
            addCriterion("AdPhone is null");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNotNull() {
            addCriterion("AdPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAdphoneEqualTo(String value) {
            addCriterion("AdPhone =", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotEqualTo(String value) {
            addCriterion("AdPhone <>", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThan(String value) {
            addCriterion("AdPhone >", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThanOrEqualTo(String value) {
            addCriterion("AdPhone >=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThan(String value) {
            addCriterion("AdPhone <", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThanOrEqualTo(String value) {
            addCriterion("AdPhone <=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLike(String value) {
            addCriterion("AdPhone like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotLike(String value) {
            addCriterion("AdPhone not like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneIn(List<String> values) {
            addCriterion("AdPhone in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotIn(List<String> values) {
            addCriterion("AdPhone not in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneBetween(String value1, String value2) {
            addCriterion("AdPhone between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotBetween(String value1, String value2) {
            addCriterion("AdPhone not between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdmailIsNull() {
            addCriterion("AdMail is null");
            return (Criteria) this;
        }

        public Criteria andAdmailIsNotNull() {
            addCriterion("AdMail is not null");
            return (Criteria) this;
        }

        public Criteria andAdmailEqualTo(String value) {
            addCriterion("AdMail =", value, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailNotEqualTo(String value) {
            addCriterion("AdMail <>", value, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailGreaterThan(String value) {
            addCriterion("AdMail >", value, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailGreaterThanOrEqualTo(String value) {
            addCriterion("AdMail >=", value, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailLessThan(String value) {
            addCriterion("AdMail <", value, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailLessThanOrEqualTo(String value) {
            addCriterion("AdMail <=", value, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailLike(String value) {
            addCriterion("AdMail like", value, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailNotLike(String value) {
            addCriterion("AdMail not like", value, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailIn(List<String> values) {
            addCriterion("AdMail in", values, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailNotIn(List<String> values) {
            addCriterion("AdMail not in", values, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailBetween(String value1, String value2) {
            addCriterion("AdMail between", value1, value2, "admail");
            return (Criteria) this;
        }

        public Criteria andAdmailNotBetween(String value1, String value2) {
            addCriterion("AdMail not between", value1, value2, "admail");
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