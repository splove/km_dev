package com.pltfm.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.pltfm.app.entities.InvoiceItem;
import com.pltfm.app.entities.InvoiceItemExample;

@SuppressWarnings("unchecked")
public interface InvoiceItemDAO {
  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_ITEM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int countByExample(InvoiceItemExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_ITEM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int deleteByExample(InvoiceItemExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_ITEM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  Long insert(InvoiceItem record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_ITEM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  Long insertSelective(InvoiceItem record) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_ITEM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  List selectByExample(InvoiceItemExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_ITEM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int updateByExampleSelective(InvoiceItem record, InvoiceItemExample example) throws SQLException;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table KMORDER.INVOICE_ITEM
   * 
   * @ibatorgenerated Mon Jul 29 11:23:58 CST 2013
   */
  int updateByExample(InvoiceItem record, InvoiceItemExample example) throws SQLException;
}