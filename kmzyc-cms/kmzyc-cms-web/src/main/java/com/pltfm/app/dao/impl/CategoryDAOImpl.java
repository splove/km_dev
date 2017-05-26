package com.pltfm.app.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.pltfm.app.dao.CategoryDAO;
import com.pltfm.app.vobject.Category;
import com.pltfm.app.vobject.CategoryDetailInfo;
import com.pltfm.app.vobject.CategoryExample;

import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

@Component(value = "categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
    @Resource(name = "sqlMapClient")
    private SqlMapClient sqlMapClient;


    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public void insert(Category record) throws SQLException {
        sqlMapClient.insert("CATEGORY.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public int updateByPrimaryKey(Category record) throws SQLException {
        int rows = sqlMapClient.update("CATEGORY.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public int updateByPrimaryKeySelective(Category record) throws SQLException {
        int rows = sqlMapClient.update("CATEGORY.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public List selectByExample(CategoryExample example) throws SQLException {
        List list = sqlMapClient.queryForList("CATEGORY.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public Category selectByPrimaryKey(Integer categoryId) throws SQLException {
        Category key = new Category();
        key.setCategoryId(categoryId);
        Category record = (Category) sqlMapClient.queryForObject("CATEGORY.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public int deleteByExample(CategoryExample example) throws SQLException {
        int rows = sqlMapClient.delete("CATEGORY.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public int deleteByPrimaryKey(Integer categoryId) throws SQLException {
        Category key = new Category();
        key.setCategoryId(categoryId);
        int rows = sqlMapClient.delete("CATEGORY.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public int countByExample(CategoryExample example) throws SQLException {
        Integer count = (Integer) sqlMapClient.queryForObject("CATEGORY.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public int updateByExampleSelective(Category record, CategoryExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("CATEGORY.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    public int updateByExample(Category record, CategoryExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("CATEGORY.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table CATEGORY
     *
     * @abatorgenerated Fri Sep 06 16:24:19 CST 2013
     */
    private static class UpdateByExampleParms extends CategoryExample {
        private Object record;

        public UpdateByExampleParms(Object record, CategoryExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

    //所有商品父类
    public List selectCategoryParent(String categoryIds) throws SQLException {
        return sqlMapClient.queryForList("CATEGORY.abatorgenerated_selectCategoryParent", categoryIds);
    }

    /**
     * 按层级查询全部的物理类目
     */
    @Override
    public List queryCategoryList(Category category) throws SQLException {
        return sqlMapClient.queryForList("CATEGORY.queryCategoryList", category);
    }

    /**
     * 按层级查询全部的运营类目
     */
    @Override
    public List queryCategoryPhyList(Category category) throws SQLException {
        return sqlMapClient.queryForList("CATEGORY.queryCategoryPhyList", category);
    }

    /**
     * 通过产品主键查询产品所属类目信息
     *
     * @param productId 产品主键信息
     * @return 产品所属类目信息
     * @throws Exception 异常信息
     */
    public CategoryDetailInfo selectByProductId(Integer productId) throws Exception {
        CategoryDetailInfo record = (CategoryDetailInfo) sqlMapClient.queryForObject("CATEGORY.iabatorgenerated_selectCategoryByProductId", productId);
        return record;
    }

    /**
     * 查询三级物理类目
     */
    @Override
    public List querySubCategory() throws SQLException {
        return sqlMapClient.queryForList("CATEGORY.querySubCategory");
    }


    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }

    public void setSqlMapClient(SqlMapClient sqlMapClient) {
        this.sqlMapClient = sqlMapClient;
    }


}