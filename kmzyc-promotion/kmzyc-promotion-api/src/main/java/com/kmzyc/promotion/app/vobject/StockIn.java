package com.kmzyc.promotion.app.vobject;

import java.math.BigDecimal;
import java.util.Date;

public class StockIn implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1652310702540151908L;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.STOCK_IN_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Long stockInId;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.CUSTOMER_TYPE_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private BigDecimal customerTypeId;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.STOCK_IN_NO
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private String stockInNo;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.STOCK_IN_DATE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Date stockInDate;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.WAREHOUSE_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Long warehouseId;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.TYPE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Short type;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.USER_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Integer userId;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.CHECK_USER_NAME
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private String auditUserName;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.TOTAL_QUANTITY
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Integer totalQuantity;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.TAX_SUM
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private BigDecimal taxSum;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.TOTAL_TAX
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private BigDecimal totalTax;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.TOTAL_SUM
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private BigDecimal totalSum;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.USER_NAME
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private String userName;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.CREATE_USER
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Integer createUser;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.CREATE_DATE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Date createDate;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.CREATE_USER_NAME
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private String createUserName;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.AUDIT_USER
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Integer auditUser;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.AUDIT_DATE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private Date auditDate;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.STATUS
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private String status;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.DAY_END_STATUS
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private String dayEndStatus;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column STOCK_IN.REMARK
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	private String remark;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.STOCK_IN_ID
	 * 
	 * @return the value of STOCK_IN.STOCK_IN_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public Long getStockInId() {
		return stockInId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.STOCK_IN_ID
	 * 
	 * @param stockInId
	 *            the value for STOCK_IN.STOCK_IN_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setStockInId(Long stockInId) {
		this.stockInId = stockInId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.CUSTOMER_TYPE_ID
	 * 
	 * @return the value of STOCK_IN.CUSTOMER_TYPE_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public BigDecimal getCustomerTypeId() {
		return customerTypeId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.CUSTOMER_TYPE_ID
	 * 
	 * @param customerTypeId
	 *            the value for STOCK_IN.CUSTOMER_TYPE_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setCustomerTypeId(BigDecimal customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.STOCK_IN_NO
	 * 
	 * @return the value of STOCK_IN.STOCK_IN_NO
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public String getStockInNo() {
		return stockInNo;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.STOCK_IN_NO
	 * 
	 * @param stockInNo
	 *            the value for STOCK_IN.STOCK_IN_NO
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setStockInNo(String stockInNo) {
		this.stockInNo = stockInNo;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.STOCK_IN_DATE
	 * 
	 * @return the value of STOCK_IN.STOCK_IN_DATE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public Date getStockInDate() {
		return stockInDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.STOCK_IN_DATE
	 * 
	 * @param stockInDate
	 *            the value for STOCK_IN.STOCK_IN_DATE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setStockInDate(Date stockInDate) {
		this.stockInDate = stockInDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.WAREHOUSE_ID
	 * 
	 * @return the value of STOCK_IN.WAREHOUSE_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.WAREHOUSE_ID
	 * 
	 * @param warehouseId
	 *            the value for STOCK_IN.WAREHOUSE_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.TYPE
	 * 
	 * @return the value of STOCK_IN.TYPE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public Short getType() {
		return type;
	}

	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.TYPE
	 * 
	 * @param type
	 *            the value for STOCK_IN.TYPE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setType(Short type) {
		this.type = type;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.USER_ID
	 * 
	 * @return the value of STOCK_IN.USER_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.USER_ID
	 * 
	 * @param userId
	 *            the value for STOCK_IN.USER_ID
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAuditUserName() {
		return auditUserName;
	}

	public void setAuditUserName(String auditUserName) {
		this.auditUserName = auditUserName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.TOTAL_QUANTITY
	 * 
	 * @return the value of STOCK_IN.TOTAL_QUANTITY
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public Integer getTotalQuantity() {
		return totalQuantity;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.TOTAL_QUANTITY
	 * 
	 * @param totalQuantity
	 *            the value for STOCK_IN.TOTAL_QUANTITY
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.TAX_SUM
	 * 
	 * @return the value of STOCK_IN.TAX_SUM
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public BigDecimal getTaxSum() {
		return taxSum;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.TAX_SUM
	 * 
	 * @param taxSum
	 *            the value for STOCK_IN.TAX_SUM
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setTaxSum(BigDecimal taxSum) {
		this.taxSum = taxSum;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.TOTAL_TAX
	 * 
	 * @return the value of STOCK_IN.TOTAL_TAX
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public BigDecimal getTotalTax() {
		return totalTax;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.TOTAL_TAX
	 * 
	 * @param totalTax
	 *            the value for STOCK_IN.TOTAL_TAX
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.TOTAL_SUM
	 * 
	 * @return the value of STOCK_IN.TOTAL_SUM
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public BigDecimal getTotalSum() {
		return totalSum;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.TOTAL_SUM
	 * 
	 * @param totalSum
	 *            the value for STOCK_IN.TOTAL_SUM
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setTotalSum(BigDecimal totalSum) {
		this.totalSum = totalSum;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.USER_NAME
	 * 
	 * @return the value of STOCK_IN.USER_NAME
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.USER_NAME
	 * 
	 * @param userName
	 *            the value for STOCK_IN.USER_NAME
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.CREATE_USER
	 * 
	 * @return the value of STOCK_IN.CREATE_USER
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public Integer getCreateUser() {
		return createUser;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.CREATE_USER
	 * 
	 * @param createUser
	 *            the value for STOCK_IN.CREATE_USER
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.CREATE_DATE
	 * 
	 * @return the value of STOCK_IN.CREATE_DATE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.CREATE_DATE
	 * 
	 * @param createDate
	 *            the value for STOCK_IN.CREATE_DATE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.CREATE_USER_NAME
	 * 
	 * @return the value of STOCK_IN.CREATE_USER_NAME
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public String getCreateUserName() {
		return createUserName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.CREATE_USER_NAME
	 * 
	 * @param createUserName
	 *            the value for STOCK_IN.CREATE_USER_NAME
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.AUDIT_USER
	 * 
	 * @return the value of STOCK_IN.AUDIT_USER
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public Integer getAuditUser() {
		return auditUser;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.AUDIT_USER
	 * 
	 * @param auditUser
	 *            the value for STOCK_IN.AUDIT_USER
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setAuditUser(Integer auditUser) {
		this.auditUser = auditUser;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.AUDIT_DATE
	 * 
	 * @return the value of STOCK_IN.AUDIT_DATE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public Date getAuditDate() {
		return auditDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.AUDIT_DATE
	 * 
	 * @param auditDate
	 *            the value for STOCK_IN.AUDIT_DATE
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.STATUS
	 * 
	 * @return the value of STOCK_IN.STATUS
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.STATUS
	 * 
	 * @param status
	 *            the value for STOCK_IN.STATUS
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.DAY_END_STATUS
	 * 
	 * @return the value of STOCK_IN.DAY_END_STATUS
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public String getDayEndStatus() {
		return dayEndStatus;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.DAY_END_STATUS
	 * 
	 * @param dayEndStatus
	 *            the value for STOCK_IN.DAY_END_STATUS
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setDayEndStatus(String dayEndStatus) {
		this.dayEndStatus = dayEndStatus;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column STOCK_IN.REMARK
	 * 
	 * @return the value of STOCK_IN.REMARK
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column STOCK_IN.REMARK
	 * 
	 * @param remark
	 *            the value for STOCK_IN.REMARK
	 * 
	 * @ibatorgenerated Wed Aug 14 11:05:04 CST 2013
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
}