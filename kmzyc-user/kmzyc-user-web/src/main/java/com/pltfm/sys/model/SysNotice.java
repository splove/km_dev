package com.pltfm.sys.model;

import java.io.Serializable;
import java.util.Date;

public class SysNotice implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 3177233773766403324L;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.notice_id
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private Integer noticeId;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.notice_title
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private String noticeTitle;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.notice_content
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private String noticeContent;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.notice_type
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private String noticeType;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.notice_st
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private String noticeSt;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.notice_remark
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private String noticeRemark;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.is_enable
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private String isEnable;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.create_date
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private Date createDate;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.create_user
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private Integer createUser;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.update_date
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private Date updateDate;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_notice.update_user
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  private Integer updateUser;

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.notice_id
   *
   * @return the value of sys_notice.notice_id
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public Integer getNoticeId() {
    return noticeId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.notice_id
   *
   * @param noticeId the value for sys_notice.notice_id
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setNoticeId(Integer noticeId) {
    this.noticeId = noticeId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.notice_title
   *
   * @return the value of sys_notice.notice_title
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public String getNoticeTitle() {
    return noticeTitle;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.notice_title
   *
   * @param noticeTitle the value for sys_notice.notice_title
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setNoticeTitle(String noticeTitle) {
    this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.notice_content
   *
   * @return the value of sys_notice.notice_content
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public String getNoticeContent() {
    return noticeContent;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.notice_content
   *
   * @param noticeContent the value for sys_notice.notice_content
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setNoticeContent(String noticeContent) {
    this.noticeContent = noticeContent == null ? null : noticeContent.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.notice_type
   *
   * @return the value of sys_notice.notice_type
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public String getNoticeType() {
    return noticeType;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.notice_type
   *
   * @param noticeType the value for sys_notice.notice_type
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setNoticeType(String noticeType) {
    this.noticeType = noticeType == null ? null : noticeType.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.notice_st
   *
   * @return the value of sys_notice.notice_st
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public String getNoticeSt() {
    return noticeSt;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.notice_st
   *
   * @param noticeSt the value for sys_notice.notice_st
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setNoticeSt(String noticeSt) {
    this.noticeSt = noticeSt == null ? null : noticeSt.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.notice_remark
   *
   * @return the value of sys_notice.notice_remark
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public String getNoticeRemark() {
    return noticeRemark;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.notice_remark
   *
   * @param noticeRemark the value for sys_notice.notice_remark
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setNoticeRemark(String noticeRemark) {
    this.noticeRemark = noticeRemark == null ? null : noticeRemark.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.is_enable
   *
   * @return the value of sys_notice.is_enable
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public String getIsEnable() {
    return isEnable;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.is_enable
   *
   * @param isEnable the value for sys_notice.is_enable
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setIsEnable(String isEnable) {
    this.isEnable = isEnable == null ? null : isEnable.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.create_date
   *
   * @return the value of sys_notice.create_date
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public Date getCreateDate() {
    return createDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.create_date
   *
   * @param createDate the value for sys_notice.create_date
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.create_user
   *
   * @return the value of sys_notice.create_user
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public Integer getCreateUser() {
    return createUser;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.create_user
   *
   * @param createUser the value for sys_notice.create_user
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setCreateUser(Integer createUser) {
    this.createUser = createUser;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.update_date
   *
   * @return the value of sys_notice.update_date
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public Date getUpdateDate() {
    return updateDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.update_date
   *
   * @param updateDate the value for sys_notice.update_date
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_notice.update_user
   *
   * @return the value of sys_notice.update_user
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public Integer getUpdateUser() {
    return updateUser;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_notice.update_user
   *
   * @param updateUser the value for sys_notice.update_user
   *
   * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
   */
  public void setUpdateUser(Integer updateUser) {
    this.updateUser = updateUser;
  }



  // ------------ for page
  int skip;
  int max;

  public int getSkip() {
    return skip;
  }

  public void setSkip(int skip) {
    this.skip = skip;
  }

  public int getMax() {
    return max;
  }

  public void setMax(int max) {
    this.max = max;
  }



  // search param
  private Date searchDate1;
  private Date searchDate2;


  public Date getSearchDate1() {
    return searchDate1;
  }

  public void setSearchDate1(Date searchDate1) {
    this.searchDate1 = searchDate1;
  }

  public Date getSearchDate2() {
    return searchDate2;
  }

  public void setSearchDate2(Date searchDate2) {
    this.searchDate2 = searchDate2;
  }
}