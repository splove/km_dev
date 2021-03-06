package com.pltfm.sys.model;

import java.io.Serializable;
import java.util.Date;

public class SysUploadFile implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = -3856546421836212478L;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_upload_file.file_id
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  private Integer fileId;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_upload_file.file_name
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  private String fileName;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_upload_file.file_url
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  private String fileUrl;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_upload_file.file_type
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  private String fileType;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_upload_file.file_size
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  private Double fileSize;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_upload_file.upload_time
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  private Date uploadTime;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_upload_file.upload_user
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  private Integer uploadUser;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_upload_file.remark
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  private String remark;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * sys_upload_file.file_data
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  private String fileData;

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_upload_file.file_id
   *
   * @return the value of sys_upload_file.file_id
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public Integer getFileId() {
    return fileId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_upload_file.file_id
   *
   * @param fileId the value for sys_upload_file.file_id
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public void setFileId(Integer fileId) {
    this.fileId = fileId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_upload_file.file_name
   *
   * @return the value of sys_upload_file.file_name
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_upload_file.file_name
   *
   * @param fileName the value for sys_upload_file.file_name
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public void setFileName(String fileName) {
    this.fileName = fileName == null ? null : fileName.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_upload_file.file_url
   *
   * @return the value of sys_upload_file.file_url
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public String getFileUrl() {
    return fileUrl;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_upload_file.file_url
   *
   * @param fileUrl the value for sys_upload_file.file_url
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl == null ? null : fileUrl.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_upload_file.file_type
   *
   * @return the value of sys_upload_file.file_type
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public String getFileType() {
    return fileType;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_upload_file.file_type
   *
   * @param fileType the value for sys_upload_file.file_type
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public void setFileType(String fileType) {
    this.fileType = fileType == null ? null : fileType.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_upload_file.file_size
   *
   * @return the value of sys_upload_file.file_size
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public Double getFileSize() {
    return fileSize;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_upload_file.file_size
   *
   * @param fileSize the value for sys_upload_file.file_size
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public void setFileSize(Double fileSize) {
    this.fileSize = fileSize;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_upload_file.upload_time
   *
   * @return the value of sys_upload_file.upload_time
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public Date getUploadTime() {
    return uploadTime;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_upload_file.upload_time
   *
   * @param uploadTime the value for sys_upload_file.upload_time
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public void setUploadTime(Date uploadTime) {
    this.uploadTime = uploadTime;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_upload_file.upload_user
   *
   * @return the value of sys_upload_file.upload_user
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public Integer getUploadUser() {
    return uploadUser;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_upload_file.upload_user
   *
   * @param uploadUser the value for sys_upload_file.upload_user
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public void setUploadUser(Integer uploadUser) {
    this.uploadUser = uploadUser;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_upload_file.remark
   *
   * @return the value of sys_upload_file.remark
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public String getRemark() {
    return remark;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_upload_file.remark
   *
   * @param remark the value for sys_upload_file.remark
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public void setRemark(String remark) {
    this.remark = remark == null ? null : remark.trim();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column sys_upload_file.file_data
   *
   * @return the value of sys_upload_file.file_data
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public String getFileData() {
    return fileData;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column sys_upload_file.file_data
   *
   * @param fileData the value for sys_upload_file.file_data
   *
   * @ibatorgenerated Wed Dec 30 18:19:34 CST 2009
   */
  public void setFileData(String fileData) {
    this.fileData = fileData == null ? null : fileData.trim();
  }


  public String idString;

  public String getIdString() {
    return idString;
  }

  public void setIdString(String idString) {
    this.idString = idString;
  }


}
