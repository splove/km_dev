package com.kmzyc.promotion.app.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.kmzyc.commons.page.Page;
import com.kmzyc.promotion.app.vobject.CarryStockOutDetailVO;
import com.kmzyc.promotion.app.vobject.ProductAndSku;
import com.kmzyc.promotion.app.vobject.ProductPrice;
import com.kmzyc.promotion.app.vobject.ProductSku;
import com.kmzyc.promotion.app.vobject.ProductSkuExample;

@SuppressWarnings("unchecked")
public interface ProductSkuDAO {

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    int countByExample(ProductSkuExample example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    int deleteByExample(ProductSkuExample example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    int deleteByPrimaryKey(Long productSkuId) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    void insert(ProductSku record) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    void insertSelective(ProductSku record) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    List selectByExample(ProductSkuExample example) throws SQLException;

    List selectByExample(ProductSkuExample skuExample, int pageNo, int pageSize)
            throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    ProductSku selectByPrimaryKey(Long productSkuId) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    int updateByExampleSelective(ProductSku record, ProductSkuExample example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    int updateByExample(ProductSku record, ProductSkuExample example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    int updateByPrimaryKeySelective(ProductSku record) throws SQLException;

    void updateBatch(List<ProductSku> productSkus) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database
     * table PRODUCT_SKU
     * 
     * @ibatorgenerated Thu Aug 01 14:41:16 CST 2013
     */
    int updateByPrimaryKey(ProductSku record) throws SQLException;

    /**
     * 根据SKU，查找商品信息Dao
     */
    public abstract Map<Long, ProductAndSku> findProduct(String productSkuId);

    /**
     * 获取产品SKU信息列表
     * 
     * @param page 分页对象
     * @param vo 产品SKU信息实体
     * @return 分页信息列表
     * @throws Exception 异常
     */
    public Page selectPageByVo(Page page, ProductSku vo) throws SQLException;

    /**
     * 找寻最大的SKU编号
     * 
     * @param cateCode
     * @return
     * @throws SQLException
     */
    public String findMaxSkuCodeByCateCode(String cateCode) throws SQLException;

    int updateSkuByProductSkuIdBatch(List list) throws SQLException;

    /**
     * @author ljh
     * @param skuCode 根据一个产品的skuCode 查询出 同一品牌 同一类别下的skuCode 集合出来
     * @return
     * @throws Exception
     */

    public List<String> selectSkuCodeListByCategoryBrandBySkucode(ProductSku sku) throws Exception;

    /**
     * @author ljh
     * @param sku 根据一个产品的skuCode 查询出同一类别下的skuCode 出来
     * @return
     * @throws Exception
     */

    public List<String> selectSkuCodeListByCategory(ProductSku sku) throws Exception;

    /**
     * 根据一个产品 查出同一个价位 的 同一类别下的skuCode 出来
     * 
     * @param sku
     * @return
     * @throws Exception
     */

    public List<String> selectSkuCodeListByPriceStatus(Map sku) throws Exception;

    /**
     * 根据skuCode 查询出productSku 对象
     * 
     * @param sku
     * @return
     * @throws Exception
     */

    public ProductSku selectProductSkuBySkucode(ProductSku sku) throws Exception;

    /**
     * 更新SKU商品重量
     * 
     * @param sku
     * @throws Exception
     */
    public void updateUnitWeightByPrimaryKey(List<ProductSku> productSkus) throws Exception;

    /**
     * 根据传递进来的包含categoryId 的list 查询出所有的其类别下所有的skuCode集合
     * 
     * @param categoryIdList
     * @return
     * @throws Exception
     */
    public List<String> selectSkuCodeByManyCategory(List<Long> categoryIdList) throws Exception;

    /**
     * 根据产品ID集合，查询其所有SKUID集合
     * 
     * @param productIdList
     * @return
     * @throws Exception
     */
    public List<Long> selectSkuIdsByProductIdList(List<Long> productIdList) throws SQLException;

    public ProductAndSku findProduct(Long productSkuId) throws SQLException;

    /**
     * 根据SkuCode，查找商品信息集合
     */
    public List<ProductAndSku> findProductsBySkuCodeList(
            List<CarryStockOutDetailVO> productSkuCodeList);

    /***
     * 根据skuId 的集合查询出所对应的skuCode list
     * 
     * @param skuId
     * @return
     * @throws SQLException
     */
    public List<String> selectSkuCodeByManySkuId(List<Long> skuId) throws SQLException;

    /**
     * 根据skuCode 查出对应的skuId
     * 
     * @param skuCode
     * @return
     * @throws SQLException
     */
    public Long selectSkuIdBySkuCode(String skuCode) throws SQLException;

    // 根据目录查询出所有skuId的产品出来
    public List<Long> selectSkuIdByManyCategory(List<Long> categoryIdList) throws Exception;

    public ProductAndSku findProductBySkuCode(String productSkuCode);

    public Map<Long, ProductSku> getSkuIdAndCodeMap(List<Long> skuIdList) throws Exception;

    public List<ProductSku> findProductSkuBySkuCodes(List<String> productSkuCodeList)
            throws SQLException;

    /**
     * 批量查询产品价格
     * 
     * @param params
     * @return
     * @throws SQLException
     */
    public List<ProductPrice> queryBatchPrice(List<Long> skuIds) throws SQLException;

    /**
     * 获取产品价格
     * 
     * @param sku
     * @return
     * @throws SQLException
     */
    public ProductPrice getProductPriceByArea(Map<String, Long> params) throws SQLException;

    /**
     * 获取产品全国价和建议零售价
     * 
     * @param skuId
     * @return
     * @throws SQLException
     */
    public ProductPrice getProductBasicPrice(Long skuId) throws SQLException;

    /**
     * 批量获取产品全国价
     * 
     * @param skuIds
     * @return
     * @throws SQLException
     */
    public List<ProductPrice> queryBatchProductBasicPrice(List<Long> skuIds) throws SQLException;

    /**
     * 批量获取产品价格
     * 
     * @param params
     * @return
     * @throws SQLException
     */
    public List<ProductPrice> queryBatchProductPrice(Map<String, Object> params)
            throws SQLException;

    Map<Long, ProductAndSku> findAllProducts(List<String> codesList);

    /**
     * 批量查询ProductSku
     * 
     * @param skuIds
     * @return
     * @throws SQLException
     */
    public List<ProductSku> queryProductSkuForBatch(List<Long> skuIds) throws SQLException;

    /**
     * 批量查询ProductAndSku
     * 
     * @param skuIds
     * @return
     * @throws SQLException
     */
    public List<ProductAndSku> queryProductAndSkuForBatch(List<Long> skuIds) throws SQLException;

    /**
     * 
     * 查询预售产品SKU列表，审核通过的商品，上下架状态不限，库存不限 ，产品状态4:下架、5:系统下架、3:上架 、 -2违规下架 ;
     * 每个商品只能同时参加一个预售活动，上一个活动全部结束之后（预售状态为“已结束”），才可参加新的预售活动
     *
     * @author Administrator
     * @param page
     * @param vo
     * @return
     * @throws SQLException
     */
    public Page selecPresellProductByVo(Page page, ProductSku vo) throws SQLException;

}
