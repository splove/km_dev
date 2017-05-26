package com.pltfm.app.fobject;

import java.util.Date;

public class CategoryForm {
    /**
     * 类目ID
     */
    private Integer categoryId;

    /**
     * 父类目ID
     */
    private Integer parentId;

    /**
     * 类目编码
     */
    private Integer categoryCode;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 类目状态
     */
    private String status;

    /**
     * 排序
     */
    private Integer sortno;

    /**
     * 类目描述
     */
    private String categoryDesc;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifTime;

    /**
     * 修改人
     */
    private Integer modifUser;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 执行SQL
     */
    private String execSql;

    /**
     * 物理类目标识
     */
    private Short isPhy;
    
    /**
     * 父类目名称
     */
    private String parentName;
    
    /**
     * 类目ID字符串
     */
    private String categoryIds;
    public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	/**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.CATEGORY_ID
     *
     * @return the value of CATEGORY.CATEGORY_ID
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.CATEGORY_ID
     *
     * @param categoryId the value for CATEGORY.CATEGORY_ID
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.PARENT_ID
     *
     * @return the value of CATEGORY.PARENT_ID
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.PARENT_ID
     *
     * @param parentId the value for CATEGORY.PARENT_ID
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.CATEGORY_CODE
     *
     * @return the value of CATEGORY.CATEGORY_CODE
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public Integer getCategoryCode() {
        return categoryCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.CATEGORY_CODE
     *
     * @param categoryCode the value for CATEGORY.CATEGORY_CODE
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.CATEGORY_NAME
     *
     * @return the value of CATEGORY.CATEGORY_NAME
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.CATEGORY_NAME
     *
     * @param categoryName the value for CATEGORY.CATEGORY_NAME
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.STATUS
     *
     * @return the value of CATEGORY.STATUS
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.STATUS
     *
     * @param status the value for CATEGORY.STATUS
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.SORTNO
     *
     * @return the value of CATEGORY.SORTNO
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public Integer getSortno() {
        return sortno;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.SORTNO
     *
     * @param sortno the value for CATEGORY.SORTNO
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.CATEGORY_DESC
     *
     * @return the value of CATEGORY.CATEGORY_DESC
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public String getCategoryDesc() {
        return categoryDesc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.CATEGORY_DESC
     *
     * @param categoryDesc the value for CATEGORY.CATEGORY_DESC
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.CREATE_TIME
     *
     * @return the value of CATEGORY.CREATE_TIME
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.CREATE_TIME
     *
     * @param createTime the value for CATEGORY.CREATE_TIME
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.MODIF_TIME
     *
     * @return the value of CATEGORY.MODIF_TIME
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public Date getModifTime() {
        return modifTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.MODIF_TIME
     *
     * @param modifTime the value for CATEGORY.MODIF_TIME
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setModifTime(Date modifTime) {
        this.modifTime = modifTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.MODIF_USER
     *
     * @return the value of CATEGORY.MODIF_USER
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public Integer getModifUser() {
        return modifUser;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.MODIF_USER
     *
     * @param modifUser the value for CATEGORY.MODIF_USER
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setModifUser(Integer modifUser) {
        this.modifUser = modifUser;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.CHANNEL
     *
     * @return the value of CATEGORY.CHANNEL
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.CHANNEL
     *
     * @param channel the value for CATEGORY.CHANNEL
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.EXEC_SQL
     *
     * @return the value of CATEGORY.EXEC_SQL
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public String getExecSql() {
        return execSql;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.EXEC_SQL
     *
     * @param execSql the value for CATEGORY.EXEC_SQL
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setExecSql(String execSql) {
        this.execSql = execSql;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column CATEGORY.IS_PHY
     *
     * @return the value of CATEGORY.IS_PHY
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public Short getIsPhy() {
        return isPhy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column CATEGORY.IS_PHY
     *
     * @param isPhy the value for CATEGORY.IS_PHY
     *
     * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
     */
    public void setIsPhy(Short isPhy) {
        this.isPhy = isPhy;
    }

	public String getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(String categoryIds) {
		this.categoryIds = categoryIds;
	}
}