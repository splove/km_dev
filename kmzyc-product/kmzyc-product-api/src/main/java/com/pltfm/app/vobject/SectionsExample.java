package com.pltfm.app.vobject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SectionsExample {
	/**
	 * 当前操作用户id，用于过滤渠道
	 */
	private String userId;
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    public SectionsExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    protected SectionsExample(SectionsExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table SECTIONS
     *
     * @ibatorgenerated Fri Jul 12 16:51:15 CST 2013
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List dateList = new ArrayList();
            Iterator iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(((Date)iter.next()).getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSectionsIdIsNull() {
            addCriterion("SECTIONS_ID is null");
            return this;
        }

        public Criteria andSectionsIdIsNotNull() {
            addCriterion("SECTIONS_ID is not null");
            return this;
        }

        public Criteria andSectionsIdEqualTo(BigDecimal value) {
            addCriterion("SECTIONS_ID =", value, "sectionsId");
            return this;
        }

        public Criteria andSectionsIdNotEqualTo(BigDecimal value) {
            addCriterion("SECTIONS_ID <>", value, "sectionsId");
            return this;
        }

        public Criteria andSectionsIdGreaterThan(BigDecimal value) {
            addCriterion("SECTIONS_ID >", value, "sectionsId");
            return this;
        }

        public Criteria andSectionsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SECTIONS_ID >=", value, "sectionsId");
            return this;
        }

        public Criteria andSectionsIdLessThan(BigDecimal value) {
            addCriterion("SECTIONS_ID <", value, "sectionsId");
            return this;
        }

        public Criteria andSectionsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SECTIONS_ID <=", value, "sectionsId");
            return this;
        }

        public Criteria andSectionsIdIn(List values) {
            addCriterion("SECTIONS_ID in", values, "sectionsId");
            return this;
        }

        public Criteria andSectionsIdNotIn(List values) {
            addCriterion("SECTIONS_ID not in", values, "sectionsId");
            return this;
        }

        public Criteria andSectionsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECTIONS_ID between", value1, value2, "sectionsId");
            return this;
        }

        public Criteria andSectionsIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECTIONS_ID not between", value1, value2, "sectionsId");
            return this;
        }

        public Criteria andSectionsCodeIsNull() {
            addCriterion("SECTIONS_CODE is null");
            return this;
        }

        public Criteria andSectionsCodeIsNotNull() {
            addCriterion("SECTIONS_CODE is not null");
            return this;
        }

        public Criteria andSectionsCodeEqualTo(String value) {
            addCriterion("SECTIONS_CODE =", value, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeNotEqualTo(String value) {
            addCriterion("SECTIONS_CODE <>", value, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeGreaterThan(String value) {
            addCriterion("SECTIONS_CODE >", value, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SECTIONS_CODE >=", value, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeLessThan(String value) {
            addCriterion("SECTIONS_CODE <", value, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeLessThanOrEqualTo(String value) {
            addCriterion("SECTIONS_CODE <=", value, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeLike(String value) {
            addCriterion("SECTIONS_CODE like", value, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeNotLike(String value) {
            addCriterion("SECTIONS_CODE not like", value, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeIn(List values) {
            addCriterion("SECTIONS_CODE in", values, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeNotIn(List values) {
            addCriterion("SECTIONS_CODE not in", values, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeBetween(String value1, String value2) {
            addCriterion("SECTIONS_CODE between", value1, value2, "sectionsCode");
            return this;
        }

        public Criteria andSectionsCodeNotBetween(String value1, String value2) {
            addCriterion("SECTIONS_CODE not between", value1, value2, "sectionsCode");
            return this;
        }

        public Criteria andSectionsNameIsNull() {
            addCriterion("SECTIONS_NAME is null");
            return this;
        }

        public Criteria andSectionsNameIsNotNull() {
            addCriterion("SECTIONS_NAME is not null");
            return this;
        }

        public Criteria andSectionsNameEqualTo(String value) {
            addCriterion("SECTIONS_NAME =", value, "sectionsName");
            return this;
        }
        
        public Criteria andSectionsIdentificationEqualTo(String value) {
        	addCriterion("IDENTIFICATION =", value, "identification");
        	return this;
        }

        public Criteria andSectionsNameNotEqualTo(String value) {
            addCriterion("SECTIONS_NAME <>", value, "sectionsName");
            return this;
        }

        public Criteria andSectionsNameGreaterThan(String value) {
            addCriterion("SECTIONS_NAME >", value, "sectionsName");
            return this;
        }

        public Criteria andSectionsNameGreaterThanOrEqualTo(String value) {
            addCriterion("SECTIONS_NAME >=", value, "sectionsName");
            return this;
        }

        public Criteria andSectionsNameLessThan(String value) {
            addCriterion("SECTIONS_NAME <", value, "sectionsName");
            return this;
        }

        public Criteria andSectionsNameLessThanOrEqualTo(String value) {
            addCriterion("SECTIONS_NAME <=", value, "sectionsName");
            return this;
        }

        public Criteria andSectionsNameLike(String value) {
            addCriterion("SECTIONS_NAME like", value, "sectionsName");
            return this;
        }

        public Criteria andIdentificationLike(String value) {
        	addCriterion("IDENTIFICATION like", value, "identification");
        	return this;
        }

        public Criteria andSectionsNameNotLike(String value) {
            addCriterion("SECTIONS_NAME not like", value, "sectionsName");
            return this;
        }

        public Criteria andSectionsNameIn(List values) {
            addCriterion("SECTIONS_NAME in", values, "sectionsName");
            return this;
        }

        public Criteria andSectionsNameNotIn(List values) {
            addCriterion("SECTIONS_NAME not in", values, "sectionsName");
            return this;
        }

        public Criteria andSectionsNameBetween(String value1, String value2) {
            addCriterion("SECTIONS_NAME between", value1, value2, "sectionsName");
            return this;
        }

        public Criteria andSectionsNameNotBetween(String value1, String value2) {
            addCriterion("SECTIONS_NAME not between", value1, value2, "sectionsName");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return this;
        }
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
    
}