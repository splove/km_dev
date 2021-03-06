package com.pltfm.sys.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.pltfm.sys.model.ReportColumnSetting;
import com.pltfm.sys.model.ReportColumnSettingExample;

@SuppressWarnings("unchecked")
public class ReportColumnSettingDAOImpl implements ReportColumnSettingDAO {
  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database table
   * report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  private SqlMapClient sqlMapClient;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public ReportColumnSettingDAOImpl(SqlMapClient sqlMapClient) {
    super();
    this.sqlMapClient = sqlMapClient;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public int countByExample(ReportColumnSettingExample example) throws SQLException {
    Integer count =
        (Integer) sqlMapClient.queryForObject(
            "report_column_setting.ibatorgenerated_countByExample", example);
    return count;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public int deleteByExample(ReportColumnSettingExample example) throws SQLException {
    int rows =
        sqlMapClient.delete("report_column_setting.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public int deleteByPrimaryKey(Integer colId) throws SQLException {
    ReportColumnSetting key = new ReportColumnSetting();
    key.setColId(colId);
    int rows = sqlMapClient.delete("report_column_setting.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public Integer insert(ReportColumnSetting record) throws SQLException {
    Object newKey = sqlMapClient.insert("report_column_setting.ibatorgenerated_insert", record);
    return (Integer) newKey;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public Integer insertSelective(ReportColumnSetting record) throws SQLException {
    Object newKey =
        sqlMapClient.insert("report_column_setting.ibatorgenerated_insertSelective", record);
    return (Integer) newKey;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public List<ReportColumnSetting> selectByExample(ReportColumnSettingExample example)
      throws SQLException {
    List<ReportColumnSetting> list =
        sqlMapClient.queryForList("report_column_setting.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public ReportColumnSetting selectByPrimaryKey(Integer colId) throws SQLException {
    ReportColumnSetting key = new ReportColumnSetting();
    key.setColId(colId);
    ReportColumnSetting record =
        (ReportColumnSetting) sqlMapClient.queryForObject(
            "report_column_setting.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public int updateByExampleSelective(ReportColumnSetting record, ReportColumnSettingExample example)
      throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows =
        sqlMapClient
            .update("report_column_setting.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public int updateByExample(ReportColumnSetting record, ReportColumnSettingExample example)
      throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = sqlMapClient.update("report_column_setting.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public int updateByPrimaryKeySelective(ReportColumnSetting record) throws SQLException {
    int rows =
        sqlMapClient.update("report_column_setting.ibatorgenerated_updateByPrimaryKeySelective",
            record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  public int updateByPrimaryKey(ReportColumnSetting record) throws SQLException {
    int rows =
        sqlMapClient.update("report_column_setting.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table
   * report_column_setting
   * 
   * @ibatorgenerated Wed Mar 10 14:42:57 CST 2010
   */
  private static class UpdateByExampleParms extends ReportColumnSettingExample {
    private Object record;

    public UpdateByExampleParms(Object record, ReportColumnSettingExample example) {
      super(example);
      this.record = record;
    }

    @SuppressWarnings("unused")
    public Object getRecord() {
      return record;
    }
  }
}
