package com.pltfm.cms.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.pltfm.cms.dao.CmsThemeTemplateDAO;
import com.pltfm.cms.vobject.CmsThemeTemplate;

import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

@Component("cmsThemeTemplateDAO")
public class CmsThemeTemplateDAOImpl implements CmsThemeTemplateDAO {

    @Resource(name = "sqlMapClient")
    private SqlMapClient sqlMapClient;

    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }

    public void setSqlMapClient(SqlMapClient sqlMapClient) {
        this.sqlMapClient = sqlMapClient;
    }


    public List queryThemeTempList(CmsThemeTemplate cmsThemeTemplate) throws SQLException {
        return sqlMapClient.queryForList("CMS_THEME_TEMPLATE.abatorgenerated_themeTempList", cmsThemeTemplate);
    }


    public Integer queryThemeTempCount(CmsThemeTemplate cmsThemeTemplate) throws SQLException {
        return (Integer) sqlMapClient.queryForObject("CMS_THEME_TEMPLATE.abatorgenerated_themeTempCount", cmsThemeTemplate);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CMS_THEME_TEMPLET
     *
     * @abatorgenerated Mon Jun 09 15:14:03 CST 2014
     */

    public void insert(CmsThemeTemplate record) throws SQLException {
        sqlMapClient.insert("CMS_THEME_TEMPLATE.abatorgenerated_insert", record);
    }

    @Override
    public int deleteByPrimaryKey(Integer themeTemplateId) throws SQLException {
        // TODO Auto-generated method stub
        return sqlMapClient.delete("CMS_THEME_TEMPLATE.abatorgenerated_deleteByPrimaryKey", themeTemplateId);


    }
    /*
	@Override
	public int updateByPrimaryKey(Integer record) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table CMS_THEME_TEMPLET
     *
     * @abatorgenerated Mon Jun 09 15:14:03 CST 2014
     */

    /**
     * 根据主题Id和模板类型查询模板Id
     *
     * @param cmsThemeTemplate 主题模板
     * @return 主题模板的集合
     */
    @Override
    public List queryByThemeTemp(CmsThemeTemplate cmsThemeTemplate)
            throws SQLException {
        return sqlMapClient.queryForList("CMS_THEME_TEMPLATE.abatorgenerated_bythemeTemp", cmsThemeTemplate);
    }


    /**
     * 根据主题Id和模板类型查询页面模板Id
     */
    @Override
    public CmsThemeTemplate getByThemeTemp(CmsThemeTemplate cmsThemeTemplate)
            throws SQLException {
        return (CmsThemeTemplate) sqlMapClient.queryForObject("CMS_THEME_TEMPLATE.abatorgenerated_bythemeTemp", cmsThemeTemplate);
    }


}