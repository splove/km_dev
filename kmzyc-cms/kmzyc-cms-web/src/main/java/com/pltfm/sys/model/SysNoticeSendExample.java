package com.pltfm.sys.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysNoticeSendExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    public SysNoticeSendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    protected SysNoticeSendExample(SysNoticeSendExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
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
     * This method corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table sys_notice_send
     *
     * @ibatorgenerated Wed Jan 27 15:44:06 CST 2010
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return this;
        }

        public Criteria andNoticeIdEqualTo(Integer value) {
            addCriterion("notice_id =", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdNotEqualTo(Integer value) {
            addCriterion("notice_id <>", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdGreaterThan(Integer value) {
            addCriterion("notice_id >", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_id >=", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdLessThan(Integer value) {
            addCriterion("notice_id <", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("notice_id <=", value, "noticeId");
            return this;
        }

        public Criteria andNoticeIdIn(List<Integer> values) {
            addCriterion("notice_id in", values, "noticeId");
            return this;
        }

        public Criteria andNoticeIdNotIn(List<Integer> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return this;
        }

        public Criteria andNoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return this;
        }

        public Criteria andNoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return this;
        }

        public Criteria andIsReadIsNull() {
            addCriterion("is_read is null");
            return this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("is_read is not null");
            return this;
        }

        public Criteria andIsReadEqualTo(String value) {
            addCriterion("is_read =", value, "isRead");
            return this;
        }

        public Criteria andIsReadNotEqualTo(String value) {
            addCriterion("is_read <>", value, "isRead");
            return this;
        }

        public Criteria andIsReadGreaterThan(String value) {
            addCriterion("is_read >", value, "isRead");
            return this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(String value) {
            addCriterion("is_read >=", value, "isRead");
            return this;
        }

        public Criteria andIsReadLessThan(String value) {
            addCriterion("is_read <", value, "isRead");
            return this;
        }

        public Criteria andIsReadLessThanOrEqualTo(String value) {
            addCriterion("is_read <=", value, "isRead");
            return this;
        }

        public Criteria andIsReadLike(String value) {
            addCriterion("is_read like", value, "isRead");
            return this;
        }

        public Criteria andIsReadNotLike(String value) {
            addCriterion("is_read not like", value, "isRead");
            return this;
        }

        public Criteria andIsReadIn(List<String> values) {
            addCriterion("is_read in", values, "isRead");
            return this;
        }

        public Criteria andIsReadNotIn(List<String> values) {
            addCriterion("is_read not in", values, "isRead");
            return this;
        }

        public Criteria andIsReadBetween(String value1, String value2) {
            addCriterion("is_read between", value1, value2, "isRead");
            return this;
        }

        public Criteria andIsReadNotBetween(String value1, String value2) {
            addCriterion("is_read not between", value1, value2, "isRead");
            return this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return this;
        }

        public Criteria andIsEnableEqualTo(String value) {
            addCriterion("is_enable =", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableNotEqualTo(String value) {
            addCriterion("is_enable <>", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableGreaterThan(String value) {
            addCriterion("is_enable >", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(String value) {
            addCriterion("is_enable >=", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableLessThan(String value) {
            addCriterion("is_enable <", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(String value) {
            addCriterion("is_enable <=", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableLike(String value) {
            addCriterion("is_enable like", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableNotLike(String value) {
            addCriterion("is_enable not like", value, "isEnable");
            return this;
        }

        public Criteria andIsEnableIn(List<String> values) {
            addCriterion("is_enable in", values, "isEnable");
            return this;
        }

        public Criteria andIsEnableNotIn(List<String> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return this;
        }

        public Criteria andIsEnableBetween(String value1, String value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return this;
        }

        public Criteria andIsEnableNotBetween(String value1, String value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return this;
        }

        public Criteria andSendRemarkIsNull() {
            addCriterion("send_remark is null");
            return this;
        }

        public Criteria andSendRemarkIsNotNull() {
            addCriterion("send_remark is not null");
            return this;
        }

        public Criteria andSendRemarkEqualTo(String value) {
            addCriterion("send_remark =", value, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkNotEqualTo(String value) {
            addCriterion("send_remark <>", value, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkGreaterThan(String value) {
            addCriterion("send_remark >", value, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("send_remark >=", value, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkLessThan(String value) {
            addCriterion("send_remark <", value, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkLessThanOrEqualTo(String value) {
            addCriterion("send_remark <=", value, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkLike(String value) {
            addCriterion("send_remark like", value, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkNotLike(String value) {
            addCriterion("send_remark not like", value, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkIn(List<String> values) {
            addCriterion("send_remark in", values, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkNotIn(List<String> values) {
            addCriterion("send_remark not in", values, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkBetween(String value1, String value2) {
            addCriterion("send_remark between", value1, value2, "sendRemark");
            return this;
        }

        public Criteria andSendRemarkNotBetween(String value1, String value2) {
            addCriterion("send_remark not between", value1, value2, "sendRemark");
            return this;
        }
    }
}