package com.pltfm.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.pltfm.app.dao.WeightTestInfoDAO;
import com.pltfm.app.vobject.WeightTestInfo;
import com.pltfm.app.vobject.WeightTestInfoExample;

public class WeightTestInfoDAOImpl implements WeightTestInfoDAO {
  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database table
   * WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  private SqlMapClient sqlMapClient;


  public SqlMapClient getSqlMapClient() {
    return sqlMapClient;
  }

  public void setSqlMapClient(SqlMapClient sqlMapClient) {
    this.sqlMapClient = sqlMapClient;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public int countByExample(WeightTestInfoExample example) throws SQLException {
    Integer count = (Integer) sqlMapClient
        .queryForObject("WEIGHT_TEST_INFO.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public int deleteByExample(WeightTestInfoExample example) throws SQLException {
    int rows = sqlMapClient.delete("WEIGHT_TEST_INFO.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public int deleteByPrimaryKey(Integer nWeightTestId) throws SQLException {
    WeightTestInfo key = new WeightTestInfo();
    key.setnWeightTestId(nWeightTestId);
    int rows = sqlMapClient.delete("WEIGHT_TEST_INFO.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public void insert(WeightTestInfo record) throws SQLException {
    sqlMapClient.insert("WEIGHT_TEST_INFO.ibatorgenerated_insert", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public void insertSelective(WeightTestInfo record) throws SQLException {
    sqlMapClient.insert("WEIGHT_TEST_INFO.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public List selectByExample(WeightTestInfoExample example) throws SQLException {
    List list =
        sqlMapClient.queryForList("WEIGHT_TEST_INFO.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public WeightTestInfo selectByPrimaryKey(Integer nWeightTestId) throws SQLException {
    WeightTestInfo key = new WeightTestInfo();
    key.setnWeightTestId(nWeightTestId);
    WeightTestInfo record = (WeightTestInfo) sqlMapClient
        .queryForObject("WEIGHT_TEST_INFO.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public int updateByExampleSelective(WeightTestInfo record, WeightTestInfoExample example)
      throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows =
        sqlMapClient.update("WEIGHT_TEST_INFO.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public int updateByExample(WeightTestInfo record, WeightTestInfoExample example)
      throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = sqlMapClient.update("WEIGHT_TEST_INFO.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public int updateByPrimaryKeySelective(WeightTestInfo record) throws SQLException {
    int rows =
        sqlMapClient.update("WEIGHT_TEST_INFO.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  public int updateByPrimaryKey(WeightTestInfo record) throws SQLException {
    int rows = sqlMapClient.update("WEIGHT_TEST_INFO.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table
   * WEIGHT_TEST_INFO
   *
   * @ibatorgenerated Thu Jul 11 17:17:54 CST 2013
   */
  private static class UpdateByExampleParms extends WeightTestInfoExample {
    private Object record;

    public UpdateByExampleParms(Object record, WeightTestInfoExample example) {
      super(example);
      this.record = record;
    }

    public Object getRecord() {
      return record;
    }
  }
}
