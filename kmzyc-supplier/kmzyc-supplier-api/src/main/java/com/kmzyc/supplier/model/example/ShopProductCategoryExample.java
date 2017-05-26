package com.kmzyc.supplier.model.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopProductCategoryExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    public ShopProductCategoryExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    protected ShopProductCategoryExample(ShopProductCategoryExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
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
     * This method corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table SHOP_PRODUCT_CATEGORY
     *
     * @ibatorgenerated Thu Nov 27 10:13:18 CST 2014
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List values) {
            addCriterion("ID in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List values) {
            addCriterion("ID not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return this;
        }

        public Criteria andShopCategoryIdIsNull() {
            addCriterion("SHOP_CATEGORY_ID is null");
            return this;
        }

        public Criteria andShopCategoryIdIsNotNull() {
            addCriterion("SHOP_CATEGORY_ID is not null");
            return this;
        }

        public Criteria andShopCategoryIdEqualTo(Long value) {
            addCriterion("SHOP_CATEGORY_ID =", value, "shopCategoryId");
            return this;
        }

        public Criteria andShopCategoryIdNotEqualTo(Long value) {
            addCriterion("SHOP_CATEGORY_ID <>", value, "shopCategoryId");
            return this;
        }

        public Criteria andShopCategoryIdGreaterThan(Long value) {
            addCriterion("SHOP_CATEGORY_ID >", value, "shopCategoryId");
            return this;
        }

        public Criteria andShopCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_CATEGORY_ID >=", value, "shopCategoryId");
            return this;
        }

        public Criteria andShopCategoryIdLessThan(Long value) {
            addCriterion("SHOP_CATEGORY_ID <", value, "shopCategoryId");
            return this;
        }

        public Criteria andShopCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_CATEGORY_ID <=", value, "shopCategoryId");
            return this;
        }

        public Criteria andShopCategoryIdIn(List values) {
            addCriterion("SHOP_CATEGORY_ID in", values, "shopCategoryId");
            return this;
        }

        public Criteria andShopCategoryIdNotIn(List values) {
            addCriterion("SHOP_CATEGORY_ID not in", values, "shopCategoryId");
            return this;
        }

        public Criteria andShopCategoryIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_CATEGORY_ID between", value1, value2, "shopCategoryId");
            return this;
        }

        public Criteria andShopCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_CATEGORY_ID not between", value1, value2, "shopCategoryId");
            return this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
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

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return this;
        }
    }
}