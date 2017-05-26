package com.pltfm.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class InvoiceDictionaryExample implements Serializable {
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database table
   * KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  protected String orderByClause;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database table
   * KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  protected List oredCriteria;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public InvoiceDictionaryExample() {
    oredCriteria = new ArrayList();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  protected InvoiceDictionaryExample(InvoiceDictionaryExample example) {
    this.orderByClause = example.orderByClause;
    this.oredCriteria = example.oredCriteria;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public List getOredCriteria() {
    return oredCriteria;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void clear() {
    oredCriteria.clear();
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table
   * KMORDER.INVOICE_DICTIONARY
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
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
      return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0
          || criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
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

    public Criteria andInvoice_dictionary_idIsNull() {
      addCriterion("INVOICE_DICTIONARY_ID is null");
      return this;
    }

    public Criteria andInvoice_dictionary_idIsNotNull() {
      addCriterion("INVOICE_DICTIONARY_ID is not null");
      return this;
    }

    public Criteria andInvoice_dictionary_idEqualTo(long value) {
      addCriterion("INVOICE_DICTIONARY_ID =", new Long(value), "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoice_dictionary_idNotEqualTo(long value) {
      addCriterion("INVOICE_DICTIONARY_ID <>", new Long(value), "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoice_dictionary_idGreaterThan(long value) {
      addCriterion("INVOICE_DICTIONARY_ID >", new Long(value), "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoice_dictionary_idGreaterThanOrEqualTo(long value) {
      addCriterion("INVOICE_DICTIONARY_ID >=", new Long(value), "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoice_dictionary_idLessThan(long value) {
      addCriterion("INVOICE_DICTIONARY_ID <", new Long(value), "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoice_dictionary_idLessThanOrEqualTo(long value) {
      addCriterion("INVOICE_DICTIONARY_ID <=", new Long(value), "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoice_dictionary_idIn(List values) {
      addCriterion("INVOICE_DICTIONARY_ID in", values, "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoice_dictionary_idNotIn(List values) {
      addCriterion("INVOICE_DICTIONARY_ID not in", values, "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoice_dictionary_idBetween(long value1, long value2) {
      addCriterion("INVOICE_DICTIONARY_ID between", new Long(value1), new Long(value2),
          "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoice_dictionary_idNotBetween(long value1, long value2) {
      addCriterion("INVOICE_DICTIONARY_ID not between", new Long(value1), new Long(value2),
          "invoice_dictionary_id");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeIsNull() {
      addCriterion("INVOICE_DICTIONARY_TYPE is null");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeIsNotNull() {
      addCriterion("INVOICE_DICTIONARY_TYPE is not null");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeEqualTo(Long value) {
      addCriterion("INVOICE_DICTIONARY_TYPE =", value, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeNotEqualTo(Long value) {
      addCriterion("INVOICE_DICTIONARY_TYPE <>", value, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeGreaterThan(Long value) {
      addCriterion("INVOICE_DICTIONARY_TYPE >", value, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeGreaterThanOrEqualTo(Long value) {
      addCriterion("INVOICE_DICTIONARY_TYPE >=", value, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeLessThan(Long value) {
      addCriterion("INVOICE_DICTIONARY_TYPE <", value, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeLessThanOrEqualTo(Long value) {
      addCriterion("INVOICE_DICTIONARY_TYPE <=", value, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeIn(List values) {
      addCriterion("INVOICE_DICTIONARY_TYPE in", values, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeNotIn(List values) {
      addCriterion("INVOICE_DICTIONARY_TYPE not in", values, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeBetween(Long value1, Long value2) {
      addCriterion("INVOICE_DICTIONARY_TYPE between", value1, value2, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryTypeNotBetween(Long value1, Long value2) {
      addCriterion("INVOICE_DICTIONARY_TYPE not between", value1, value2, "invoiceDictionaryType");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyIsNull() {
      addCriterion("INVOICE_DICTIONARY_KEY is null");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyIsNotNull() {
      addCriterion("INVOICE_DICTIONARY_KEY is not null");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyEqualTo(Long value) {
      addCriterion("INVOICE_DICTIONARY_KEY =", value, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyNotEqualTo(Long value) {
      addCriterion("INVOICE_DICTIONARY_KEY <>", value, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyGreaterThan(Long value) {
      addCriterion("INVOICE_DICTIONARY_KEY >", value, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyGreaterThanOrEqualTo(Long value) {
      addCriterion("INVOICE_DICTIONARY_KEY >=", value, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyLessThan(Long value) {
      addCriterion("INVOICE_DICTIONARY_KEY <", value, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyLessThanOrEqualTo(Long value) {
      addCriterion("INVOICE_DICTIONARY_KEY <=", value, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyIn(List values) {
      addCriterion("INVOICE_DICTIONARY_KEY in", values, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyNotIn(List values) {
      addCriterion("INVOICE_DICTIONARY_KEY not in", values, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyBetween(Long value1, Long value2) {
      addCriterion("INVOICE_DICTIONARY_KEY between", value1, value2, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryKeyNotBetween(Long value1, Long value2) {
      addCriterion("INVOICE_DICTIONARY_KEY not between", value1, value2, "invoiceDictionaryKey");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeIsNull() {
      addCriterion("INVOICE_DICTIONARY_CODE is null");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeIsNotNull() {
      addCriterion("INVOICE_DICTIONARY_CODE is not null");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_CODE =", value, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeNotEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_CODE <>", value, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeGreaterThan(String value) {
      addCriterion("INVOICE_DICTIONARY_CODE >", value, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeGreaterThanOrEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_CODE >=", value, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeLessThan(String value) {
      addCriterion("INVOICE_DICTIONARY_CODE <", value, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeLessThanOrEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_CODE <=", value, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeLike(String value) {
      addCriterion("INVOICE_DICTIONARY_CODE like", value, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeNotLike(String value) {
      addCriterion("INVOICE_DICTIONARY_CODE not like", value, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeIn(List values) {
      addCriterion("INVOICE_DICTIONARY_CODE in", values, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeNotIn(List values) {
      addCriterion("INVOICE_DICTIONARY_CODE not in", values, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeBetween(String value1, String value2) {
      addCriterion("INVOICE_DICTIONARY_CODE between", value1, value2, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryCodeNotBetween(String value1, String value2) {
      addCriterion("INVOICE_DICTIONARY_CODE not between", value1, value2, "invoiceDictionaryCode");
      return this;
    }

    public Criteria andInvoiceDictionaryValueIsNull() {
      addCriterion("INVOICE_DICTIONARY_VALUE is null");
      return this;
    }

    public Criteria andInvoiceDictionaryValueIsNotNull() {
      addCriterion("INVOICE_DICTIONARY_VALUE is not null");
      return this;
    }

    public Criteria andInvoiceDictionaryValueEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_VALUE =", value, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueNotEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_VALUE <>", value, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueGreaterThan(String value) {
      addCriterion("INVOICE_DICTIONARY_VALUE >", value, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueGreaterThanOrEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_VALUE >=", value, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueLessThan(String value) {
      addCriterion("INVOICE_DICTIONARY_VALUE <", value, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueLessThanOrEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_VALUE <=", value, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueLike(String value) {
      addCriterion("INVOICE_DICTIONARY_VALUE like", value, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueNotLike(String value) {
      addCriterion("INVOICE_DICTIONARY_VALUE not like", value, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueIn(List values) {
      addCriterion("INVOICE_DICTIONARY_VALUE in", values, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueNotIn(List values) {
      addCriterion("INVOICE_DICTIONARY_VALUE not in", values, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueBetween(String value1, String value2) {
      addCriterion("INVOICE_DICTIONARY_VALUE between", value1, value2, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryValueNotBetween(String value1, String value2) {
      addCriterion("INVOICE_DICTIONARY_VALUE not between", value1, value2, "invoiceDictionaryValue");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentIsNull() {
      addCriterion("INVOICE_DICTIONARY_COMMENT is null");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentIsNotNull() {
      addCriterion("INVOICE_DICTIONARY_COMMENT is not null");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_COMMENT =", value, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentNotEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_COMMENT <>", value, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentGreaterThan(String value) {
      addCriterion("INVOICE_DICTIONARY_COMMENT >", value, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentGreaterThanOrEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_COMMENT >=", value, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentLessThan(String value) {
      addCriterion("INVOICE_DICTIONARY_COMMENT <", value, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentLessThanOrEqualTo(String value) {
      addCriterion("INVOICE_DICTIONARY_COMMENT <=", value, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentLike(String value) {
      addCriterion("INVOICE_DICTIONARY_COMMENT like", value, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentNotLike(String value) {
      addCriterion("INVOICE_DICTIONARY_COMMENT not like", value, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentIn(List values) {
      addCriterion("INVOICE_DICTIONARY_COMMENT in", values, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentNotIn(List values) {
      addCriterion("INVOICE_DICTIONARY_COMMENT not in", values, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentBetween(String value1, String value2) {
      addCriterion("INVOICE_DICTIONARY_COMMENT between", value1, value2, "invoiceDictionaryComment");
      return this;
    }

    public Criteria andInvoiceDictionaryCommentNotBetween(String value1, String value2) {
      addCriterion("INVOICE_DICTIONARY_COMMENT not between", value1, value2,
          "invoiceDictionaryComment");
      return this;
    }
  }
}