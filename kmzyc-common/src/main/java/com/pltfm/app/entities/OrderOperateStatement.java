package com.pltfm.app.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderOperateStatement implements Cloneable, Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 6127993485275328709L;

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.STATEMENT_ID
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private Long statementId;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ID
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private String orderCode;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ITEM_ID
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private Long orderItemId;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_STATUS
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private Long previousOrderStatus;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_STATUS
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private Long nowOrderStatus;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATOR
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private String previousOperator;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATOR
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private String nowOperator;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_DATE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private Date previousOperateDate;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_DATE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private Date nowOperateDate;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_TYPE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private Long previousOperateType;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_TYPE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private Long nowOperateType;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_SUM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private BigDecimal previousOrderSum;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_SUM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private BigDecimal nowOrderSum;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.ORDER_OPERATE_STATEMENT.OPERATE_INFO
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private String operateInfo;

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.STATEMENT_ID
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.STATEMENT_ID
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public Long getStatementId() {
    return statementId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.STATEMENT_ID
   * 
   * @param statementId the value for KMORDER.ORDER_OPERATE_STATEMENT.STATEMENT_ID
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setStatementId(Long statementId) {
    this.statementId = statementId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ID
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ID
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public String getOrderCode() {
    return orderCode;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ID
   * 
   * @param orderId the value for KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ID
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ITEM_ID
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ITEM_ID
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public Long getOrderItemId() {
    return orderItemId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ITEM_ID
   * 
   * @param orderItemId the value for KMORDER.ORDER_OPERATE_STATEMENT.ORDER_ITEM_ID
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setOrderItemId(Long orderItemId) {
    this.orderItemId = orderItemId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_STATUS
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_STATUS
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public Long getPreviousOrderStatus() {
    return previousOrderStatus;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_STATUS
   * 
   * @param previousOrderStatus the value for KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_STATUS
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setPreviousOrderStatus(Long previousOrderStatus) {
    this.previousOrderStatus = previousOrderStatus;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_STATUS
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_STATUS
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public Long getNowOrderStatus() {
    return nowOrderStatus;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_STATUS
   * 
   * @param nowOrderStatus the value for KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_STATUS
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setNowOrderStatus(Long nowOrderStatus) {
    this.nowOrderStatus = nowOrderStatus;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATOR
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATOR
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public String getPreviousOperator() {
    return previousOperator;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATOR
   * 
   * @param previousOperator the value for KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATOR
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setPreviousOperator(String previousOperator) {
    this.previousOperator = previousOperator;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATOR
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATOR
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public String getNowOperator() {
    return nowOperator;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATOR
   * 
   * @param nowOperator the value for KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATOR
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setNowOperator(String nowOperator) {
    this.nowOperator = nowOperator;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_DATE
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_DATE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public Date getPreviousOperateDate() {
    return previousOperateDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_DATE
   * 
   * @param previousOperateDate the value for KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_DATE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setPreviousOperateDate(Date previousOperateDate) {
    this.previousOperateDate = previousOperateDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_DATE
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_DATE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public Date getNowOperateDate() {
    return nowOperateDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_DATE
   * 
   * @param nowOperateDate the value for KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_DATE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setNowOperateDate(Date nowOperateDate) {
    this.nowOperateDate = nowOperateDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_TYPE
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_TYPE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public Long getPreviousOperateType() {
    return previousOperateType;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_TYPE
   * 
   * @param previousOperateType the value for KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_OPERATE_TYPE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setPreviousOperateType(Long previousOperateType) {
    this.previousOperateType = previousOperateType;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_TYPE
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_TYPE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public Long getNowOperateType() {
    return nowOperateType;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_TYPE
   * 
   * @param nowOperateType the value for KMORDER.ORDER_OPERATE_STATEMENT.NOW_OPERATE_TYPE
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setNowOperateType(Long nowOperateType) {
    this.nowOperateType = nowOperateType;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_SUM
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_SUM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public BigDecimal getPreviousOrderSum() {
    return previousOrderSum;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_SUM
   * 
   * @param previousOrderSum the value for KMORDER.ORDER_OPERATE_STATEMENT.PREVIOUS_ORDER_SUM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setPreviousOrderSum(BigDecimal previousOrderSum) {
    this.previousOrderSum = previousOrderSum;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_SUM
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_SUM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public BigDecimal getNowOrderSum() {
    return nowOrderSum;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_SUM
   * 
   * @param nowOrderSum the value for KMORDER.ORDER_OPERATE_STATEMENT.NOW_ORDER_SUM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setNowOrderSum(BigDecimal nowOrderSum) {
    this.nowOrderSum = nowOrderSum;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.ORDER_OPERATE_STATEMENT.OPERATE_INFO
   * 
   * @return the value of KMORDER.ORDER_OPERATE_STATEMENT.OPERATE_INFO
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public String getOperateInfo() {
    return operateInfo;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.ORDER_OPERATE_STATEMENT.OPERATE_INFO
   * 
   * @param operateInfo the value for KMORDER.ORDER_OPERATE_STATEMENT.OPERATE_INFO
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void setOperateInfo(String operateInfo) {
    this.operateInfo = operateInfo;
  }
}