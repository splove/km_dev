package com.pltfm.sys.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SysMenuExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    public SysMenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    protected SysMenuExample(SysMenuExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table SYS_MENU
     *
     * @ibatorgenerated Fri Nov 25 22:18:12 CST 2011
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("MENU_ID =", value, "menuId");
            return this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("MENU_ID >", value, "menuId");
            return this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("MENU_ID <", value, "menuId");
            return this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return this;
        }

        public Criteria andMenuUpidIsNull() {
            addCriterion("MENU_UPID is null");
            return this;
        }

        public Criteria andMenuUpidIsNotNull() {
            addCriterion("MENU_UPID is not null");
            return this;
        }

        public Criteria andMenuUpidEqualTo(Integer value) {
            addCriterion("MENU_UPID =", value, "menuUpid");
            return this;
        }

        public Criteria andMenuUpidNotEqualTo(Integer value) {
            addCriterion("MENU_UPID <>", value, "menuUpid");
            return this;
        }

        public Criteria andMenuUpidGreaterThan(Integer value) {
            addCriterion("MENU_UPID >", value, "menuUpid");
            return this;
        }

        public Criteria andMenuUpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_UPID >=", value, "menuUpid");
            return this;
        }

        public Criteria andMenuUpidLessThan(Integer value) {
            addCriterion("MENU_UPID <", value, "menuUpid");
            return this;
        }

        public Criteria andMenuUpidLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_UPID <=", value, "menuUpid");
            return this;
        }

        public Criteria andMenuUpidIn(List<Integer> values) {
            addCriterion("MENU_UPID in", values, "menuUpid");
            return this;
        }

        public Criteria andMenuUpidNotIn(List<Integer> values) {
            addCriterion("MENU_UPID not in", values, "menuUpid");
            return this;
        }

        public Criteria andMenuUpidBetween(Integer value1, Integer value2) {
            addCriterion("MENU_UPID between", value1, value2, "menuUpid");
            return this;
        }

        public Criteria andMenuUpidNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_UPID not between", value1, value2, "menuUpid");
            return this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return this;
        }

        public Criteria andMenuLinkIsNull() {
            addCriterion("MENU_LINK is null");
            return this;
        }

        public Criteria andMenuLinkIsNotNull() {
            addCriterion("MENU_LINK is not null");
            return this;
        }

        public Criteria andMenuLinkEqualTo(String value) {
            addCriterion("MENU_LINK =", value, "menuLink");
            return this;
        }

        public Criteria andMenuLinkNotEqualTo(String value) {
            addCriterion("MENU_LINK <>", value, "menuLink");
            return this;
        }

        public Criteria andMenuLinkGreaterThan(String value) {
            addCriterion("MENU_LINK >", value, "menuLink");
            return this;
        }

        public Criteria andMenuLinkGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_LINK >=", value, "menuLink");
            return this;
        }

        public Criteria andMenuLinkLessThan(String value) {
            addCriterion("MENU_LINK <", value, "menuLink");
            return this;
        }

        public Criteria andMenuLinkLessThanOrEqualTo(String value) {
            addCriterion("MENU_LINK <=", value, "menuLink");
            return this;
        }

        public Criteria andMenuLinkLike(String value) {
            addCriterion("MENU_LINK like", value, "menuLink");
            return this;
        }

        public Criteria andMenuLinkNotLike(String value) {
            addCriterion("MENU_LINK not like", value, "menuLink");
            return this;
        }

        public Criteria andMenuLinkIn(List<String> values) {
            addCriterion("MENU_LINK in", values, "menuLink");
            return this;
        }

        public Criteria andMenuLinkNotIn(List<String> values) {
            addCriterion("MENU_LINK not in", values, "menuLink");
            return this;
        }

        public Criteria andMenuLinkBetween(String value1, String value2) {
            addCriterion("MENU_LINK between", value1, value2, "menuLink");
            return this;
        }

        public Criteria andMenuLinkNotBetween(String value1, String value2) {
            addCriterion("MENU_LINK not between", value1, value2, "menuLink");
            return this;
        }

        public Criteria andMenuLvIsNull() {
            addCriterion("MENU_LV is null");
            return this;
        }

        public Criteria andMenuLvIsNotNull() {
            addCriterion("MENU_LV is not null");
            return this;
        }

        public Criteria andMenuLvEqualTo(String value) {
            addCriterion("MENU_LV =", value, "menuLv");
            return this;
        }

        public Criteria andMenuLvNotEqualTo(String value) {
            addCriterion("MENU_LV <>", value, "menuLv");
            return this;
        }

        public Criteria andMenuLvGreaterThan(String value) {
            addCriterion("MENU_LV >", value, "menuLv");
            return this;
        }

        public Criteria andMenuLvGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_LV >=", value, "menuLv");
            return this;
        }

        public Criteria andMenuLvLessThan(String value) {
            addCriterion("MENU_LV <", value, "menuLv");
            return this;
        }

        public Criteria andMenuLvLessThanOrEqualTo(String value) {
            addCriterion("MENU_LV <=", value, "menuLv");
            return this;
        }

        public Criteria andMenuLvLike(String value) {
            addCriterion("MENU_LV like", value, "menuLv");
            return this;
        }

        public Criteria andMenuLvNotLike(String value) {
            addCriterion("MENU_LV not like", value, "menuLv");
            return this;
        }

        public Criteria andMenuLvIn(List<String> values) {
            addCriterion("MENU_LV in", values, "menuLv");
            return this;
        }

        public Criteria andMenuLvNotIn(List<String> values) {
            addCriterion("MENU_LV not in", values, "menuLv");
            return this;
        }

        public Criteria andMenuLvBetween(String value1, String value2) {
            addCriterion("MENU_LV between", value1, value2, "menuLv");
            return this;
        }

        public Criteria andMenuLvNotBetween(String value1, String value2) {
            addCriterion("MENU_LV not between", value1, value2, "menuLv");
            return this;
        }

        public Criteria andMenuStIsNull() {
            addCriterion("MENU_ST is null");
            return this;
        }

        public Criteria andMenuStIsNotNull() {
            addCriterion("MENU_ST is not null");
            return this;
        }

        public Criteria andMenuStEqualTo(String value) {
            addCriterion("MENU_ST =", value, "menuSt");
            return this;
        }

        public Criteria andMenuStNotEqualTo(String value) {
            addCriterion("MENU_ST <>", value, "menuSt");
            return this;
        }

        public Criteria andMenuStGreaterThan(String value) {
            addCriterion("MENU_ST >", value, "menuSt");
            return this;
        }

        public Criteria andMenuStGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ST >=", value, "menuSt");
            return this;
        }

        public Criteria andMenuStLessThan(String value) {
            addCriterion("MENU_ST <", value, "menuSt");
            return this;
        }

        public Criteria andMenuStLessThanOrEqualTo(String value) {
            addCriterion("MENU_ST <=", value, "menuSt");
            return this;
        }

        public Criteria andMenuStLike(String value) {
            addCriterion("MENU_ST like", value, "menuSt");
            return this;
        }

        public Criteria andMenuStNotLike(String value) {
            addCriterion("MENU_ST not like", value, "menuSt");
            return this;
        }

        public Criteria andMenuStIn(List<String> values) {
            addCriterion("MENU_ST in", values, "menuSt");
            return this;
        }

        public Criteria andMenuStNotIn(List<String> values) {
            addCriterion("MENU_ST not in", values, "menuSt");
            return this;
        }

        public Criteria andMenuStBetween(String value1, String value2) {
            addCriterion("MENU_ST between", value1, value2, "menuSt");
            return this;
        }

        public Criteria andMenuStNotBetween(String value1, String value2) {
            addCriterion("MENU_ST not between", value1, value2, "menuSt");
            return this;
        }

        public Criteria andMenuImgIsNull() {
            addCriterion("MENU_IMG is null");
            return this;
        }

        public Criteria andMenuImgIsNotNull() {
            addCriterion("MENU_IMG is not null");
            return this;
        }

        public Criteria andMenuImgEqualTo(String value) {
            addCriterion("MENU_IMG =", value, "menuImg");
            return this;
        }

        public Criteria andMenuImgNotEqualTo(String value) {
            addCriterion("MENU_IMG <>", value, "menuImg");
            return this;
        }

        public Criteria andMenuImgGreaterThan(String value) {
            addCriterion("MENU_IMG >", value, "menuImg");
            return this;
        }

        public Criteria andMenuImgGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_IMG >=", value, "menuImg");
            return this;
        }

        public Criteria andMenuImgLessThan(String value) {
            addCriterion("MENU_IMG <", value, "menuImg");
            return this;
        }

        public Criteria andMenuImgLessThanOrEqualTo(String value) {
            addCriterion("MENU_IMG <=", value, "menuImg");
            return this;
        }

        public Criteria andMenuImgLike(String value) {
            addCriterion("MENU_IMG like", value, "menuImg");
            return this;
        }

        public Criteria andMenuImgNotLike(String value) {
            addCriterion("MENU_IMG not like", value, "menuImg");
            return this;
        }

        public Criteria andMenuImgIn(List<String> values) {
            addCriterion("MENU_IMG in", values, "menuImg");
            return this;
        }

        public Criteria andMenuImgNotIn(List<String> values) {
            addCriterion("MENU_IMG not in", values, "menuImg");
            return this;
        }

        public Criteria andMenuImgBetween(String value1, String value2) {
            addCriterion("MENU_IMG between", value1, value2, "menuImg");
            return this;
        }

        public Criteria andMenuImgNotBetween(String value1, String value2) {
            addCriterion("MENU_IMG not between", value1, value2, "menuImg");
            return this;
        }

        public Criteria andMenuRemarkIsNull() {
            addCriterion("MENU_REMARK is null");
            return this;
        }

        public Criteria andMenuRemarkIsNotNull() {
            addCriterion("MENU_REMARK is not null");
            return this;
        }

        public Criteria andMenuRemarkEqualTo(String value) {
            addCriterion("MENU_REMARK =", value, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkNotEqualTo(String value) {
            addCriterion("MENU_REMARK <>", value, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkGreaterThan(String value) {
            addCriterion("MENU_REMARK >", value, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_REMARK >=", value, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkLessThan(String value) {
            addCriterion("MENU_REMARK <", value, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkLessThanOrEqualTo(String value) {
            addCriterion("MENU_REMARK <=", value, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkLike(String value) {
            addCriterion("MENU_REMARK like", value, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkNotLike(String value) {
            addCriterion("MENU_REMARK not like", value, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkIn(List<String> values) {
            addCriterion("MENU_REMARK in", values, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkNotIn(List<String> values) {
            addCriterion("MENU_REMARK not in", values, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkBetween(String value1, String value2) {
            addCriterion("MENU_REMARK between", value1, value2, "menuRemark");
            return this;
        }

        public Criteria andMenuRemarkNotBetween(String value1, String value2) {
            addCriterion("MENU_REMARK not between", value1, value2, "menuRemark");
            return this;
        }

        public Criteria andSortnoIsNull() {
            addCriterion("SORTNO is null");
            return this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("SORTNO is not null");
            return this;
        }

        public Criteria andSortnoEqualTo(String value) {
            addCriterion("SORTNO =", value, "sortno");
            return this;
        }

        public Criteria andSortnoNotEqualTo(String value) {
            addCriterion("SORTNO <>", value, "sortno");
            return this;
        }

        public Criteria andSortnoGreaterThan(String value) {
            addCriterion("SORTNO >", value, "sortno");
            return this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(String value) {
            addCriterion("SORTNO >=", value, "sortno");
            return this;
        }

        public Criteria andSortnoLessThan(String value) {
            addCriterion("SORTNO <", value, "sortno");
            return this;
        }

        public Criteria andSortnoLessThanOrEqualTo(String value) {
            addCriterion("SORTNO <=", value, "sortno");
            return this;
        }

        public Criteria andSortnoLike(String value) {
            addCriterion("SORTNO like", value, "sortno");
            return this;
        }

        public Criteria andSortnoNotLike(String value) {
            addCriterion("SORTNO not like", value, "sortno");
            return this;
        }

        public Criteria andSortnoIn(List<String> values) {
            addCriterion("SORTNO in", values, "sortno");
            return this;
        }

        public Criteria andSortnoNotIn(List<String> values) {
            addCriterion("SORTNO not in", values, "sortno");
            return this;
        }

        public Criteria andSortnoBetween(String value1, String value2) {
            addCriterion("SORTNO between", value1, value2, "sortno");
            return this;
        }

        public Criteria andSortnoNotBetween(String value1, String value2) {
            addCriterion("SORTNO not between", value1, value2, "sortno");
            return this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("IS_ENABLE is null");
            return this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("IS_ENABLE is not null");
            return this;
        }

        public Criteria andIsEnableEqualTo(String value) {
            addCriterion("IS_ENABLE =", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableNotEqualTo(String value) {
            addCriterion("IS_ENABLE <>", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableGreaterThan(String value) {
            addCriterion("IS_ENABLE >", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ENABLE >=", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableLessThan(String value) {
            addCriterion("IS_ENABLE <", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(String value) {
            addCriterion("IS_ENABLE <=", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableLike(String value) {
            addCriterion("IS_ENABLE like", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableNotLike(String value) {
            addCriterion("IS_ENABLE not like", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableIn(List<String> values) {
            addCriterion("IS_ENABLE in", values, "isEnable");
            return this;
        }

        public Criteria andIsEnableNotIn(List<String> values) {
            addCriterion("IS_ENABLE not in", values, "isEnable");
            return this;
        }

        public Criteria andIsEnableBetween(String value1, String value2) {
            addCriterion("IS_ENABLE between", value1, value2, "isEnable");
            return this;
        }

        public Criteria andIsEnableNotBetween(String value1, String value2) {
            addCriterion("IS_ENABLE not between", value1, value2, "isEnable");
            return this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2, "updateDate");
            return this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2, "updateDate");
            return this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return this;
        }

        public Criteria andUpdateUserEqualTo(Integer value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotEqualTo(Integer value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserGreaterThan(Integer value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserLessThan(Integer value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return this;
        }

        public Criteria andUpdateUserIn(List<Integer> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotIn(List<Integer> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return this;
        }

        public Criteria andUpdateUserBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return this;
        }

        public Criteria andUpdateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return this;
        }
    }
}