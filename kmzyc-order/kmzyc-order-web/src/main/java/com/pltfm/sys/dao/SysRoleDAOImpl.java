package com.pltfm.sys.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.pltfm.sys.model.SysRole;
import com.pltfm.sys.model.SysRoleExample;

public class SysRoleDAOImpl implements SysRoleDAO {
  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database table
   * SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private SqlMapClient sqlMapClient;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public SysRoleDAOImpl(SqlMapClient sqlMapClient) {
    super();
    this.sqlMapClient = sqlMapClient;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public int countByExample(SysRoleExample example) throws SQLException {
    Integer count =
        (Integer) sqlMapClient.queryForObject("SYS_ROLE.ibatorgenerated_countByExample", example);
    return count;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public int deleteByExample(SysRoleExample example) throws SQLException {
    int rows = sqlMapClient.delete("SYS_ROLE.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public int deleteByPrimaryKey(Integer roleId) throws SQLException {
    SysRole key = new SysRole();
    key.setRoleId(roleId);
    int rows = sqlMapClient.delete("SYS_ROLE.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public Integer insert(SysRole record) throws SQLException {
    Object newKey = sqlMapClient.insert("SYS_ROLE.ibatorgenerated_insert", record);
    return (Integer) newKey;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public Integer insertSelective(SysRole record) throws SQLException {
    Object newKey = sqlMapClient.insert("SYS_ROLE.ibatorgenerated_insertSelective", record);
    return (Integer) newKey;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  @SuppressWarnings("unchecked")
  public List<SysRole> selectByExample(SysRoleExample example) throws SQLException {
    List<SysRole> list =
        sqlMapClient.queryForList("SYS_ROLE.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public SysRole selectByPrimaryKey(Integer roleId) throws SQLException {
    SysRole key = new SysRole();
    key.setRoleId(roleId);
    SysRole record =
        (SysRole) sqlMapClient.queryForObject("SYS_ROLE.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public int updateByExampleSelective(SysRole record, SysRoleExample example) throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = sqlMapClient.update("SYS_ROLE.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public int updateByExample(SysRole record, SysRoleExample example) throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = sqlMapClient.update("SYS_ROLE.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public int updateByPrimaryKeySelective(SysRole record) throws SQLException {
    int rows = sqlMapClient.update("SYS_ROLE.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public int updateByPrimaryKey(SysRole record) throws SQLException {
    int rows = sqlMapClient.update("SYS_ROLE.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table
   * SYS_ROLE
   * 
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private static class UpdateByExampleParms extends SysRoleExample {
    private Object record;

    public UpdateByExampleParms(Object record, SysRoleExample example) {
      super(example);
      this.record = record;
    }

    @SuppressWarnings("unused")
    public Object getRecord() {
      return record;
    }
  }
}