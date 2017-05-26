package com.pltfm.cms.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.pltfm.cms.dao.CmsAdcolumnDAO;
import com.pltfm.cms.vobject.CmsAdcolumn;
import com.pltfm.cms.vobject.CmsAdcolumnExample;

import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

@Component("cmsAdcolumnDAO")
public class CmsAdcolumnDAOImpl implements CmsAdcolumnDAO {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table CMS_ADCOLUMN
     *
     * @abatorgenerated Tue Sep 03 08:33:04 CST 2013
     */
    /**
     * 数据库操作对象
     */
    @Resource(name = "sqlMapClient")
    private SqlMapClient sqlMapClient;

    /**
     * 添加广告位数据信息
     *
     * @param record 广告位数据信息实体
     * @throws SQLException sql异常//
     * @return 返回值
     */
    public Integer insert(CmsAdcolumn record) throws SQLException {
        Integer rows = (Integer) sqlMapClient.insert("CMS_ADCOLUMN.abatorgenerated_insert", record);
        return rows;
    }


    /**
     * 修改广告位数据信息
     *
     * @param record 广告位数据信息实体
     * @throws SQLException sql异常
     * @return 返回值
     */
    public int updateByPrimaryKey(CmsAdcolumn record) throws SQLException {
        int rows = sqlMapClient.update("CMS_ADCOLUMN.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * 动态修改广告位数据信息
     *
     * @param record 广告位数据信息实体
     * @throws SQLException sql异常
     * @return 返回值
     */
    public int updateByPrimaryKeySelective(CmsAdcolumn record) throws SQLException {
        int rows = sqlMapClient.update("CMS_ADCOLUMN.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * 按广告位数据信息条件查询
     *
     * @param example 广告位数据信息条件
     * @throws SQLException sql异常
     * @return 返回值
     */
    public List selectByExample(CmsAdcolumnExample example) throws SQLException {

        List list = sqlMapClient.queryForList("CMS_ADCOLUMN.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * 根据广告位数据主键查询单条账户基本信息
     *
     * @param windowDataId 广告位数据主键
     * @throws SQLException sql异常
     * @return 返回值
     */
    public CmsAdcolumn selectByPrimaryKey(Integer adcolumnId) throws SQLException {
        CmsAdcolumn key = new CmsAdcolumn();
        key.setAdcolumnId(adcolumnId);
        CmsAdcolumn record = (CmsAdcolumn) sqlMapClient.queryForObject("CMS_ADCOLUMN.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * 按广告位数据信息条件进行删除
     *
     * @param example 广告位数据信息条件
     * @throws SQLException sql异常
     * @return 返回值
     */
    public int deleteByExample(CmsAdcolumnExample example) throws SQLException {
        int rows = sqlMapClient.delete("CMS_ADCOLUMN.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * 根据广告位数据主键删除广告位数据信息
     *
     * @param windowDataId 广告位数据主键
     * @throws SQLException sql异常
     * @return 返回值
     */
    public int deleteByPrimaryKey(Integer adcolumnId) throws SQLException {
        CmsAdcolumn key = new CmsAdcolumn();
        key.setAdcolumnId(adcolumnId);
        int rows = sqlMapClient.delete("CMS_ADCOLUMN.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * 按广告位数据信息条件查询总条数
     *
     * @param example 广告位数据信息条件
     * @throws SQLException sql异常
     * @return 返回值
     */
    public int countByExample(CmsAdcolumn example) throws SQLException {
        Integer count = (Integer) sqlMapClient.queryForObject("CMS_ADCOLUMN.abatorgenerated_countByAdcolumn", example);
        return count.intValue();
    }

    @Override
    public int countByAdcolumn(CmsAdcolumn example) throws SQLException {
        Integer count = (Integer) sqlMapClient.queryForObject("CMS_ADCOLUMN.countByAdcolumn", example);
        return count.intValue();
    }

    @Override
    public int countByAdcolumnname(CmsAdcolumn example) throws SQLException {
        Integer count = (Integer) sqlMapClient.queryForObject("CMS_ADCOLUMN.countByAdcolumnname", example);
        return count.intValue();
    }

    /**
     * 动态按广告位数据信息条件进行修改
     *
     * @param record  广告位数据信息实体
     * @param example 广告位数据信息条件
     * @throws SQLException sql异常
     * @return 返回值
     */
    public int updateByExampleSelective(CmsAdcolumn record, CmsAdcolumnExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("CMS_ADCOLUMN.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * 按广告位数据信息按条件进行修改
     *
     * @param record  广告位数据信息实体
     * @param example 广告位数据信息条件
     * @throws SQLException sql异常
     * @return 返回值
     */
    public int updateByExample(CmsAdcolumn record, CmsAdcolumnExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("CMS_ADCOLUMN.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * 按实体条件修改参数类
     *
     * @author cjm
     * @since 2013-9-3
     */
    private static class UpdateByExampleParms extends CmsAdcolumnExample {
        private Object record;

        public UpdateByExampleParms(Object record, CmsAdcolumnExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

    @Override
    public List queryForPage(CmsAdcolumn cmsAdcolumn) throws SQLException {

        return sqlMapClient.queryForList("CMS_ADCOLUMN.abatorgenerated_pageByAdcolumnData", cmsAdcolumn);
    }

    @Override
    public CmsAdcolumn byid(Integer Advid) throws SQLException {

        return (CmsAdcolumn) sqlMapClient.queryForObject("CMS_ADCOLUMN.abatorgenerated_ByIDAdcolumnData", Advid);
    }

    //返回所有广告位列表
    public List queryAdcolumnList() throws SQLException {

        return sqlMapClient.queryForList("CMS_ADCOLUMN.abatorgenerated_queryAdcolumnListData");
    }

    /**
     * 查些广告位是否有广告
     *
     * @author cjm
     * @since 2013-9-3
     */
    @Override
    public int byAdvId(Integer Advid) throws SQLException {
        int rows = (Integer) sqlMapClient.queryForObject("CMS_ADV.abatorgenerated_ByAdId", Advid);
        return rows;
    }


    @Override
    public List queryAdcolumnListBySupplier(CmsAdcolumn cmsAdcolumn) throws SQLException {
        // TODO Auto-generated method stub
        return sqlMapClient.queryForList("CMS_ADCOLUMN.abatorgenerated_queryAdcolumnListBySupplier", cmsAdcolumn);
    }


}


   