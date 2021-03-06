package com.kmzyc.promotion.app.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.kmzyc.promotion.app.dao.BaseDao;
import com.kmzyc.promotion.app.dao.ProductStockDAO;
import com.kmzyc.promotion.app.vobject.CarryStockOutDetailVO;
import com.kmzyc.promotion.app.vobject.ProductStock;
import com.kmzyc.promotion.app.vobject.ProductStockExample;
import com.kmzyc.promotion.app.vobject.ProductStockPurchase;
import com.kmzyc.promotion.app.vobject.StockOutAndDetail;

@Repository("productStockDAO")
@SuppressWarnings({"unchecked", "unused"})
public class ProductStockDAOImpl extends BaseDao implements ProductStockDAO {

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public int countByExample(ProductStockExample example) throws SQLException {
    // mkw 20150819 add

    // end
    Integer count =
        (Integer) sqlMapClient.queryForObject("PRODUCT_STOCK.ibatorgenerated_countByExample",
            example);
    return count.intValue();
  }

  @Override
  public int countByExampleByProductTitle(ProductStockExample example) throws SQLException {
    // mkw 20150819 add

    // end
    Integer count =
        (Integer) sqlMapClient.queryForObject(
            "PRODUCT_STOCK.ibatorgenerated_countByExampleByProductTitle", example);
    return count.intValue();
  }

  @Override
  public int countByExampleForAlarm(ProductStockExample example) throws SQLException {
    // mkw 20150819 add

    // end
    Integer count =
        (Integer) sqlMapClient.queryForObject("PRODUCT_STOCK.ibatorgenerated_countByExample2",
            example);
    return count.intValue();
  }

  @Override
  public int countByExampleByUser(ProductStockExample example) throws SQLException {
    // mkw 20150819 add

    // end
    Integer count =
        (Integer) sqlMapClient.queryForObject("PRODUCT_STOCK.ibatorgenerated_countByExampleByUser",
            example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public int deleteByExample(ProductStockExample example) throws SQLException {
    // mkw 20150819 add

    // end
    int rows = sqlMapClient.delete("PRODUCT_STOCK.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public int deleteByPrimaryKey(Long stockId) throws SQLException {
    // mkw 20150819 add

    // end
    ProductStock key = new ProductStock();
    key.setStockId(stockId);
    int rows = sqlMapClient.delete("PRODUCT_STOCK.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public void insert(ProductStock record) throws SQLException {
    // mkw 20150819 add

    // end
    sqlMapClient.insert("PRODUCT_STOCK.ibatorgenerated_insert", record);
  }

  @Override
  public Long insertProductStock(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    return (Long) getSqlMapClientTemplate().insert("PRODUCT_STOCK.ibatorgenerated_insert", stock);

  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public void insertSelective(ProductStock record) throws SQLException {
    // mkw 20150819 add

    // end
    sqlMapClient.insert("PRODUCT_STOCK.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public List selectByExample(ProductStockExample example) throws SQLException {
    // mkw 20150819 add

    // end
    List list = sqlMapClient.queryForList("PRODUCT_STOCK.ibatorgenerated_selectByExample", example);
    return list;
  }

  public List selectByExampleByUser(ProductStockExample example) throws SQLException {
    // mkw 20150819 add

    // end
    List list =
        sqlMapClient.queryForList("PRODUCT_STOCK.ibatorgenerated_selectByExampleByUser", example);
    return list;
  }

  @Override
  public List selectByExample(ProductStockExample example, int skip, int max) throws SQLException {
    // mkw 20150819 add

    // end
    List list =
        sqlMapClient.queryForList("PRODUCT_STOCK.ibatorgenerated_selectByExample", example, skip,
            max);
    return list;
  }

  @Override
  public List selectByExampleByProductTitle(ProductStockExample example, int skip, int max)
      throws SQLException {
    // mkw 20150819 add

    // end
    List list =
        sqlMapClient.queryForList("PRODUCT_STOCK.ibatorgenerated_selectByExampleByProductTitle",
            example, skip, max);
    return list;
  }

  @Override
  public List selectByExampleForAlarm(ProductStockExample example, int skip, int max)
      throws SQLException {
    // mkw 20150819 add

    // end
    List list =
        sqlMapClient.queryForList("PRODUCT_STOCK.ibatorgenerated_selectByExample2", example, skip,
            max);
    return list;
  }

  @Override
  public List selectByExampleByUser(ProductStockExample example, int skip, int max)
      throws SQLException {
    // mkw 20150819 add

    // end
    List list =
        sqlMapClient.queryForList("PRODUCT_STOCK.ibatorgenerated_selectByExampleByUser", example,
            skip, max);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public ProductStock selectByPrimaryKey(Long stockId) throws SQLException {
    // mkw 20150819 add

    // end
    ProductStock key = new ProductStock();
    key.setStockId(stockId);
    ProductStock record =
        (ProductStock) sqlMapClient.queryForObject(
            "PRODUCT_STOCK.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public int updateByExampleSelective(ProductStock record, ProductStockExample example)
      throws SQLException {
    // mkw 20150819 add

    // end
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = sqlMapClient.update("PRODUCT_STOCK.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public int updateByExample(ProductStock record, ProductStockExample example) throws SQLException {
    // mkw 20150819 add

    // end
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = sqlMapClient.update("PRODUCT_STOCK.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public int updateByPrimaryKeySelective(ProductStock record) throws SQLException {
    // mkw 20150819 add

    // end
    int rows =
        sqlMapClient.update("PRODUCT_STOCK.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  @Override
  public int updateByPrimaryKey(ProductStock record) throws SQLException {
    // mkw 20150819 add

    // end
    int rows =
        sqlMapClient.update("PRODUCT_STOCK.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  @Override
  public int updateByPrimaryKey2(ProductStock record) throws SQLException {
    // mkw 20150819 add

    // end
    int rows =
        sqlMapClient.update("PRODUCT_STOCK.ibatorgenerated_updateByPrimaryKeySelective2", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table
   * PRODUCT_STOCK
   * 
   * @ibatorgenerated Mon Jul 29 10:50:35 CST 2013
   */
  private static class UpdateByExampleParms extends ProductStockExample {
    private final Object record;

    public UpdateByExampleParms(Object record, ProductStockExample example) {
      super(example);
      this.record = record;
    }

    public Object getRecord() {
      return record;
    }
  }

  @Override
  public List<ProductStock> checkProductStockBySku(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    List list =
        sqlMapClient.queryForList("PRODUCT_STOCK.ibatorgenerated_selectStockByStockId", stock);
    return list;
  }

  @Override
  public int increaseStockQuantity(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    int row = sqlMapClient.update("PRODUCT_STOCK.increaseProductStock", stock);
    return row;
  }

  @Override
  public int decreaseStockQuantity(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    int row = sqlMapClient.update("PRODUCT_STOCK.decreaseProductStock", stock);
    return row;
  }

  @Override
  public int increaseInTransitQuantity(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    int row = sqlMapClient.update("PRODUCT_STOCK.increaseInTransitQuantity", stock);
    return row;
  }

  @Override
  public int decreaseInTransitQuantity(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    int row = sqlMapClient.update("PRODUCT_STOCK.decreaseInTransitQuantity", stock);
    return row;
  }

  @Override
  public int increaseOrderQuantity(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    int row = sqlMapClient.update("PRODUCT_STOCK.increaseOrderQuantity", stock);
    return row;
  }

  @Override
  public int decreaseOrderQuantity(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    int row = sqlMapClient.update("PRODUCT_STOCK.decreaseOrderQuantity", stock);
    return row;
  }

  @Override
  public int batchUpdateForStock(String statementName, List<ProductStock> parameterList)
      throws SQLException {
    // mkw 20150819 add

    // end
    return super.batchUpdateData(statementName, parameterList);
  }

  @Override
  public int batchUpdateForStockPurchase(String statementName,
      List<ProductStockPurchase> parameterList) throws SQLException {
    // mkw 20150819 add

    // end
    return super.batchUpdateData(statementName, parameterList);
  }

  /**
   * 根据仓库和产品的skuId查询库存信息
   * 
   * @param warehouseId
   * @param product_sku_id
   * @return
   * @author luoyi
   * @throws Exception
   */
  @Override
  public ProductStock selectByWareAndSkuId(Long warehouseId, Long product_sku_id)
      throws SQLException {
    // mkw 20150819 add

    // end
    Map<String, Long> parmMap = new HashMap<String, Long>();
    parmMap.put("warehouseId", warehouseId);
    parmMap.put("productSkuId", product_sku_id);
    ProductStock productStock =
        (ProductStock) sqlMapClient.queryForObject("PRODUCT_STOCK.findProductStockByWareAndSkuId",
            parmMap);
    return productStock;
  }

  /**
   * 订单系统远程调用查询sku库存数量
   * 
   * @param stockList
   * @return
   * @throws SQLException
   */
  @Override
  public List<ProductStock> remoteSelectStockQuantity(List<ProductStock> stockList)
      throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.remoteSelectStockQuantity", stockList);
  }

  @Override
  public int batchAddForStock(List<ProductStock> parameterList) throws SQLException {
    // mkw 20150819 add

    // end
    return super.batchinsertNt(parameterList, "PRODUCT_STOCK.ibatorgenerated_insert");
  }

  @Override
  public List<ProductStock> selectProdcutStockList(List<Map<String, Long>> stockList)
      throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.selectProductStockList", stockList);
  }

  @Override
  public long checkStockByWarehouseList(List<ProductStock> stockList) throws SQLException {
    // mkw 20150819 add

    // end
    Long count =
        (Long) sqlMapClient.queryForObject("PRODUCT_STOCK.checkStockByWarehouseList", stockList);
    return count.longValue();
  }

  @Override
  public int batchIncreaseOrderQuantity(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.update("PRODUCT_STOCK.batchIncreaseOrderQuantity", stock);
  }

  @Override
  public Integer selectRemainQuantityBySkuId(Long skuId) throws SQLException {
    // mkw 20150819 add

    // end
    Integer quantity =
        (Integer) sqlMapClient.queryForObject("PRODUCT_STOCK.selectRemainQuantity", skuId);
    return quantity;
  }

  @Override
  public List<ProductStock> selectStockListBySkuId(Long skuId) throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.selectStockListBySkuId", skuId);
  }

  @Override
  public Map<Long, ProductStock> selectProdcutStockListByStockList(List<ProductStock> stockList)
      throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForMap("PRODUCT_STOCK.selectProdcutStockListByStockList", stockList,
        "stockId");
    // return
    // sqlMapClient.queryForList("PRODUCT_STOCK.selectProductStockList",stockList);
  }

  @Override
  public List<ProductStock> checkAvailableStockForLock(List<ProductStock> stockList)
      throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.checkAvailableStockForLock", stockList);
  }

  @Override
  public List<ProductStock> checkAvailableStockForUnLock(List<ProductStock> stockList)
      throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.checkAvailableStockForUnLock", stockList);
  }

  @Override
  public int batchDecreaseOrderQuantity(List<ProductStock> stockList) throws SQLException {
    // mkw 20150819 add

    // end
    return super.batchUpdateNt(stockList, "PRODUCT_STOCK.batchDecreaseOrderQuantity");
  }

  @Override
  public Long findProductSkuStockCountBySkuId(Long productSkuId) throws SQLException {
    // mkw 20150819 add

    // end
    Object obj = sqlMapClient.queryForObject("PRODUCT_STOCK.queryRealStockBySkuId", productSkuId);
    return obj == null ? null : (Long) obj;
  }

  @Override
  public List<ProductStock> checkStockOutForOrder(List<ProductStock> stockList) throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.checkStockOutForOrder", stockList);
  }

  @Override
  public List<ProductStock> checkStockOutForOther(List<ProductStock> stockList) throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.checkStockOutForOther", stockList);
  }

  /**
   * 根据仓库ID和skuCode查找库存集合
   * 
   * @param caOutDetailVOs
   * @return
   * @throws SQLException
   */
  @Override
  public List<ProductStock> findProductStockListByWarehouseSkuCode(
      List<CarryStockOutDetailVO> caOutDetailVOs) throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.findListByWareIdSkuCode", caOutDetailVOs);
  }

  @Override
  public Integer getProductStockCount(List<ProductStock> stockList) throws SQLException {
    // mkw 20150819 add

    // end
    return (Integer) sqlMapClient.queryForObject("PRODUCT_STOCK.getProductStockCount", stockList);
  }

  @Override
  public List<StockOutAndDetail> findStockIdMapByWarehouseAndSkuId(
      List<StockOutAndDetail> detailList) throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.findStockIdMapByWarehouseAndSkuId", detailList);
  }

  @Override
  public List<ProductStock> checkAvailableStockForLockForAfter(List<ProductStock> stockList)
      throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.checkAvailableStockForLockForAfter", stockList);
  }

  @Override
  public int batchIncreaseOrderQuantityForAfter(ProductStock stock) throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.update("PRODUCT_STOCK.batchIncreaseOrderQuantityForAfter", stock);
  }

  @Override
  public Map<Long, ProductStock> getProductStockMap(List<ProductStock> stockList)
      throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForMap("PRODUCT_STOCK.getProductStockList", stockList, "stockId");
  }

  @Override
  public List<ProductStock> getProductStockList(List<ProductStock> stockList) throws SQLException {
    // mkw 20150819 add

    // end
    return sqlMapClient.queryForList("PRODUCT_STOCK.getProductStockList", stockList);
  }

}
