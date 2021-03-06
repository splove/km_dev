package com.pltfm.app.vobject;

import java.io.Serializable;


public class PromotionType implements Serializable {
    private static final long serialVersionUID = -5640622151082433959L;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column PROMOTION_TYPE.PROMOTION_TYPE_ID
     *
     * @abatorgenerated Wed Sep 04 16:24:05 CST 2013
     */
    private Integer promotionTypeId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column PROMOTION_TYPE.PROMOTION_TYPE_NAME
     *
     * @abatorgenerated Wed Sep 04 16:24:05 CST 2013
     */
    private String promotionTypeName;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column PROMOTION_TYPE.PROMOTION_TYPE_ID
     *
     * @return the value of PROMOTION_TYPE.PROMOTION_TYPE_ID
     * @abatorgenerated Wed Sep 04 16:24:05 CST 2013
     */
    public Integer getPromotionTypeId() {
        return promotionTypeId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column PROMOTION_TYPE.PROMOTION_TYPE_ID
     *
     * @param promotionTypeId the value for PROMOTION_TYPE.PROMOTION_TYPE_ID
     * @abatorgenerated Wed Sep 04 16:24:05 CST 2013
     */
    public void setPromotionTypeId(Integer promotionTypeId) {
        this.promotionTypeId = promotionTypeId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column PROMOTION_TYPE.PROMOTION_TYPE_NAME
     *
     * @return the value of PROMOTION_TYPE.PROMOTION_TYPE_NAME
     * @abatorgenerated Wed Sep 04 16:24:05 CST 2013
     */
    public String getPromotionTypeName() {
        return promotionTypeName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column PROMOTION_TYPE.PROMOTION_TYPE_NAME
     *
     * @param promotionTypeName the value for PROMOTION_TYPE.PROMOTION_TYPE_NAME
     * @abatorgenerated Wed Sep 04 16:24:05 CST 2013
     */
    public void setPromotionTypeName(String promotionTypeName) {
        this.promotionTypeName = promotionTypeName;
    }
}