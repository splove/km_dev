package com.pltfm.app.vobject;

import java.io.Serializable;
import java.util.List;

public class ViewProductSku implements Serializable {

    private Integer promotionId;
    private String brandName;
    private Integer promotion_product_id;
    private Integer product_sku_id;
    private String category;
    private List category_attr_value;
    /**
     * 产品图片集合
     **/
    private List<ProductImage> productImageList;
    /*
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.PRODUCT_ID
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private Integer productId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.PROCUCT_NAME
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private String procuctName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.PRODUCT_NO
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private String productNo;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.STATUS
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private String status;


    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.MARKET_PRICE
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private Integer marketPrice;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.COST_PRICE
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private Integer costPrice;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.CATEGORY_ID
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private Integer categoryId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.CATEGORY_NAME
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private String categoryName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.PRODUCT_SKU_ID
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private Integer productSkuId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.PRODUCT_SKU_CODE
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private String productSkuCode;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.PRICE
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private Double price;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.SKU_STATUS
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private String skuStatus;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.UNIT_WEIGHT
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private Integer unitWeight;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column VIEW_PRODUCT_SKU.MARK_PRICE
     *
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    private Double markPrice;

    private Double promotionPrice;


    public Double getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(Double promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.PRODUCT_ID
     *
     * @return the value of VIEW_PRODUCT_SKU.PRODUCT_ID
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.PRODUCT_ID
     *
     * @param productId the value for VIEW_PRODUCT_SKU.PRODUCT_ID
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.PROCUCT_NAME
     *
     * @return the value of VIEW_PRODUCT_SKU.PROCUCT_NAME
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public String getProcuctName() {
        return procuctName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.PROCUCT_NAME
     *
     * @param procuctName the value for VIEW_PRODUCT_SKU.PROCUCT_NAME
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setProcuctName(String procuctName) {
        this.procuctName = procuctName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.PRODUCT_NO
     *
     * @return the value of VIEW_PRODUCT_SKU.PRODUCT_NO
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.PRODUCT_NO
     *
     * @param productNo the value for VIEW_PRODUCT_SKU.PRODUCT_NO
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.STATUS
     *
     * @return the value of VIEW_PRODUCT_SKU.STATUS
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.STATUS
     *
     * @param status the value for VIEW_PRODUCT_SKU.STATUS
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.MARKET_PRICE
     *
     * @return the value of VIEW_PRODUCT_SKU.MARKET_PRICE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public Integer getMarketPrice() {
        return marketPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.MARKET_PRICE
     *
     * @param marketPrice the value for VIEW_PRODUCT_SKU.MARKET_PRICE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.COST_PRICE
     *
     * @return the value of VIEW_PRODUCT_SKU.COST_PRICE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public Integer getCostPrice() {
        return costPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.COST_PRICE
     *
     * @param costPrice the value for VIEW_PRODUCT_SKU.COST_PRICE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.CATEGORY_ID
     *
     * @return the value of VIEW_PRODUCT_SKU.CATEGORY_ID
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.CATEGORY_ID
     *
     * @param categoryId the value for VIEW_PRODUCT_SKU.CATEGORY_ID
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.CATEGORY_NAME
     *
     * @return the value of VIEW_PRODUCT_SKU.CATEGORY_NAME
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.CATEGORY_NAME
     *
     * @param categoryName the value for VIEW_PRODUCT_SKU.CATEGORY_NAME
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.PRODUCT_SKU_ID
     *
     * @return the value of VIEW_PRODUCT_SKU.PRODUCT_SKU_ID
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public Integer getProductSkuId() {
        return productSkuId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.PRODUCT_SKU_ID
     *
     * @param productSkuId the value for VIEW_PRODUCT_SKU.PRODUCT_SKU_ID
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setProductSkuId(Integer productSkuId) {
        this.productSkuId = productSkuId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.PRODUCT_SKU_CODE
     *
     * @return the value of VIEW_PRODUCT_SKU.PRODUCT_SKU_CODE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public String getProductSkuCode() {
        return productSkuCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.PRODUCT_SKU_CODE
     *
     * @param productSkuCode the value for VIEW_PRODUCT_SKU.PRODUCT_SKU_CODE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.PRICE
     *
     * @return the value of VIEW_PRODUCT_SKU.PRICE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.PRICE
     *
     * @param price the value for VIEW_PRODUCT_SKU.PRICE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.SKU_STATUS
     *
     * @return the value of VIEW_PRODUCT_SKU.SKU_STATUS
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public String getSkuStatus() {
        return skuStatus;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.SKU_STATUS
     *
     * @param skuStatus the value for VIEW_PRODUCT_SKU.SKU_STATUS
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.UNIT_WEIGHT
     *
     * @return the value of VIEW_PRODUCT_SKU.UNIT_WEIGHT
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public Integer getUnitWeight() {
        return unitWeight;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.UNIT_WEIGHT
     *
     * @param unitWeight the value for VIEW_PRODUCT_SKU.UNIT_WEIGHT
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setUnitWeight(Integer unitWeight) {
        this.unitWeight = unitWeight;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column VIEW_PRODUCT_SKU.MARK_PRICE
     *
     * @return the value of VIEW_PRODUCT_SKU.MARK_PRICE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public Double getMarkPrice() {
        return markPrice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column VIEW_PRODUCT_SKU.MARK_PRICE
     *
     * @param markPrice the value for VIEW_PRODUCT_SKU.MARK_PRICE
     * @abatorgenerated Thu Dec 26 18:07:38 CST 2013
     */
    public void setMarkPrice(Double markPrice) {
        this.markPrice = markPrice;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getPromotion_product_id() {
        return promotion_product_id;
    }

    public void setPromotion_product_id(Integer promotionProductId) {
        promotion_product_id = promotionProductId;
    }

    public Integer getProduct_sku_id() {
        return product_sku_id;
    }

    public void setProduct_sku_id(Integer productSkuId) {
        product_sku_id = productSkuId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<ProductImage> getProductImageList() {
        return productImageList;
    }

    public void setProductImageList(List<ProductImage> productImageList) {
        this.productImageList = productImageList;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List getCategory_attr_value() {
        return category_attr_value;
    }

    public void setCategory_attr_value(List categoryAttrValue) {
        category_attr_value = categoryAttrValue;
    }

}