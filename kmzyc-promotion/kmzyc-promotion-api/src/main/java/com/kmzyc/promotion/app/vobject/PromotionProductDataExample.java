package com.kmzyc.promotion.app.vobject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromotionProductDataExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    public PromotionProductDataExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    protected PromotionProductDataExample(PromotionProductDataExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
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
     * This method corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table PROMOTION_PRODUCT_DATA
     *
     * @ibatorgenerated Wed Nov 18 14:01:26 CST 2015
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

        public Criteria andPromotionProductDataIdIsNull() {
            addCriterion("PROMOTION_PRODUCT_DATA_ID is null");
            return this;
        }

        public Criteria andPromotionProductDataIdIsNotNull() {
            addCriterion("PROMOTION_PRODUCT_DATA_ID is not null");
            return this;
        }

        public Criteria andPromotionProductDataIdEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID =", value, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductDataIdNotEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID <>", value, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductDataIdGreaterThan(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID >", value, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductDataIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID >=", value, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductDataIdLessThan(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID <", value, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductDataIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID <=", value, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductDataIdIn(List values) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID in", values, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductDataIdNotIn(List values) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID not in", values, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductDataIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID between", value1, value2, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductDataIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_PRODUCT_DATA_ID not between", value1, value2, "promotionProductDataId");
            return this;
        }

        public Criteria andPromotionProductIdIsNull() {
            addCriterion("PROMOTION_PRODUCT_ID is null");
            return this;
        }

        public Criteria andPromotionProductIdIsNotNull() {
            addCriterion("PROMOTION_PRODUCT_ID is not null");
            return this;
        }

        public Criteria andPromotionProductIdEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_ID =", value, "promotionProductId");
            return this;
        }

        public Criteria andPromotionProductIdNotEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_ID <>", value, "promotionProductId");
            return this;
        }

        public Criteria andPromotionProductIdGreaterThan(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_ID >", value, "promotionProductId");
            return this;
        }

        public Criteria andPromotionProductIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_ID >=", value, "promotionProductId");
            return this;
        }

        public Criteria andPromotionProductIdLessThan(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_ID <", value, "promotionProductId");
            return this;
        }

        public Criteria andPromotionProductIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_PRODUCT_ID <=", value, "promotionProductId");
            return this;
        }

        public Criteria andPromotionProductIdIn(List values) {
            addCriterion("PROMOTION_PRODUCT_ID in", values, "promotionProductId");
            return this;
        }

        public Criteria andPromotionProductIdNotIn(List values) {
            addCriterion("PROMOTION_PRODUCT_ID not in", values, "promotionProductId");
            return this;
        }

        public Criteria andPromotionProductIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_PRODUCT_ID between", value1, value2, "promotionProductId");
            return this;
        }

        public Criteria andPromotionProductIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_PRODUCT_ID not between", value1, value2, "promotionProductId");
            return this;
        }

        public Criteria andPromotionIdIsNull() {
            addCriterion("PROMOTION_ID is null");
            return this;
        }

        public Criteria andPromotionIdIsNotNull() {
            addCriterion("PROMOTION_ID is not null");
            return this;
        }

        public Criteria andPromotionIdEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_ID =", value, "promotionId");
            return this;
        }

        public Criteria andPromotionIdNotEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_ID <>", value, "promotionId");
            return this;
        }

        public Criteria andPromotionIdGreaterThan(BigDecimal value) {
            addCriterion("PROMOTION_ID >", value, "promotionId");
            return this;
        }

        public Criteria andPromotionIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_ID >=", value, "promotionId");
            return this;
        }

        public Criteria andPromotionIdLessThan(BigDecimal value) {
            addCriterion("PROMOTION_ID <", value, "promotionId");
            return this;
        }

        public Criteria andPromotionIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTION_ID <=", value, "promotionId");
            return this;
        }

        public Criteria andPromotionIdIn(List values) {
            addCriterion("PROMOTION_ID in", values, "promotionId");
            return this;
        }

        public Criteria andPromotionIdNotIn(List values) {
            addCriterion("PROMOTION_ID not in", values, "promotionId");
            return this;
        }

        public Criteria andPromotionIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_ID between", value1, value2, "promotionId");
            return this;
        }

        public Criteria andPromotionIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTION_ID not between", value1, value2, "promotionId");
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

        public Criteria andProductSkuIdEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SKU_ID =", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SKU_ID <>", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_SKU_ID >", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SKU_ID >=", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdLessThan(BigDecimal value) {
            addCriterion("PRODUCT_SKU_ID <", value, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdLessThanOrEqualTo(BigDecimal value) {
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

        public Criteria andProductSkuIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_SKU_ID between", value1, value2, "productSkuId");
            return this;
        }

        public Criteria andProductSkuIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_SKU_ID not between", value1, value2, "productSkuId");
            return this;
        }

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return this;
        }

        public Criteria andNumEqualTo(Long value) {
            addCriterion("NUM =", value, "num");
            return this;
        }

        public Criteria andNumNotEqualTo(Long value) {
            addCriterion("NUM <>", value, "num");
            return this;
        }

        public Criteria andNumGreaterThan(Long value) {
            addCriterion("NUM >", value, "num");
            return this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM >=", value, "num");
            return this;
        }

        public Criteria andNumLessThan(Long value) {
            addCriterion("NUM <", value, "num");
            return this;
        }

        public Criteria andNumLessThanOrEqualTo(Long value) {
            addCriterion("NUM <=", value, "num");
            return this;
        }

        public Criteria andNumIn(List values) {
            addCriterion("NUM in", values, "num");
            return this;
        }

        public Criteria andNumNotIn(List values) {
            addCriterion("NUM not in", values, "num");
            return this;
        }

        public Criteria andNumBetween(Long value1, Long value2) {
            addCriterion("NUM between", value1, value2, "num");
            return this;
        }

        public Criteria andNumNotBetween(Long value1, Long value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return this;
        }

        public Criteria andPrarentSkuIdIsNull() {
            addCriterion("PRARENT_SKU_ID is null");
            return this;
        }

        public Criteria andPrarentSkuIdIsNotNull() {
            addCriterion("PRARENT_SKU_ID is not null");
            return this;
        }

        public Criteria andPrarentSkuIdEqualTo(BigDecimal value) {
            addCriterion("PRARENT_SKU_ID =", value, "prarentSkuId");
            return this;
        }

        public Criteria andPrarentSkuIdNotEqualTo(BigDecimal value) {
            addCriterion("PRARENT_SKU_ID <>", value, "prarentSkuId");
            return this;
        }

        public Criteria andPrarentSkuIdGreaterThan(BigDecimal value) {
            addCriterion("PRARENT_SKU_ID >", value, "prarentSkuId");
            return this;
        }

        public Criteria andPrarentSkuIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRARENT_SKU_ID >=", value, "prarentSkuId");
            return this;
        }

        public Criteria andPrarentSkuIdLessThan(BigDecimal value) {
            addCriterion("PRARENT_SKU_ID <", value, "prarentSkuId");
            return this;
        }

        public Criteria andPrarentSkuIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRARENT_SKU_ID <=", value, "prarentSkuId");
            return this;
        }

        public Criteria andPrarentSkuIdIn(List values) {
            addCriterion("PRARENT_SKU_ID in", values, "prarentSkuId");
            return this;
        }

        public Criteria andPrarentSkuIdNotIn(List values) {
            addCriterion("PRARENT_SKU_ID not in", values, "prarentSkuId");
            return this;
        }

        public Criteria andPrarentSkuIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRARENT_SKU_ID between", value1, value2, "prarentSkuId");
            return this;
        }

        public Criteria andPrarentSkuIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRARENT_SKU_ID not between", value1, value2, "prarentSkuId");
            return this;
        }
    }
}