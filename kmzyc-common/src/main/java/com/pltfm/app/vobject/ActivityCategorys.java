package com.pltfm.app.vobject;

import java.io.Serializable;


public class ActivityCategorys implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5926711748934474347L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ACTIVITY_CATEGORYS.ACTIVITY_BRAND_ID
     *
     * @ibatorgenerated Thu Mar 17 15:14:49 CST 2016
     */
    private Long activityCategoryId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ACTIVITY_CATEGORYS.ACTIVITY_ID
     *
     * @ibatorgenerated Thu Mar 17 15:14:49 CST 2016
     */
    private Long activityId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column ACTIVITY_CATEGORYS.CATEGORY_ID
     *
     * @ibatorgenerated Thu Mar 17 15:14:49 CST 2016
     */
    private Long categoryId;
    
    private String categoryName;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ACTIVITY_CATEGORYS.ACTIVITY_BRAND_ID
     *
     * @return the value of ACTIVITY_CATEGORYS.ACTIVITY_BRAND_ID
     *
     * @ibatorgenerated Thu Mar 17 15:14:49 CST 2016
     */
    public Long getActivityCategoryId() {
        return activityCategoryId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ACTIVITY_CATEGORYS.ACTIVITY_BRAND_ID
     *
     * @param activityBrandId the value for ACTIVITY_CATEGORYS.ACTIVITY_BRAND_ID
     *
     * @ibatorgenerated Thu Mar 17 15:14:49 CST 2016
     */
    public void setActivityCategoryId(Long activityCategoryId) {
        this.activityCategoryId = activityCategoryId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ACTIVITY_CATEGORYS.ACTIVITY_ID
     *
     * @return the value of ACTIVITY_CATEGORYS.ACTIVITY_ID
     *
     * @ibatorgenerated Thu Mar 17 15:14:49 CST 2016
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ACTIVITY_CATEGORYS.ACTIVITY_ID
     *
     * @param activityId the value for ACTIVITY_CATEGORYS.ACTIVITY_ID
     *
     * @ibatorgenerated Thu Mar 17 15:14:49 CST 2016
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column ACTIVITY_CATEGORYS.CATEGORY_ID
     *
     * @return the value of ACTIVITY_CATEGORYS.CATEGORY_ID
     *
     * @ibatorgenerated Thu Mar 17 15:14:49 CST 2016
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column ACTIVITY_CATEGORYS.CATEGORY_ID
     *
     * @param categoryId the value for ACTIVITY_CATEGORYS.CATEGORY_ID
     *
     * @ibatorgenerated Thu Mar 17 15:14:49 CST 2016
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}