package com.kmzyc.promotion.app.vobject;

import java.io.Serializable;
import java.math.BigDecimal;

public class PromotionRuleData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7937799512113355294L;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column PROMOTION_RULE_DATA.PROMOTION_RULE_DATA_ID
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	private Long promotionRuleDataId;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column PROMOTION_RULE_DATA.PROMOTION_RULE_ID
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	private Long promotionId;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column PROMOTION_RULE_DATA.MEET_DATA
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	private BigDecimal meetData;
	
	private BigDecimal maxMeetData;

	public BigDecimal getMaxMeetData() {
		return maxMeetData;
	}

	public void setMaxMeetData(BigDecimal maxMeetData) {
		this.maxMeetData = maxMeetData;
	}

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column PROMOTION_RULE_DATA.MEET_DATA_TYPE
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	private Integer meetDataType;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column PROMOTION_RULE_DATA.PRIZE_DATA
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	private String prizeData;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column PROMOTION_RULE_DATA.PRIZE_DATA_TYPE
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	// 1：减免金额；2：折扣率；3：优惠券ID
	private Integer prizeDataType;
	private String prizeName;

	public String getPrizeName() {
		return this.prizeName;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column
	 * PROMOTION_RULE_DATA.PROMOTION_RULE_DATA_ID
	 * 
	 * @return the value of PROMOTION_RULE_DATA.PROMOTION_RULE_DATA_ID
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	public Long getPromotionRuleDataId() {
		return promotionRuleDataId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column PROMOTION_RULE_DATA.PROMOTION_RULE_DATA_ID
	 * 
	 * @param promotionRuleDataId
	 *            the value for PROMOTION_RULE_DATA.PROMOTION_RULE_DATA_ID
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	public void setPromotionRuleDataId(Long promotionRuleDataId) {
		this.promotionRuleDataId = promotionRuleDataId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column PROMOTION_RULE_DATA.MEET_DATA
	 * 
	 * @return the value of PROMOTION_RULE_DATA.MEET_DATA
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	public BigDecimal getMeetData() {
		return meetData;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column PROMOTION_RULE_DATA.MEET_DATA
	 * 
	 * @param meetData
	 *            the value for PROMOTION_RULE_DATA.MEET_DATA
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	public void setMeetData(BigDecimal meetData) {
		this.meetData = meetData;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column PROMOTION_RULE_DATA.MEET_DATA_TYPE
	 * 
	 * @return the value of PROMOTION_RULE_DATA.MEET_DATA_TYPE
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	/**
	 * 1：金额，2：数量 <br>
	 * 默认为1
	 */
	public Integer getMeetDataType() {
		return meetDataType;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column PROMOTION_RULE_DATA.MEET_DATA_TYPE
	 * 
	 * @param meetDataType
	 *            the value for PROMOTION_RULE_DATA.MEET_DATA_TYPE
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	/**
	 * 1：金额，2：数量 <br>
	 * 默认为1
	 */
	public void setMeetDataType(Integer meetDataType) {
		this.meetDataType = meetDataType;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column PROMOTION_RULE_DATA.PRIZE_DATA
	 * 
	 * @return the value of PROMOTION_RULE_DATA.PRIZE_DATA
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	public String getPrizeData() {
		return prizeData;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column PROMOTION_RULE_DATA.PRIZE_DATA
	 * 
	 * @param prizeData
	 *            the value for PROMOTION_RULE_DATA.PRIZE_DATA
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */
	public void setPrizeData(String prizeData) {
		this.prizeData = prizeData;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column PROMOTION_RULE_DATA.PRIZE_DATA_TYPE
	 * 
	 * @return the value of PROMOTION_RULE_DATA.PRIZE_DATA_TYPE
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */

	public Integer getPrizeDataType() {
		return prizeDataType;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column PROMOTION_RULE_DATA.PRIZE_DATA_TYPE
	 * 
	 * @param prizeDataType
	 *            the value for PROMOTION_RULE_DATA.PRIZE_DATA_TYPE
	 * 
	 * @ibatorgenerated Wed Sep 18 15:39:29 CST 2013
	 */

	public void setPrizeDataType(Integer prizeDataType) {
		this.prizeDataType = prizeDataType;
	}

	public Long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}

	private Long entityId;
	private Integer num1;
	private Integer num2;
	private Integer num3;

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	/** 赠品加价购商品可以选择的个数 */
	public Integer getNum1() {
		return num1;
	}

	/** 赠品加价购商品可以选择的个数 */
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	public Integer getNum3() {
		return num3;
	}

	public void setNum3(Integer num3) {
		this.num3 = num3;
	}

}