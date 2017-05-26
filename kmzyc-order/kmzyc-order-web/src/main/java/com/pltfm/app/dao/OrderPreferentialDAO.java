package com.pltfm.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.pltfm.app.entities.OrderPreferential;
import com.pltfm.app.entities.OrderPreferentialExample;

@SuppressWarnings("unchecked")
public interface OrderPreferentialDAO {
  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int countByExample(OrderPreferentialExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int deleteByExample(OrderPreferentialExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int deleteByPrimaryKey(long order_preferential_id) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  void insert(OrderPreferential record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  void insertSelective(OrderPreferential record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  List selectByExample(OrderPreferentialExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  OrderPreferential selectByPrimaryKey(long order_preferential_id) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int updateByExampleSelective(OrderPreferential record, OrderPreferentialExample example)
      throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int updateByExample(OrderPreferential record, OrderPreferentialExample example)
      throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int updateByPrimaryKeySelective(OrderPreferential record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.ORDER_PREFERENTIAL
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int updateByPrimaryKey(OrderPreferential record) throws SQLException;

  /**
   * 批量插入
   * 
   * @param records
   * @throws SQLException
   */
  void insertList(List<OrderPreferential> records) throws SQLException;

  public List<OrderPreferential> getPreferentialNoByOrderCode(OrderPreferential op)
      throws SQLException;

  public Long queryCouponGrantByCounponGrantId(Long couponGrantId) throws SQLException;

}