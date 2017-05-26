package com.pltfm.app.entities;

import java.io.Serializable;
import java.util.Date;

public class RequestInfo implements Serializable {
  private static final long serialVersionUID = 1L;
  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.RID
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private Long rid;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.SYSTEM_CODE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private String systemCode;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.SERVICE_NAME
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private String serviceName;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.REQUEST_SOURCE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private String requestSource;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.REQUEST_IP
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private String requestIp;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.CUID
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private Long cuid;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.REQUEST_PARAMS
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private String requestParams;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.REQUEST_STATUS
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private String requestStatus;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.REQUEST_START_DATE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private Date requestStartDate;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * KMORDER.REQUEST_INFO.REQUEST_END_DATE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  private Date requestEndDate;

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.RID
   * 
   * @return the value of KMORDER.REQUEST_INFO.RID
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public Long getRid() {
    return rid;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.RID
   * 
   * @param rid the value for KMORDER.REQUEST_INFO.RID
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setRid(Long rid) {
    this.rid = rid;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.SYSTEM_CODE
   * 
   * @return the value of KMORDER.REQUEST_INFO.SYSTEM_CODE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public String getSystemCode() {
    return systemCode;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.SYSTEM_CODE
   * 
   * @param systemCode the value for KMORDER.REQUEST_INFO.SYSTEM_CODE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setSystemCode(String systemCode) {
    this.systemCode = systemCode;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.SERVICE_NAME
   * 
   * @return the value of KMORDER.REQUEST_INFO.SERVICE_NAME
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public String getServiceName() {
    return serviceName;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.SERVICE_NAME
   * 
   * @param serviceName the value for KMORDER.REQUEST_INFO.SERVICE_NAME
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.REQUEST_SOURCE
   * 
   * @return the value of KMORDER.REQUEST_INFO.REQUEST_SOURCE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public String getRequestSource() {
    return requestSource;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.REQUEST_SOURCE
   * 
   * @param requestSource the value for KMORDER.REQUEST_INFO.REQUEST_SOURCE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setRequestSource(String requestSource) {
    this.requestSource = requestSource;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.REQUEST_IP
   * 
   * @return the value of KMORDER.REQUEST_INFO.REQUEST_IP
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public String getRequestIp() {
    return requestIp;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.REQUEST_IP
   * 
   * @param requestIp the value for KMORDER.REQUEST_INFO.REQUEST_IP
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setRequestIp(String requestIp) {
    this.requestIp = requestIp;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.CUID
   * 
   * @return the value of KMORDER.REQUEST_INFO.CUID
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public Long getCuid() {
    return cuid;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.CUID
   * 
   * @param cuid the value for KMORDER.REQUEST_INFO.CUID
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setCuid(Long cuid) {
    this.cuid = cuid;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.REQUEST_PARAMS
   * 
   * @return the value of KMORDER.REQUEST_INFO.REQUEST_PARAMS
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public String getRequestParams() {
    return requestParams;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.REQUEST_PARAMS
   * 
   * @param requestParams the value for KMORDER.REQUEST_INFO.REQUEST_PARAMS
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setRequestParams(String requestParams) {
    this.requestParams = requestParams;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.REQUEST_STATUS
   * 
   * @return the value of KMORDER.REQUEST_INFO.REQUEST_STATUS
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public String getRequestStatus() {
    return requestStatus;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.REQUEST_STATUS
   * 
   * @param requestStatus the value for KMORDER.REQUEST_INFO.REQUEST_STATUS
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setRequestStatus(String requestStatus) {
    this.requestStatus = requestStatus;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.REQUEST_START_DATE
   * 
   * @return the value of KMORDER.REQUEST_INFO.REQUEST_START_DATE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public Date getRequestStartDate() {
    return requestStartDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.REQUEST_START_DATE
   * 
   * @param requestStartDate the value for KMORDER.REQUEST_INFO.REQUEST_START_DATE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setRequestStartDate(Date requestStartDate) {
    this.requestStartDate = requestStartDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column KMORDER.REQUEST_INFO.REQUEST_END_DATE
   * 
   * @return the value of KMORDER.REQUEST_INFO.REQUEST_END_DATE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public Date getRequestEndDate() {
    return requestEndDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column KMORDER.REQUEST_INFO.REQUEST_END_DATE
   * 
   * @param requestEndDate the value for KMORDER.REQUEST_INFO.REQUEST_END_DATE
   * 
   * @ibatorgenerated Wed May 21 10:38:14 CST 2014
   */
  public void setRequestEndDate(Date requestEndDate) {
    this.requestEndDate = requestEndDate;
  }
}