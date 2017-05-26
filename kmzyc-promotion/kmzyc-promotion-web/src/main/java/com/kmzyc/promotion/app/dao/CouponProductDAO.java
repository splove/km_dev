package com.kmzyc.promotion.app.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import com.kmzyc.promotion.app.vobject.CouponProduct;
import com.kmzyc.promotion.app.vobject.CouponProductExample;

@SuppressWarnings("unchecked")
public interface CouponProductDAO {
	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	int countByExample(CouponProductExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	int deleteByExample(CouponProductExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	int deleteByPrimaryKey(BigDecimal couponProductId) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	void insert(CouponProduct record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	void insertSelective(CouponProduct record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	List selectByExample(CouponProductExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	CouponProduct selectByPrimaryKey(BigDecimal couponProductId) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	int updateByExampleSelective(CouponProduct record, CouponProductExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	int updateByExample(CouponProduct record, CouponProductExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	int updateByPrimaryKeySelective(CouponProduct record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table COUPON_PRODUCT
	 * 
	 * @ibatorgenerated Wed Aug 21 08:58:33 CST 2013
	 */
	int updateByPrimaryKey(CouponProduct record) throws SQLException;

	/**
	 * 根据couponId查找产品List
	 */
	public List<CouponProduct> selectByCouponId(Long couponId) throws SQLException;

	/**
	 * 根据couponId查找类别list
	 * 
	 * @param couponId
	 * @return
	 * @throws SQLException
	 */
	public List<CouponProduct> selectCateByCouponId(Long couponId) throws SQLException;

	/**
	 * 根据SKUCODE查询优惠券产品列表
	 * 
	 * @param skuCode
	 * @return
	 * @throws SQLException
	 */
	public List<CouponProduct> selectCouponProductBySkuId(String skuCode) throws SQLException;

	public List<String> selectRelationByCouponId(Long couponId) throws SQLException;

	List<String> selectCateRelationByCouponId(Long couponId) throws SQLException;

}