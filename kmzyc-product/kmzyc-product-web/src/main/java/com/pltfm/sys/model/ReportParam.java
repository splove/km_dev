package com.pltfm.sys.model;

import java.math.BigDecimal;
import java.util.Date;

public class ReportParam {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.param_id
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private Integer paramId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.report_id
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private Integer reportId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.sub_sentence
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private String subSentence;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.param_name
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private String paramName;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.data_type
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private String dataType;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.control_type
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private String controlType;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.param_order
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private Integer paramOrder;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.param_code
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private String paramCode;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.param_sql
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private String paramSql;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.create_user
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private Integer createUser;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.create_date
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private Date createDate;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.update_user
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private Integer updateUser;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.update_date
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private Date updateDate;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.is_show
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private String isShow;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.is_must
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private String isMust;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column report_param.is_enable
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	private String isEnable;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.param_id
	 * @return  the value of report_param.param_id
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public Integer getParamId() {
		return paramId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.param_id
	 * @param paramId  the value for report_param.param_id
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.report_id
	 * @return  the value of report_param.report_id
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public Integer getReportId() {
		return reportId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.report_id
	 * @param reportId  the value for report_param.report_id
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.sub_sentence
	 * @return  the value of report_param.sub_sentence
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public String getSubSentence() {
		return subSentence;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.sub_sentence
	 * @param subSentence  the value for report_param.sub_sentence
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setSubSentence(String subSentence) {
		this.subSentence = subSentence == null ? null : subSentence.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.param_name
	 * @return  the value of report_param.param_name
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public String getParamName() {
		return paramName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.param_name
	 * @param paramName  the value for report_param.param_name
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setParamName(String paramName) {
		this.paramName = paramName == null ? null : paramName.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.data_type
	 * @return  the value of report_param.data_type
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.data_type
	 * @param dataType  the value for report_param.data_type
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType == null ? null : dataType.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.control_type
	 * @return  the value of report_param.control_type
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public String getControlType() {
		return controlType;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.control_type
	 * @param controlType  the value for report_param.control_type
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setControlType(String controlType) {
		this.controlType = controlType == null ? null : controlType.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.param_order
	 * @return  the value of report_param.param_order
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public Integer getParamOrder() {
		return paramOrder;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.param_order
	 * @param paramOrder  the value for report_param.param_order
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setParamOrder(Integer paramOrder) {
		this.paramOrder = paramOrder;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.param_code
	 * @return  the value of report_param.param_code
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public String getParamCode() {
		return paramCode;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.param_code
	 * @param paramCode  the value for report_param.param_code
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setParamCode(String paramCode) {
		this.paramCode = paramCode == null ? null : paramCode.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.param_sql
	 * @return  the value of report_param.param_sql
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public String getParamSql() {
		return paramSql;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.param_sql
	 * @param paramSql  the value for report_param.param_sql
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setParamSql(String paramSql) {
		this.paramSql = paramSql == null ? null : paramSql.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.create_user
	 * @return  the value of report_param.create_user
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public Integer getCreateUser() {
		return createUser;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.create_user
	 * @param createUser  the value for report_param.create_user
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.create_date
	 * @return  the value of report_param.create_date
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.create_date
	 * @param createDate  the value for report_param.create_date
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.update_user
	 * @return  the value of report_param.update_user
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public Integer getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.update_user
	 * @param updateUser  the value for report_param.update_user
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.update_date
	 * @return  the value of report_param.update_date
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.update_date
	 * @param updateDate  the value for report_param.update_date
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.is_show
	 * @return  the value of report_param.is_show
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public String getIsShow() {
		return isShow;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.is_show
	 * @param isShow  the value for report_param.is_show
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setIsShow(String isShow) {
		this.isShow = isShow == null ? null : isShow.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.is_must
	 * @return  the value of report_param.is_must
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public String getIsMust() {
		return isMust;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.is_must
	 * @param isMust  the value for report_param.is_must
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setIsMust(String isMust) {
		this.isMust = isMust == null ? null : isMust.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column report_param.is_enable
	 * @return  the value of report_param.is_enable
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public String getIsEnable() {
		return isEnable;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column report_param.is_enable
	 * @param isEnable  the value for report_param.is_enable
	 * @ibatorgenerated  Thu Jan 28 16:04:43 CST 2010
	 */
	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable == null ? null : isEnable.trim();
	}
}