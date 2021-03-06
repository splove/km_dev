package com.pltfm.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pltfm.app.dao.BaseDAO;
import com.pltfm.app.dao.OrderPreferentialDAO;
import com.pltfm.app.entities.OrderPreferential;
import com.pltfm.app.entities.OrderPreferentialExample;

@SuppressWarnings("unchecked")
@Repository("orderPreferentialDAO")
public class OrderPreferentialDAOImpl extends BaseDAO implements OrderPreferentialDAO {
  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database table
   * KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  // private SqlMapClient sqlMapClient;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  // public OrderPreferentialDAOImpl(SqlMapClient sqlMapClient) {
  // super();
  // this.sqlMapClient = sqlMapClient;
  // }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public int countByExample(OrderPreferentialExample example) throws SQLException {
    Integer count =
        (Integer) sqlMapClient.queryForObject(
            "KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public int deleteByExample(OrderPreferentialExample example) throws SQLException {
    int rows =
        sqlMapClient.delete("KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public int deleteByPrimaryKey(long order_preferential_id) throws SQLException {
    OrderPreferential key = new OrderPreferential();
    key.setOrder_preferential_id(order_preferential_id);
    int rows =
        sqlMapClient.delete("KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void insert(OrderPreferential record) throws SQLException {
    sqlMapClient.insert("KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_insert", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public void insertSelective(OrderPreferential record) throws SQLException {
    sqlMapClient.insert("KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public List selectByExample(OrderPreferentialExample example) throws SQLException {
    List list =
        sqlMapClient.queryForList("KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_selectByExample",
            example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public OrderPreferential selectByPrimaryKey(long order_preferential_id) throws SQLException {
    OrderPreferential key = new OrderPreferential();
    key.setOrder_preferential_id(order_preferential_id);
    OrderPreferential record =
        (OrderPreferential) sqlMapClient.queryForObject(
            "KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public int updateByExampleSelective(OrderPreferential record, OrderPreferentialExample example)
      throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows =
        sqlMapClient.update("KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_updateByExampleSelective",
            parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public int updateByExample(OrderPreferential record, OrderPreferentialExample example)
      throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows =
        sqlMapClient.update("KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public int updateByPrimaryKeySelective(OrderPreferential record) throws SQLException {
    int rows =
        sqlMapClient.update(
            "KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  public int updateByPrimaryKey(OrderPreferential record) throws SQLException {
    int rows =
        sqlMapClient
            .update("KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table
   * KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  private static class UpdateByExampleParms extends OrderPreferentialExample {
    private static final long serialVersionUID = 1L;
    private Object record;

    public UpdateByExampleParms(Object record, OrderPreferentialExample example) {
      super(example);
      this.record = record;
    }

    @SuppressWarnings("unused")
    public Object getRecord() {
      return record;
    }
  }

  @Override
  public void insertList(List<OrderPreferential> records) throws SQLException {
    super.batchInsertData("KMORDER_ORDER_PREFERENTIAL.ibatorgenerated_insert", records);

  }

  public List<OrderPreferential> getPreferentialNoByOrderCode(OrderPreferential op)
      throws SQLException {
    return sqlMapClient.queryForList("KMORDER_ORDER_PREFERENTIAL.getPreferentialByOrderCode", op);
  }

  public Long queryCouponGrantByCounponGrantId(Long couponGrantId) throws SQLException {
    return (Long) sqlMapClient.queryForObject(
        "KMORDER_ORDER_PREFERENTIAL.queryCouponGrantByCouponGrantId", couponGrantId);
  }

}
