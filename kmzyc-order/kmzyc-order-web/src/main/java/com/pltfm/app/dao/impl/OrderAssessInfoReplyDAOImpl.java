package com.pltfm.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pltfm.app.dao.BaseDAO;
import com.pltfm.app.dao.OrderAssessInfoReplyDAO;
import com.pltfm.app.entities.OrderAssessInfoReply;
import com.pltfm.app.entities.OrderAssessInfoReplyExample;

@SuppressWarnings("unchecked")
@Repository("orderAssessInfoReplyDAO")
public class OrderAssessInfoReplyDAOImpl extends BaseDAO implements OrderAssessInfoReplyDAO {

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public int countByExample(OrderAssessInfoReplyExample example) throws SQLException {
    Integer count =
        (Integer) sqlMapClient.queryForObject(
            "KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public int deleteByExample(OrderAssessInfoReplyExample example) throws SQLException {
    int rows =
        sqlMapClient.delete("KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_deleteByExample",
            example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public int deleteByPrimaryKey(Long replyId) throws SQLException {
    OrderAssessInfoReply key = new OrderAssessInfoReply();
    key.setReplyId(replyId);
    int rows =
        sqlMapClient.delete("KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_deleteByPrimaryKey",
            key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public Long insert(OrderAssessInfoReply record) throws SQLException {
    Object newKey =
        sqlMapClient.insert("KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_insert", record);
    return (Long) newKey;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public Long insertSelective(OrderAssessInfoReply record) throws SQLException {
    Object newKey =
        sqlMapClient.insert("KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_insertSelective",
            record);
    return (Long) newKey;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public List selectByExample(OrderAssessInfoReplyExample example) throws SQLException {
    List list =
        sqlMapClient.queryForList(
            "KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * 回复信息的查询
   * 
   * @param map
   * @return
   * @throws SQLException
   */
  public List selectByOrderAssessInfoId(Long assessInfoId) throws SQLException {

    OrderAssessInfoReply key = new OrderAssessInfoReply();
    key.setAssessInfoId(assessInfoId);

    List list =
        (List) sqlMapClient.queryForList(
            "KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_selectByAssessInfoId", key);
    // OrderAssessInfoReply record =
    // (OrderAssessInfoReply)sqlMapClient.queryForObject("KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_selectByAssessInfoId",
    // key);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public OrderAssessInfoReply selectByPrimaryKey(Long replyId) throws SQLException {
    OrderAssessInfoReply key = new OrderAssessInfoReply();
    key.setReplyId(replyId);
    OrderAssessInfoReply record =
        (OrderAssessInfoReply) sqlMapClient.queryForObject(
            "KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public int updateByExampleSelective(OrderAssessInfoReply record,
      OrderAssessInfoReplyExample example) throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows =
        sqlMapClient.update(
            "KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public int updateByExample(OrderAssessInfoReply record, OrderAssessInfoReplyExample example)
      throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows =
        sqlMapClient.update("KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_updateByExample",
            parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public int updateByPrimaryKeySelective(OrderAssessInfoReply record) throws SQLException {
    int rows =
        sqlMapClient.update(
            "KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  public int updateByPrimaryKey(OrderAssessInfoReply record) throws SQLException {
    int rows =
        sqlMapClient.update("KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_updateByPrimaryKey",
            record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table
   * KMORDER.ORDER_ASSESS_INFO_REPLY
   * 
   * @ibatorgenerated Thu Aug 15 16:02:11 CST 2013
   */
  private static class UpdateByExampleParms extends OrderAssessInfoReplyExample {
    private static final long serialVersionUID = 1L;
    private Object record;

    public UpdateByExampleParms(Object record, OrderAssessInfoReplyExample example) {
      super(example);
      this.record = record;
    }

    @SuppressWarnings("unused")
    public Object getRecord() {
      return record;
    }
  }

  @Override
  public int countByAssessInfoId(Long assessInfoId) throws SQLException {
    OrderAssessInfoReply key = new OrderAssessInfoReply();
    key.setAssessInfoId(assessInfoId);
    return (Integer) sqlMapClient.queryForObject(
        "KMORDER_ORDER_ASSESS_INFO_REPLY.ibatorgenerated_countByAssessInfoId", key);

  }
}
