package com.pltfm.sys.dao;

import java.sql.SQLException;
import java.util.List;

import com.kmzyc.commons.page.Page;
import com.pltfm.sys.model.SysLog;
import com.pltfm.sys.model.SysLogExample;

@SuppressWarnings("unchecked")
public interface SysLogDAO {
  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  int countByExample(SysLogExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  int deleteByExample(SysLogExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  int deleteByPrimaryKey(Integer syslogId) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  Integer insert(SysLog record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  Integer insertSelective(SysLog record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  List<SysLog> selectByExample(SysLogExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  SysLog selectByPrimaryKey(Integer syslogId) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  int updateByExampleSelective(SysLog record, SysLogExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  int updateByExample(SysLog record, SysLogExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  int updateByPrimaryKeySelective(SysLog record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_LOG
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  int updateByPrimaryKey(SysLog record) throws SQLException;

    com.kmzyc.commons.page.Page selectPageByVo(Page page, SysLog vo) throws SQLException;

  List selectLogUsersList(Integer loguser) throws SQLException;

}