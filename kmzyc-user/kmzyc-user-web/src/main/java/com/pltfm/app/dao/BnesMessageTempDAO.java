package com.pltfm.app.dao;

import com.pltfm.app.vobject.BnesMessageTemp;
import com.pltfm.app.vobject.BnesMessageTempExample;
import com.pltfm.app.vobject.BnesMessageTempQry;

import java.sql.SQLException;
import java.util.List;

public interface BnesMessageTempDAO {

  void insert(BnesMessageTemp record) throws SQLException;

  /**
   * This method was generated by Abator for iBATIS. This method corresponds to the database table
   * BNES_MESSAGE_TEMP
   *
   * @abatorgenerated Tue Aug 13 16:55:57 CST 2013
   */
  int updateByPrimaryKey(BnesMessageTemp record) throws SQLException;

  /**
   * This method was generated by Abator for iBATIS. This method corresponds to the database table
   * BNES_MESSAGE_TEMP
   *
   * @abatorgenerated Tue Aug 13 16:55:57 CST 2013
   */
  int updateByPrimaryKeySelective(BnesMessageTemp record) throws SQLException;

  /**
   * This method was generated by Abator for iBATIS. This method corresponds to the database table
   * BNES_MESSAGE_TEMP
   *
   * @abatorgenerated Tue Aug 13 16:55:57 CST 2013
   */
  List selectByExample(BnesMessageTempQry qry) throws SQLException;

  /**
   * This method was generated by Abator for iBATIS. This method corresponds to the database table
   * BNES_MESSAGE_TEMP
   *
   * @abatorgenerated Tue Aug 13 16:55:57 CST 2013
   */
  BnesMessageTemp selectByPrimaryKey(Integer messageTempId) throws SQLException;

  /**
   * This method was generated by Abator for iBATIS. This method corresponds to the database table
   * BNES_MESSAGE_TEMP
   *
   * @abatorgenerated Tue Aug 13 16:55:57 CST 2013
   */
  int deleteByExample(BnesMessageTempExample example) throws SQLException;

  /**
   * This method was generated by Abator for iBATIS. This method corresponds to the database table
   * BNES_MESSAGE_TEMP
   *
   * @abatorgenerated Tue Aug 13 16:55:57 CST 2013
   */
  int deleteByPrimaryKey(Integer messageTempId) throws SQLException;

  /**
   * This method was generated by Abator for iBATIS. This method corresponds to the database table
   * BNES_MESSAGE_TEMP
   *
   * @abatorgenerated Tue Aug 13 16:55:57 CST 2013
   */
  int countByExample(BnesMessageTempExample example) throws SQLException;

  /**
   * This method was generated by Abator for iBATIS. This method corresponds to the database table
   * BNES_MESSAGE_TEMP
   *
   * @abatorgenerated Tue Aug 13 16:55:57 CST 2013
   */
  int updateByExampleSelective(BnesMessageTemp record, BnesMessageTempExample example)
      throws SQLException;

  /**
   * This method was generated by Abator for iBATIS. This method corresponds to the database table
   * BNES_MESSAGE_TEMP
   *
   * @abatorgenerated Tue Aug 13 16:55:57 CST 2013
   */
  int updateByExample(BnesMessageTemp record, BnesMessageTempExample example) throws SQLException;
}
