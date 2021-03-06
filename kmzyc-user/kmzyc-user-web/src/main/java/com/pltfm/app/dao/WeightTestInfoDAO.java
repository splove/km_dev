package com.pltfm.app.dao;

import com.pltfm.app.vobject.WeightTestInfo;
import com.pltfm.app.vobject.WeightTestInfoExample;

import java.sql.SQLException;
import java.util.List;

public interface WeightTestInfoDAO {
  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  int countByExample(WeightTestInfoExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  int deleteByExample(WeightTestInfoExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  int deleteByPrimaryKey(Integer nWeightTestId) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  void insert(WeightTestInfo record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  void insertSelective(WeightTestInfo record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  List selectByExample(WeightTestInfoExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  WeightTestInfo selectByPrimaryKey(Integer nWeightTestId) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  int updateByExampleSelective(WeightTestInfo record, WeightTestInfoExample example)
      throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  int updateByExample(WeightTestInfo record, WeightTestInfoExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  int updateByPrimaryKeySelective(WeightTestInfo record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  int updateByPrimaryKey(WeightTestInfo record) throws SQLException;
}
