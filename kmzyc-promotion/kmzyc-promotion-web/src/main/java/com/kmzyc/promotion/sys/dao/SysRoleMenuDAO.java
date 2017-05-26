package com.kmzyc.promotion.sys.dao;

import java.sql.SQLException;
import java.util.List;

import com.kmzyc.promotion.sys.model.SysRoleMenu;
import com.kmzyc.promotion.sys.model.SysRoleMenuExample;

public interface SysRoleMenuDAO {
	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	int countByExample(SysRoleMenuExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	int deleteByExample(SysRoleMenuExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	int deleteByPrimaryKey(Integer rolemenuId) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	Integer insert(SysRoleMenu record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	Integer insertSelective(SysRoleMenu record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	List<SysRoleMenu> selectByExample(SysRoleMenuExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	SysRoleMenu selectByPrimaryKey(Integer rolemenuId) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	int updateByExampleSelective(SysRoleMenu record, SysRoleMenuExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	int updateByExample(SysRoleMenu record, SysRoleMenuExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	int updateByPrimaryKeySelective(SysRoleMenu record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table SYS_ROLE_MENU
	 * 
	 * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
	 */
	int updateByPrimaryKey(SysRoleMenu record) throws SQLException;
}