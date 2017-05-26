package com.kmzyc.promotion.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.kmzyc.promotion.app.vobject.PromotionAttr;
import com.kmzyc.promotion.app.vobject.PromotionAttrExample;

@SuppressWarnings("unchecked")
public interface PromotionAttrDAO {
	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:23 CST 2013
	 */
	int countByExample(PromotionAttrExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:23 CST 2013
	 */
	int deleteByExample(PromotionAttrExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:24 CST 2013
	 */
	int deleteByPrimaryKey(Long promotionAttrId) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:24 CST 2013
	 */
	void insert(PromotionAttr record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:24 CST 2013
	 */
	Long insertSelective(PromotionAttr record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:24 CST 2013
	 */
	List selectByExample(PromotionAttrExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:24 CST 2013
	 */
	PromotionAttr selectByPrimaryKey(Long promotionAttrId) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:24 CST 2013
	 */
	int updateByExampleSelective(PromotionAttr record, PromotionAttrExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:24 CST 2013
	 */
	int updateByExample(PromotionAttr record, PromotionAttrExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:24 CST 2013
	 */
	int updateByPrimaryKeySelective(PromotionAttr record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table PROMOTION_ATTR
	 * 
	 * @ibatorgenerated Tue Sep 03 14:16:24 CST 2013
	 */
	int updateByPrimaryKey(PromotionAttr record) throws SQLException;
}