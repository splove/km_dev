package com.pltfm.sys.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class SysLog implements Serializable {
  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_LOG.SYSLOG_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private Integer syslogId;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_LOG.SYSLOG_TIME
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private Date syslogTime;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_LOG.SYSLOG_USER
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private Integer syslogUser;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_LOG.SYSLOG_TYPE
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private String syslogType;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_LOG.SYSLOG_DISCRP
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private String syslogDiscrp;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_LOG.TABLE_NAME
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private String tableName;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_LOG.TABLE_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private Integer tableId;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database table
   * SYS_LOG
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private static final long serialVersionUID = 1L;

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_LOG.SYSLOG_ID
   *
   * @return the value of SYS_LOG.SYSLOG_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public Integer getSyslogId() {
    return syslogId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_LOG.SYSLOG_ID
   *
   * @param syslogId the value for SYS_LOG.SYSLOG_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setSyslogId(Integer syslogId) {
    this.syslogId = syslogId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_LOG.SYSLOG_TIME
   *
   * @return the value of SYS_LOG.SYSLOG_TIME
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public Date getSyslogTime() {
    return syslogTime;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_LOG.SYSLOG_TIME
   *
   * @param syslogTime the value for SYS_LOG.SYSLOG_TIME
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setSyslogTime(Date syslogTime) {
    this.syslogTime = syslogTime;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_LOG.SYSLOG_USER
   *
   * @return the value of SYS_LOG.SYSLOG_USER
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public Integer getSyslogUser() {
    return syslogUser;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_LOG.SYSLOG_USER
   *
   * @param syslogUser the value for SYS_LOG.SYSLOG_USER
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setSyslogUser(Integer syslogUser) {
    this.syslogUser = syslogUser;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_LOG.SYSLOG_TYPE
   *
   * @return the value of SYS_LOG.SYSLOG_TYPE
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public String getSyslogType() {
    return syslogType;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_LOG.SYSLOG_TYPE
   *
   * @param syslogType the value for SYS_LOG.SYSLOG_TYPE
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setSyslogType(String syslogType) {
    this.syslogType = syslogType == null ? null : syslogType.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_LOG.SYSLOG_DISCRP
   *
   * @return the value of SYS_LOG.SYSLOG_DISCRP
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public String getSyslogDiscrp() {
    return syslogDiscrp;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_LOG.SYSLOG_DISCRP
   *
   * @param syslogDiscrp the value for SYS_LOG.SYSLOG_DISCRP
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setSyslogDiscrp(String syslogDiscrp) {
    this.syslogDiscrp = syslogDiscrp == null ? null : syslogDiscrp.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_LOG.TABLE_NAME
   *
   * @return the value of SYS_LOG.TABLE_NAME
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public String getTableName() {
    return tableName;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_LOG.TABLE_NAME
   *
   * @param tableName the value for SYS_LOG.TABLE_NAME
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setTableName(String tableName) {
    this.tableName = tableName == null ? null : tableName.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_LOG.TABLE_ID
   *
   * @return the value of SYS_LOG.TABLE_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public Integer getTableId() {
    return tableId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_LOG.TABLE_ID
   *
   * @param tableId the value for SYS_LOG.TABLE_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setTableId(Integer tableId) {
    this.tableId = tableId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SysLog sysLog = (SysLog) o;
    return skip == sysLog.skip && max == sysLog.max && Objects.equals(syslogId, sysLog.syslogId) &&
            Objects.equals(syslogTime, sysLog.syslogTime) &&
            Objects.equals(syslogUser, sysLog.syslogUser) &&
            Objects.equals(syslogType, sysLog.syslogType) &&
            Objects.equals(syslogDiscrp, sysLog.syslogDiscrp) &&
            Objects.equals(tableName, sysLog.tableName) &&
            Objects.equals(tableId, sysLog.tableId) && Objects.equals(userReal, sysLog.userReal);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  @Override
  public int hashCode() {
    int hash = 23;
    if (getSyslogId() != null) {
      hash *= getSyslogId().hashCode();
    }
    if (getSyslogTime() != null) {
      hash *= getSyslogTime().hashCode();
    }
    if (getSyslogUser() != null) {
      hash *= getSyslogUser().hashCode();
    }
    if (getSyslogType() != null) {
      hash *= getSyslogType().hashCode();
    }
    if (getSyslogDiscrp() != null) {
      hash *= getSyslogDiscrp().hashCode();
    }
    if (getTableName() != null) {
      hash *= getTableName().hashCode();
    }
    if (getTableId() != null) {
      hash *= getTableId().hashCode();
    }
    return hash;
  }

  int skip;
  int max;

  private String userReal;



  public String getUserReal() {
    return userReal;
  }

  public void setUserReal(String userReal) {
    this.userReal = userReal;
  }

  public int getMax() {
    return max;
  }

  public void setMax(int max) {
    this.max = max;
  }

  public int getSkip() {
    return skip;
  }

  public void setSkip(int skip) {
    this.skip = skip;
  }


}
