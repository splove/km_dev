package com.pltfm.sys.model;

import java.io.Serializable;
import java.util.Objects;


public class SysRoleMenu implements Serializable {
  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_ROLE_MENU.ROLEMENU_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private Integer rolemenuId;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_ROLE_MENU.MENU_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private Integer menuId;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
   * SYS_ROLE_MENU.ROLE_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private Integer roleId;

  /**
   * This field was generated by Apache iBATIS ibator. This field corresponds to the database table
   * SYS_ROLE_MENU
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  private static final long serialVersionUID = 1L;

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_ROLE_MENU.ROLEMENU_ID
   *
   * @return the value of SYS_ROLE_MENU.ROLEMENU_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public Integer getRolemenuId() {
    return rolemenuId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_ROLE_MENU.ROLEMENU_ID
   *
   * @param rolemenuId the value for SYS_ROLE_MENU.ROLEMENU_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setRolemenuId(Integer rolemenuId) {
    this.rolemenuId = rolemenuId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_ROLE_MENU.MENU_ID
   *
   * @return the value of SYS_ROLE_MENU.MENU_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public Integer getMenuId() {
    return menuId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_ROLE_MENU.MENU_ID
   *
   * @param menuId the value for SYS_ROLE_MENU.MENU_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method returns the value of the
   * database column SYS_ROLE_MENU.ROLE_ID
   *
   * @return the value of SYS_ROLE_MENU.ROLE_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public Integer getRoleId() {
    return roleId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method sets the value of the database
   * column SYS_ROLE_MENU.ROLE_ID
   *
   * @param roleId the value for SYS_ROLE_MENU.ROLE_ID
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE_MENU
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SysRoleMenu that = (SysRoleMenu) o;
    return Objects.equals(rolemenuId, that.rolemenuId) && Objects.equals(menuId, that.menuId) &&
            Objects.equals(roleId, that.roleId);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database
   * table SYS_ROLE_MENU
   *
   * @ibatorgenerated Thu Nov 24 14:28:04 CST 2011
   */
  @Override
  public int hashCode() {
    int hash = 23;
    if (getRolemenuId() != null) {
      hash *= getRolemenuId().hashCode();
    }
    if (getMenuId() != null) {
      hash *= getMenuId().hashCode();
    }
    if (getRoleId() != null) {
      hash *= getRoleId().hashCode();
    }
    return hash;
  }
}
