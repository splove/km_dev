package com.pltfm.app.vobject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewProductDetailInfoExample implements Serializable {
    private static final long serialVersionUID = 7852282023885387387L;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    protected List oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    public ViewProductDetailInfoExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    protected ViewProductDetailInfoExample(ViewProductDetailInfoExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table VIEW_PRODUCT_DETAIL_INFO
     *
     * @abatorgenerated Mon Sep 23 11:19:42 CST 2013
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return this;
        }

        public Criteria andProductIdIn(List values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return this;
        }

        public Criteria andProductIdNotIn(List values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return this;
        }

        public Criteria andProcuctNameIsNull() {
            addCriterion("PROCUCT_NAME is null");
            return this;
        }

        public Criteria andProcuctNameIsNotNull() {
            addCriterion("PROCUCT_NAME is not null");
            return this;
        }

        public Criteria andProcuctNameEqualTo(String value) {
            addCriterion("PROCUCT_NAME =", value, "procuctName");
            return this;
        }

        public Criteria andProcuctNameNotEqualTo(String value) {
            addCriterion("PROCUCT_NAME <>", value, "procuctName");
            return this;
        }

        public Criteria andProcuctNameGreaterThan(String value) {
            addCriterion("PROCUCT_NAME >", value, "procuctName");
            return this;
        }

        public Criteria andProcuctNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROCUCT_NAME >=", value, "procuctName");
            return this;
        }

        public Criteria andProcuctNameLessThan(String value) {
            addCriterion("PROCUCT_NAME <", value, "procuctName");
            return this;
        }

        public Criteria andProcuctNameLessThanOrEqualTo(String value) {
            addCriterion("PROCUCT_NAME <=", value, "procuctName");
            return this;
        }

        public Criteria andProcuctNameLike(String value) {
            addCriterion("PROCUCT_NAME like", value, "procuctName");
            return this;
        }

        public Criteria andProcuctNameNotLike(String value) {
            addCriterion("PROCUCT_NAME not like", value, "procuctName");
            return this;
        }

        public Criteria andProcuctNameIn(List values) {
            addCriterion("PROCUCT_NAME in", values, "procuctName");
            return this;
        }

        public Criteria andProcuctNameNotIn(List values) {
            addCriterion("PROCUCT_NAME not in", values, "procuctName");
            return this;
        }

        public Criteria andProcuctNameBetween(String value1, String value2) {
            addCriterion("PROCUCT_NAME between", value1, value2, "procuctName");
            return this;
        }

        public Criteria andProcuctNameNotBetween(String value1, String value2) {
            addCriterion("PROCUCT_NAME not between", value1, value2, "procuctName");
            return this;
        }

        public Criteria andCategoryName1IsNull() {
            addCriterion("CATEGORY_NAME1 is null");
            return this;
        }

        public Criteria andCategoryName1IsNotNull() {
            addCriterion("CATEGORY_NAME1 is not null");
            return this;
        }

        public Criteria andCategoryName1EqualTo(String value) {
            addCriterion("CATEGORY_NAME1 =", value, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1NotEqualTo(String value) {
            addCriterion("CATEGORY_NAME1 <>", value, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1GreaterThan(String value) {
            addCriterion("CATEGORY_NAME1 >", value, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1GreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME1 >=", value, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1LessThan(String value) {
            addCriterion("CATEGORY_NAME1 <", value, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1LessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME1 <=", value, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1Like(String value) {
            addCriterion("CATEGORY_NAME1 like", value, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1NotLike(String value) {
            addCriterion("CATEGORY_NAME1 not like", value, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1In(List values) {
            addCriterion("CATEGORY_NAME1 in", values, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1NotIn(List values) {
            addCriterion("CATEGORY_NAME1 not in", values, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1Between(String value1, String value2) {
            addCriterion("CATEGORY_NAME1 between", value1, value2, "categoryName1");
            return this;
        }

        public Criteria andCategoryName1NotBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME1 not between", value1, value2, "categoryName1");
            return this;
        }

        public Criteria andCategoryName2IsNull() {
            addCriterion("CATEGORY_NAME2 is null");
            return this;
        }

        public Criteria andCategoryName2IsNotNull() {
            addCriterion("CATEGORY_NAME2 is not null");
            return this;
        }

        public Criteria andCategoryName2EqualTo(String value) {
            addCriterion("CATEGORY_NAME2 =", value, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2NotEqualTo(String value) {
            addCriterion("CATEGORY_NAME2 <>", value, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2GreaterThan(String value) {
            addCriterion("CATEGORY_NAME2 >", value, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2GreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME2 >=", value, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2LessThan(String value) {
            addCriterion("CATEGORY_NAME2 <", value, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2LessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME2 <=", value, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2Like(String value) {
            addCriterion("CATEGORY_NAME2 like", value, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2NotLike(String value) {
            addCriterion("CATEGORY_NAME2 not like", value, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2In(List values) {
            addCriterion("CATEGORY_NAME2 in", values, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2NotIn(List values) {
            addCriterion("CATEGORY_NAME2 not in", values, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2Between(String value1, String value2) {
            addCriterion("CATEGORY_NAME2 between", value1, value2, "categoryName2");
            return this;
        }

        public Criteria andCategoryName2NotBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME2 not between", value1, value2, "categoryName2");
            return this;
        }

        public Criteria andCategoryName3IsNull() {
            addCriterion("CATEGORY_NAME3 is null");
            return this;
        }

        public Criteria andCategoryName3IsNotNull() {
            addCriterion("CATEGORY_NAME3 is not null");
            return this;
        }

        public Criteria andCategoryName3EqualTo(String value) {
            addCriterion("CATEGORY_NAME3 =", value, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3NotEqualTo(String value) {
            addCriterion("CATEGORY_NAME3 <>", value, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3GreaterThan(String value) {
            addCriterion("CATEGORY_NAME3 >", value, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3GreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME3 >=", value, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3LessThan(String value) {
            addCriterion("CATEGORY_NAME3 <", value, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3LessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME3 <=", value, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3Like(String value) {
            addCriterion("CATEGORY_NAME3 like", value, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3NotLike(String value) {
            addCriterion("CATEGORY_NAME3 not like", value, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3In(List values) {
            addCriterion("CATEGORY_NAME3 in", values, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3NotIn(List values) {
            addCriterion("CATEGORY_NAME3 not in", values, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3Between(String value1, String value2) {
            addCriterion("CATEGORY_NAME3 between", value1, value2, "categoryName3");
            return this;
        }

        public Criteria andCategoryName3NotBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME3 not between", value1, value2, "categoryName3");
            return this;
        }

        public Criteria andProductSkuIdIsNull() {
            addCriterion("PRODUCT_SKU_ID is null");
            return this;
        }

        public Criteria andProductSkuIdIsNotNull() {
            addCriterion("PRODUCT_SKU_ID is not null");
            return this;
        }

        public Criteria andProductSkuIdEqualTo(Integer value) {
            addCriterion("PRODUCT_SKU_ID =", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_SKU_ID <>", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_SKU_ID >", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_SKU_ID >=", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdLessThan(Integer value) {
            addCriterion("PRODUCT_SKU_ID <", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_SKU_ID <=", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdIn(List values) {
            addCriterion("PRODUCT_SKU_ID in", values, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdNotIn(List values) {
            addCriterion("PRODUCT_SKU_ID not in", values, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_SKU_ID between", value1, value2, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_SKU_ID not between", value1, value2, "productSkuId");
            return this;
        }

        public Criteria andProductSkuCodeIsNull() {
            addCriterion("PRODUCT_SKU_CODE is null");
            return this;
        }

        public Criteria andProductSkuCodeIsNotNull() {
            addCriterion("PRODUCT_SKU_CODE is not null");
            return this;
        }

        public Criteria andProductSkuCodeEqualTo(String value) {
            addCriterion("PRODUCT_SKU_CODE =", value, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_SKU_CODE <>", value, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeGreaterThan(String value) {
            addCriterion("PRODUCT_SKU_CODE >", value, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SKU_CODE >=", value, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeLessThan(String value) {
            addCriterion("PRODUCT_SKU_CODE <", value, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SKU_CODE <=", value, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeLike(String value) {
            addCriterion("PRODUCT_SKU_CODE like", value, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeNotLike(String value) {
            addCriterion("PRODUCT_SKU_CODE not like", value, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeIn(List values) {
            addCriterion("PRODUCT_SKU_CODE in", values, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeNotIn(List values) {
            addCriterion("PRODUCT_SKU_CODE not in", values, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_SKU_CODE between", value1, value2, "productSkuCode");
            return this;
        }

        public Criteria andProductSkuCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SKU_CODE not between", value1, value2, "productSkuCode");
            return this;
        }

        public Criteria andProductAttrNameIsNull() {
            addCriterion("PRODUCT_ATTR_NAME is null");
            return this;
        }

        public Criteria andProductAttrNameIsNotNull() {
            addCriterion("PRODUCT_ATTR_NAME is not null");
            return this;
        }

        public Criteria andProductAttrNameEqualTo(String value) {
            addCriterion("PRODUCT_ATTR_NAME =", value, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameNotEqualTo(String value) {
            addCriterion("PRODUCT_ATTR_NAME <>", value, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameGreaterThan(String value) {
            addCriterion("PRODUCT_ATTR_NAME >", value, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ATTR_NAME >=", value, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameLessThan(String value) {
            addCriterion("PRODUCT_ATTR_NAME <", value, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ATTR_NAME <=", value, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameLike(String value) {
            addCriterion("PRODUCT_ATTR_NAME like", value, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameNotLike(String value) {
            addCriterion("PRODUCT_ATTR_NAME not like", value, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameIn(List values) {
            addCriterion("PRODUCT_ATTR_NAME in", values, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameNotIn(List values) {
            addCriterion("PRODUCT_ATTR_NAME not in", values, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_ATTR_NAME between", value1, value2, "productAttrName");
            return this;
        }

        public Criteria andProductAttrNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ATTR_NAME not between", value1, value2, "productAttrName");
            return this;
        }

        public Criteria andProductAttrValueIsNull() {
            addCriterion("PRODUCT_ATTR_VALUE is null");
            return this;
        }

        public Criteria andProductAttrValueIsNotNull() {
            addCriterion("PRODUCT_ATTR_VALUE is not null");
            return this;
        }

        public Criteria andProductAttrValueEqualTo(String value) {
            addCriterion("PRODUCT_ATTR_VALUE =", value, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueNotEqualTo(String value) {
            addCriterion("PRODUCT_ATTR_VALUE <>", value, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueGreaterThan(String value) {
            addCriterion("PRODUCT_ATTR_VALUE >", value, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ATTR_VALUE >=", value, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueLessThan(String value) {
            addCriterion("PRODUCT_ATTR_VALUE <", value, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ATTR_VALUE <=", value, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueLike(String value) {
            addCriterion("PRODUCT_ATTR_VALUE like", value, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueNotLike(String value) {
            addCriterion("PRODUCT_ATTR_VALUE not like", value, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueIn(List values) {
            addCriterion("PRODUCT_ATTR_VALUE in", values, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueNotIn(List values) {
            addCriterion("PRODUCT_ATTR_VALUE not in", values, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueBetween(String value1, String value2) {
            addCriterion("PRODUCT_ATTR_VALUE between", value1, value2, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrValueNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ATTR_VALUE not between", value1, value2, "productAttrValue");
            return this;
        }

        public Criteria andProductAttrTypeIsNull() {
            addCriterion("PRODUCT_ATTR_TYPE is null");
            return this;
        }

        public Criteria andProductAttrTypeIsNotNull() {
            addCriterion("PRODUCT_ATTR_TYPE is not null");
            return this;
        }

        public Criteria andProductAttrTypeEqualTo(Short value) {
            addCriterion("PRODUCT_ATTR_TYPE =", value, "productAttrType");
            return this;
        }

        public Criteria andProductAttrTypeNotEqualTo(Short value) {
            addCriterion("PRODUCT_ATTR_TYPE <>", value, "productAttrType");
            return this;
        }

        public Criteria andProductAttrTypeGreaterThan(Short value) {
            addCriterion("PRODUCT_ATTR_TYPE >", value, "productAttrType");
            return this;
        }

        public Criteria andProductAttrTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PRODUCT_ATTR_TYPE >=", value, "productAttrType");
            return this;
        }

        public Criteria andProductAttrTypeLessThan(Short value) {
            addCriterion("PRODUCT_ATTR_TYPE <", value, "productAttrType");
            return this;
        }

        public Criteria andProductAttrTypeLessThanOrEqualTo(Short value) {
            addCriterion("PRODUCT_ATTR_TYPE <=", value, "productAttrType");
            return this;
        }

        public Criteria andProductAttrTypeIn(List values) {
            addCriterion("PRODUCT_ATTR_TYPE in", values, "productAttrType");
            return this;
        }

        public Criteria andProductAttrTypeNotIn(List values) {
            addCriterion("PRODUCT_ATTR_TYPE not in", values, "productAttrType");
            return this;
        }

        public Criteria andProductAttrTypeBetween(Short value1, Short value2) {
            addCriterion("PRODUCT_ATTR_TYPE between", value1, value2, "productAttrType");
            return this;
        }

        public Criteria andProductAttrTypeNotBetween(Short value1, Short value2) {
            addCriterion("PRODUCT_ATTR_TYPE not between", value1, value2, "productAttrType");
            return this;
        }

        public Criteria andRelateAttrIdIsNull() {
            addCriterion("RELATE_ATTR_ID is null");
            return this;
        }

        public Criteria andRelateAttrIdIsNotNull() {
            addCriterion("RELATE_ATTR_ID is not null");
            return this;
        }

        public Criteria andRelateAttrIdEqualTo(Integer value) {
            addCriterion("RELATE_ATTR_ID =", value, "relateAttrId");
            return this;
        }

        public Criteria andRelateAttrIdNotEqualTo(Integer value) {
            addCriterion("RELATE_ATTR_ID <>", value, "relateAttrId");
            return this;
        }

        public Criteria andRelateAttrIdGreaterThan(Integer value) {
            addCriterion("RELATE_ATTR_ID >", value, "relateAttrId");
            return this;
        }

        public Criteria andRelateAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RELATE_ATTR_ID >=", value, "relateAttrId");
            return this;
        }

        public Criteria andRelateAttrIdLessThan(Integer value) {
            addCriterion("RELATE_ATTR_ID <", value, "relateAttrId");
            return this;
        }

        public Criteria andRelateAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("RELATE_ATTR_ID <=", value, "relateAttrId");
            return this;
        }

        public Criteria andRelateAttrIdIn(List values) {
            addCriterion("RELATE_ATTR_ID in", values, "relateAttrId");
            return this;
        }

        public Criteria andRelateAttrIdNotIn(List values) {
            addCriterion("RELATE_ATTR_ID not in", values, "relateAttrId");
            return this;
        }

        public Criteria andRelateAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("RELATE_ATTR_ID between", value1, value2, "relateAttrId");
            return this;
        }

        public Criteria andRelateAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RELATE_ATTR_ID not between", value1, value2, "relateAttrId");
            return this;
        }

        public Criteria andIsReqIsNull() {
            addCriterion("IS_REQ is null");
            return this;
        }

        public Criteria andIsReqIsNotNull() {
            addCriterion("IS_REQ is not null");
            return this;
        }

        public Criteria andIsReqEqualTo(Integer value) {
            addCriterion("IS_REQ =", value, "isReq");
            return this;
        }

        public Criteria andIsReqNotEqualTo(Integer value) {
            addCriterion("IS_REQ <>", value, "isReq");
            return this;
        }

        public Criteria andIsReqGreaterThan(Integer value) {
            addCriterion("IS_REQ >", value, "isReq");
            return this;
        }

        public Criteria andIsReqGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_REQ >=", value, "isReq");
            return this;
        }

        public Criteria andIsReqLessThan(Integer value) {
            addCriterion("IS_REQ <", value, "isReq");
            return this;
        }

        public Criteria andIsReqLessThanOrEqualTo(Integer value) {
            addCriterion("IS_REQ <=", value, "isReq");
            return this;
        }

        public Criteria andIsReqIn(List values) {
            addCriterion("IS_REQ in", values, "isReq");
            return this;
        }

        public Criteria andIsReqNotIn(List values) {
            addCriterion("IS_REQ not in", values, "isReq");
            return this;
        }

        public Criteria andIsReqBetween(Integer value1, Integer value2) {
            addCriterion("IS_REQ between", value1, value2, "isReq");
            return this;
        }

        public Criteria andIsReqNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_REQ not between", value1, value2, "isReq");
            return this;
        }

        public Criteria andIsNavIsNull() {
            addCriterion("IS_NAV is null");
            return this;
        }

        public Criteria andIsNavIsNotNull() {
            addCriterion("IS_NAV is not null");
            return this;
        }

        public Criteria andIsNavEqualTo(Integer value) {
            addCriterion("IS_NAV =", value, "isNav");
            return this;
        }

        public Criteria andIsNavNotEqualTo(Integer value) {
            addCriterion("IS_NAV <>", value, "isNav");
            return this;
        }

        public Criteria andIsNavGreaterThan(Integer value) {
            addCriterion("IS_NAV >", value, "isNav");
            return this;
        }

        public Criteria andIsNavGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_NAV >=", value, "isNav");
            return this;
        }

        public Criteria andIsNavLessThan(Integer value) {
            addCriterion("IS_NAV <", value, "isNav");
            return this;
        }

        public Criteria andIsNavLessThanOrEqualTo(Integer value) {
            addCriterion("IS_NAV <=", value, "isNav");
            return this;
        }

        public Criteria andIsNavIn(List values) {
            addCriterion("IS_NAV in", values, "isNav");
            return this;
        }

        public Criteria andIsNavNotIn(List values) {
            addCriterion("IS_NAV not in", values, "isNav");
            return this;
        }

        public Criteria andIsNavBetween(Integer value1, Integer value2) {
            addCriterion("IS_NAV between", value1, value2, "isNav");
            return this;
        }

        public Criteria andIsNavNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_NAV not between", value1, value2, "isNav");
            return this;
        }

        public Criteria andIsSkuIsNull() {
            addCriterion("IS_SKU is null");
            return this;
        }

        public Criteria andIsSkuIsNotNull() {
            addCriterion("IS_SKU is not null");
            return this;
        }

        public Criteria andIsSkuEqualTo(Integer value) {
            addCriterion("IS_SKU =", value, "isSku");
            return this;
        }

        public Criteria andIsSkuNotEqualTo(Integer value) {
            addCriterion("IS_SKU <>", value, "isSku");
            return this;
        }

        public Criteria andIsSkuGreaterThan(Integer value) {
            addCriterion("IS_SKU >", value, "isSku");
            return this;
        }

        public Criteria andIsSkuGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_SKU >=", value, "isSku");
            return this;
        }

        public Criteria andIsSkuLessThan(Integer value) {
            addCriterion("IS_SKU <", value, "isSku");
            return this;
        }

        public Criteria andIsSkuLessThanOrEqualTo(Integer value) {
            addCriterion("IS_SKU <=", value, "isSku");
            return this;
        }

        public Criteria andIsSkuIn(List values) {
            addCriterion("IS_SKU in", values, "isSku");
            return this;
        }

        public Criteria andIsSkuNotIn(List values) {
            addCriterion("IS_SKU not in", values, "isSku");
            return this;
        }

        public Criteria andIsSkuBetween(Integer value1, Integer value2) {
            addCriterion("IS_SKU between", value1, value2, "isSku");
            return this;
        }

        public Criteria andIsSkuNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_SKU not between", value1, value2, "isSku");
            return this;
        }

        public Criteria andSortnoIsNull() {
            addCriterion("SORTNO is null");
            return this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("SORTNO is not null");
            return this;
        }

        public Criteria andSortnoEqualTo(Integer value) {
            addCriterion("SORTNO =", value, "sortno");
            return this;
        }

        public Criteria andSortnoNotEqualTo(Integer value) {
            addCriterion("SORTNO <>", value, "sortno");
            return this;
        }

        public Criteria andSortnoGreaterThan(Integer value) {
            addCriterion("SORTNO >", value, "sortno");
            return this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORTNO >=", value, "sortno");
            return this;
        }

        public Criteria andSortnoLessThan(Integer value) {
            addCriterion("SORTNO <", value, "sortno");
            return this;
        }

        public Criteria andSortnoLessThanOrEqualTo(Integer value) {
            addCriterion("SORTNO <=", value, "sortno");
            return this;
        }

        public Criteria andSortnoIn(List values) {
            addCriterion("SORTNO in", values, "sortno");
            return this;
        }

        public Criteria andSortnoNotIn(List values) {
            addCriterion("SORTNO not in", values, "sortno");
            return this;
        }

        public Criteria andSortnoBetween(Integer value1, Integer value2) {
            addCriterion("SORTNO between", value1, value2, "sortno");
            return this;
        }

        public Criteria andSortnoNotBetween(Integer value1, Integer value2) {
            addCriterion("SORTNO not between", value1, value2, "sortno");
            return this;
        }
    }
}