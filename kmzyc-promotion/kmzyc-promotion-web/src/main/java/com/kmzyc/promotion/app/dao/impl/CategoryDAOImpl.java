package com.kmzyc.promotion.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.kmzyc.promotion.app.dao.CategoryDAO;
import com.kmzyc.promotion.app.vobject.Category;
import com.kmzyc.promotion.app.vobject.CategoryExample;

@Repository("categoryDAO")
@SuppressWarnings({"unchecked", "unused"})
public class CategoryDAOImpl implements CategoryDAO {
  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database table
   * CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Resource
  private SqlMapClient sqlMapClient;

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public int countByExample(CategoryExample example) throws SQLException {
    Integer count =
        (Integer) sqlMapClient.queryForObject("CATEGORY.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public int deleteByExample(CategoryExample example) throws SQLException {
    int rows = sqlMapClient.delete("CATEGORY.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public int deleteByPrimaryKey(Long categoryId) throws SQLException {
    Category key = new Category();
    key.setCategoryId(categoryId);
    int rows = sqlMapClient.delete("CATEGORY.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public void insert(Category record) throws SQLException {
    sqlMapClient.insert("CATEGORY.ibatorgenerated_insert", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public void insertSelective(Category record) throws SQLException {
    sqlMapClient.insert("CATEGORY.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public List selectByExample(CategoryExample example) throws SQLException {
    List list = sqlMapClient.queryForList("CATEGORY.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public Category selectByPrimaryKey(Long categoryId) throws SQLException {
    Category key = new Category();
    key.setCategoryId(categoryId);
    Category record =
        (Category) sqlMapClient.queryForObject("CATEGORY.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public int updateByExampleSelective(Category record, CategoryExample example)
      throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = sqlMapClient.update("CATEGORY.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public int updateByExample(Category record, CategoryExample example) throws SQLException {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = sqlMapClient.update("CATEGORY.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public int updateByPrimaryKeySelective(Category record) throws SQLException {
    int rows = sqlMapClient.update("CATEGORY.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public int updateByPrimaryKey(Category record) throws SQLException {
    int rows = sqlMapClient.update("CATEGORY.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public List<Category> queryCategoryList(Category category) throws SQLException {
    List<Category> list = sqlMapClient.queryForList("CATEGORY.queryCategoryList", category);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public int deleteCategory(Category record) throws SQLException {
    int rows = sqlMapClient.update("CATEGORY.deleteCategory", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  @Override
  public List<Category> queryCategoryParentList(Category category) throws SQLException {
    List<Category> list = sqlMapClient.queryForList("CATEGORY.queryCategoryParentList", category);
    return list;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table
   * CATEGORY
   * 
   * @ibatorgenerated Wed Jul 17 17:51:35 CST 2013
   */
  private static class UpdateByExampleParms extends CategoryExample {
    private final Object record;

    public UpdateByExampleParms(Object record, CategoryExample example) {
      super(example);
      this.record = record;
    }

    public Object getRecord() {
      return record;
    }
  }

  @Override
  public List<Category> queryCanUpShelfCategoryList(Category category) throws SQLException {
    List<Category> list =
        sqlMapClient.queryForList("CATEGORY.queryCanUpShelfCategoryList", category);
    return list;
  }

  @Override
  public String queryMaxCategoryNoByParentId(Long parentId) throws SQLException {
    Object obj = sqlMapClient.queryForObject("CATEGORY.queryMaxCategoryNoByParentId", parentId);

    return obj == null ? null : obj.toString();
  }

  @Override
  public int queryRepeatName(Category record) throws SQLException {
    return (Integer) sqlMapClient.queryForObject("CATEGORY.queryRepeatName", record);
  }

  @Override
  public List<String> findIsRelationCateId(Long categoryId) throws SQLException {
    return sqlMapClient.queryForList("CATEGORY.isRelationCateId", categoryId);
  }

  @Override
  public int relationDelete(Long categoryId) throws SQLException {
    return sqlMapClient.delete("CATEGORY.relationDelete", categoryId);
  }

  @Override
  public List<Category> findSomePhyCategorys() throws SQLException {
    return sqlMapClient.queryForList("CATEGORY.findSomePhyCategorys");
  }

  @Override
  public List<Category> queryCategoryParentListOrderByParent(Category record) throws SQLException {
    List<Category> list =
        sqlMapClient.queryForList("CATEGORY.queryCategoryListOrderByParent", record);
    return list;
  }

  /**
   * 根据三级类目查询出一级类目的id
   * 
   * @param categoryId
   * @return
   * @throws SQLException
   */
  @Override
  public Category findCategorysId(Long categoryId) throws SQLException {
    Category record = (Category) sqlMapClient
        .queryForObject("CATEGORY.ibatorgenerated_selectByCategoryId", categoryId);
    return record;
  }

  /**
   * s 批量查询类目
   * 
   * @param categoryIds
   * @return
   * @throws SQLException
   */
  @Override
  public List<Category> queryBatchCategory(List<Long> categoryIds) throws SQLException {
    return sqlMapClient.queryForList("CATEGORY.SQL_QUERY_BATCH_CATEGORY_NAME_BY_ID", categoryIds);
  }
}