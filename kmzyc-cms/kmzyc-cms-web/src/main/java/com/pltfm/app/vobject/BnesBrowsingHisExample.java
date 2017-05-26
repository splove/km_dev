package com.pltfm.app.vobject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BnesBrowsingHisExample {

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    protected String orderByClause;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    protected List oredCriteria;

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    public BnesBrowsingHisExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    protected BnesBrowsingHisExample(BnesBrowsingHisExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS. This class corresponds to the database table
     * BNES_BROWSING_HIS
     *
     * @abatorgenerated Thu Oct 24 16:39:19 CST 2013
     */
    public static class Criteria {
        protected List criteriaWithoutValue;
        protected List criteriaWithSingleValue;
        protected List criteriaWithListValue;
        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                    || criteriaWithSingleValue.size() > 0
                    || criteriaWithListValue.size() > 0
                    || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value,
                                    String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property
                        + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values,
                                    String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property
                        + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1,
                                    Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property
                        + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        protected void addCriterionForJDBCDate(String condition, Date value,
                                               String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()),
                    property);
        }

        protected void addCriterionForJDBCDate(String condition, List values,
                                               String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property
                        + " cannot be null or empty");
            }
            List dateList = new ArrayList();
            Iterator iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(((Date) iter.next()).getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1,
                                               Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property
                        + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()),
                    new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBrowsingHisIdIsNull() {
            addCriterion("BROWSING_HIS_ID is null");
            return this;
        }

        public Criteria andBrowsingHisIdIsNotNull() {
            addCriterion("BROWSING_HIS_ID is not null");
            return this;
        }

        public Criteria andBrowsingHisIdEqualTo(BigDecimal value) {
            addCriterion("BROWSING_HIS_ID =", value, "browsingHisId");
            return this;
        }

        public Criteria andBrowsingHisIdNotEqualTo(BigDecimal value) {
            addCriterion("BROWSING_HIS_ID <>", value, "browsingHisId");
            return this;
        }

        public Criteria andBrowsingHisIdGreaterThan(BigDecimal value) {
            addCriterion("BROWSING_HIS_ID >", value, "browsingHisId");
            return this;
        }

        public Criteria andBrowsingHisIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BROWSING_HIS_ID >=", value, "browsingHisId");
            return this;
        }

        public Criteria andBrowsingHisIdLessThan(BigDecimal value) {
            addCriterion("BROWSING_HIS_ID <", value, "browsingHisId");
            return this;
        }

        public Criteria andBrowsingHisIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BROWSING_HIS_ID <=", value, "browsingHisId");
            return this;
        }

        public Criteria andBrowsingHisIdIn(List values) {
            addCriterion("BROWSING_HIS_ID in", values, "browsingHisId");
            return this;
        }

        public Criteria andBrowsingHisIdNotIn(List values) {
            addCriterion("BROWSING_HIS_ID not in", values, "browsingHisId");
            return this;
        }

        public Criteria andBrowsingHisIdBetween(BigDecimal value1,
                                                BigDecimal value2) {
            addCriterion("BROWSING_HIS_ID between", value1, value2,
                    "browsingHisId");
            return this;
        }

        public Criteria andBrowsingHisIdNotBetween(BigDecimal value1,
                                                   BigDecimal value2) {
            addCriterion("BROWSING_HIS_ID not between", value1, value2,
                    "browsingHisId");
            return this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("LOGIN_ID is null");
            return this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("LOGIN_ID is not null");
            return this;
        }

        public Criteria andLoginIdEqualTo(BigDecimal value) {
            addCriterion("LOGIN_ID =", value, "loginId");
            return this;
        }

        public Criteria andLoginIdNotEqualTo(BigDecimal value) {
            addCriterion("LOGIN_ID <>", value, "loginId");
            return this;
        }

        public Criteria andLoginIdGreaterThan(BigDecimal value) {
            addCriterion("LOGIN_ID >", value, "loginId");
            return this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGIN_ID >=", value, "loginId");
            return this;
        }

        public Criteria andLoginIdLessThan(BigDecimal value) {
            addCriterion("LOGIN_ID <", value, "loginId");
            return this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGIN_ID <=", value, "loginId");
            return this;
        }

        public Criteria andLoginIdIn(List values) {
            addCriterion("LOGIN_ID in", values, "loginId");
            return this;
        }

        public Criteria andLoginIdNotIn(List values) {
            addCriterion("LOGIN_ID not in", values, "loginId");
            return this;
        }

        public Criteria andLoginIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGIN_ID between", value1, value2, "loginId");
            return this;
        }

        public Criteria andLoginIdNotBetween(BigDecimal value1,
                                             BigDecimal value2) {
            addCriterion("LOGIN_ID not between", value1, value2, "loginId");
            return this;
        }

        public Criteria andContentCodeIsNull() {
            addCriterion("CONTENT_CODE is null");
            return this;
        }

        public Criteria andContentCodeIsNotNull() {
            addCriterion("CONTENT_CODE is not null");
            return this;
        }

        public Criteria andContentCodeEqualTo(String value) {
            addCriterion("CONTENT_CODE =", value, "contentCode");
            return this;
        }

        public Criteria andContentCodeNotEqualTo(String value) {
            addCriterion("CONTENT_CODE <>", value, "contentCode");
            return this;
        }

        public Criteria andContentCodeGreaterThan(String value) {
            addCriterion("CONTENT_CODE >", value, "contentCode");
            return this;
        }

        public Criteria andContentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_CODE >=", value, "contentCode");
            return this;
        }

        public Criteria andContentCodeLessThan(String value) {
            addCriterion("CONTENT_CODE <", value, "contentCode");
            return this;
        }

        public Criteria andContentCodeLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_CODE <=", value, "contentCode");
            return this;
        }

        public Criteria andContentCodeLike(String value) {
            addCriterion("CONTENT_CODE like", value, "contentCode");
            return this;
        }

        public Criteria andContentCodeNotLike(String value) {
            addCriterion("CONTENT_CODE not like", value, "contentCode");
            return this;
        }

        public Criteria andContentCodeIn(List values) {
            addCriterion("CONTENT_CODE in", values, "contentCode");
            return this;
        }

        public Criteria andContentCodeNotIn(List values) {
            addCriterion("CONTENT_CODE not in", values, "contentCode");
            return this;
        }

        public Criteria andContentCodeBetween(String value1, String value2) {
            addCriterion("CONTENT_CODE between", value1, value2, "contentCode");
            return this;
        }

        public Criteria andContentCodeNotBetween(String value1, String value2) {
            addCriterion("CONTENT_CODE not between", value1, value2,
                    "contentCode");
            return this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2,
                    "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2,
                    "createDate");
            return this;
        }

        public Criteria andBrowsingTypeIsNull() {
            addCriterion("BROWSING_TYPE is null");
            return this;
        }

        public Criteria andBrowsingTypeIsNotNull() {
            addCriterion("BROWSING_TYPE is not null");
            return this;
        }

        public Criteria andBrowsingTypeEqualTo(Short value) {
            addCriterion("BROWSING_TYPE =", value, "browsingType");
            return this;
        }

        public Criteria andBrowsingTypeNotEqualTo(Short value) {
            addCriterion("BROWSING_TYPE <>", value, "browsingType");
            return this;
        }

        public Criteria andBrowsingTypeGreaterThan(Short value) {
            addCriterion("BROWSING_TYPE >", value, "browsingType");
            return this;
        }

        public Criteria andBrowsingTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("BROWSING_TYPE >=", value, "browsingType");
            return this;
        }

        public Criteria andBrowsingTypeLessThan(Short value) {
            addCriterion("BROWSING_TYPE <", value, "browsingType");
            return this;
        }

        public Criteria andBrowsingTypeLessThanOrEqualTo(Short value) {
            addCriterion("BROWSING_TYPE <=", value, "browsingType");
            return this;
        }

        public Criteria andBrowsingTypeIn(List values) {
            addCriterion("BROWSING_TYPE in", values, "browsingType");
            return this;
        }

        public Criteria andBrowsingTypeNotIn(List values) {
            addCriterion("BROWSING_TYPE not in", values, "browsingType");
            return this;
        }

        public Criteria andBrowsingTypeBetween(Short value1, Short value2) {
            addCriterion("BROWSING_TYPE between", value1, value2,
                    "browsingType");
            return this;
        }

        public Criteria andBrowsingTypeNotBetween(Short value1, Short value2) {
            addCriterion("BROWSING_TYPE not between", value1, value2,
                    "browsingType");
            return this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateIn(List values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotIn(List values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2,
                    "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2,
                    "updateDate");
            return this;
        }
    }
}