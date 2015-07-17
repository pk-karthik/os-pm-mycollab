/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.tracker.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("ucd")
public class ComponentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public ComponentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    @SuppressWarnings("ucd")
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectid is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectid =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectid <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectid >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectid >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectid <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectid <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectid in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectid not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectid between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectid not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andComponentnameIsNull() {
            addCriterion("componentname is null");
            return (Criteria) this;
        }

        public Criteria andComponentnameIsNotNull() {
            addCriterion("componentname is not null");
            return (Criteria) this;
        }

        public Criteria andComponentnameEqualTo(String value) {
            addCriterion("componentname =", value, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameNotEqualTo(String value) {
            addCriterion("componentname <>", value, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameGreaterThan(String value) {
            addCriterion("componentname >", value, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameGreaterThanOrEqualTo(String value) {
            addCriterion("componentname >=", value, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameLessThan(String value) {
            addCriterion("componentname <", value, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameLessThanOrEqualTo(String value) {
            addCriterion("componentname <=", value, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameLike(String value) {
            addCriterion("componentname like", value, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameNotLike(String value) {
            addCriterion("componentname not like", value, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameIn(List<String> values) {
            addCriterion("componentname in", values, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameNotIn(List<String> values) {
            addCriterion("componentname not in", values, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameBetween(String value1, String value2) {
            addCriterion("componentname between", value1, value2, "componentname");
            return (Criteria) this;
        }

        public Criteria andComponentnameNotBetween(String value1, String value2) {
            addCriterion("componentname not between", value1, value2, "componentname");
            return (Criteria) this;
        }

        public Criteria andUserleadIsNull() {
            addCriterion("userlead is null");
            return (Criteria) this;
        }

        public Criteria andUserleadIsNotNull() {
            addCriterion("userlead is not null");
            return (Criteria) this;
        }

        public Criteria andUserleadEqualTo(String value) {
            addCriterion("userlead =", value, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadNotEqualTo(String value) {
            addCriterion("userlead <>", value, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadGreaterThan(String value) {
            addCriterion("userlead >", value, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadGreaterThanOrEqualTo(String value) {
            addCriterion("userlead >=", value, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadLessThan(String value) {
            addCriterion("userlead <", value, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadLessThanOrEqualTo(String value) {
            addCriterion("userlead <=", value, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadLike(String value) {
            addCriterion("userlead like", value, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadNotLike(String value) {
            addCriterion("userlead not like", value, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadIn(List<String> values) {
            addCriterion("userlead in", values, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadNotIn(List<String> values) {
            addCriterion("userlead not in", values, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadBetween(String value1, String value2) {
            addCriterion("userlead between", value1, value2, "userlead");
            return (Criteria) this;
        }

        public Criteria andUserleadNotBetween(String value1, String value2) {
            addCriterion("userlead not between", value1, value2, "userlead");
            return (Criteria) this;
        }

        public Criteria andCreateduserIsNull() {
            addCriterion("createdUser is null");
            return (Criteria) this;
        }

        public Criteria andCreateduserIsNotNull() {
            addCriterion("createdUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateduserEqualTo(String value) {
            addCriterion("createdUser =", value, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserNotEqualTo(String value) {
            addCriterion("createdUser <>", value, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserGreaterThan(String value) {
            addCriterion("createdUser >", value, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserGreaterThanOrEqualTo(String value) {
            addCriterion("createdUser >=", value, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserLessThan(String value) {
            addCriterion("createdUser <", value, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserLessThanOrEqualTo(String value) {
            addCriterion("createdUser <=", value, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserLike(String value) {
            addCriterion("createdUser like", value, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserNotLike(String value) {
            addCriterion("createdUser not like", value, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserIn(List<String> values) {
            addCriterion("createdUser in", values, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserNotIn(List<String> values) {
            addCriterion("createdUser not in", values, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserBetween(String value1, String value2) {
            addCriterion("createdUser between", value1, value2, "createduser");
            return (Criteria) this;
        }

        public Criteria andCreateduserNotBetween(String value1, String value2) {
            addCriterion("createdUser not between", value1, value2, "createduser");
            return (Criteria) this;
        }

        public Criteria andSaccountidIsNull() {
            addCriterion("sAccountId is null");
            return (Criteria) this;
        }

        public Criteria andSaccountidIsNotNull() {
            addCriterion("sAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andSaccountidEqualTo(Integer value) {
            addCriterion("sAccountId =", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotEqualTo(Integer value) {
            addCriterion("sAccountId <>", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidGreaterThan(Integer value) {
            addCriterion("sAccountId >", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sAccountId >=", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidLessThan(Integer value) {
            addCriterion("sAccountId <", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidLessThanOrEqualTo(Integer value) {
            addCriterion("sAccountId <=", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidIn(List<Integer> values) {
            addCriterion("sAccountId in", values, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotIn(List<Integer> values) {
            addCriterion("sAccountId not in", values, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidBetween(Integer value1, Integer value2) {
            addCriterion("sAccountId between", value1, value2, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("sAccountId not between", value1, value2, "saccountid");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeIsNull() {
            addCriterion("lastUpdatedTime is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeIsNotNull() {
            addCriterion("lastUpdatedTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeEqualTo(Date value) {
            addCriterion("lastUpdatedTime =", value, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeNotEqualTo(Date value) {
            addCriterion("lastUpdatedTime <>", value, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeGreaterThan(Date value) {
            addCriterion("lastUpdatedTime >", value, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUpdatedTime >=", value, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeLessThan(Date value) {
            addCriterion("lastUpdatedTime <", value, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("lastUpdatedTime <=", value, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeIn(List<Date> values) {
            addCriterion("lastUpdatedTime in", values, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeNotIn(List<Date> values) {
            addCriterion("lastUpdatedTime not in", values, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeBetween(Date value1, Date value2) {
            addCriterion("lastUpdatedTime between", value1, value2, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("lastUpdatedTime not between", value1, value2, "lastupdatedtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNull() {
            addCriterion("createdTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNotNull() {
            addCriterion("createdTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeEqualTo(Date value) {
            addCriterion("createdTime =", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotEqualTo(Date value) {
            addCriterion("createdTime <>", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThan(Date value) {
            addCriterion("createdTime >", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createdTime >=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThan(Date value) {
            addCriterion("createdTime <", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("createdTime <=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIn(List<Date> values) {
            addCriterion("createdTime in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotIn(List<Date> values) {
            addCriterion("createdTime not in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("createdTime between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("createdTime not between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPrjkeyIsNull() {
            addCriterion("prjKey is null");
            return (Criteria) this;
        }

        public Criteria andPrjkeyIsNotNull() {
            addCriterion("prjKey is not null");
            return (Criteria) this;
        }

        public Criteria andPrjkeyEqualTo(Integer value) {
            addCriterion("prjKey =", value, "prjkey");
            return (Criteria) this;
        }

        public Criteria andPrjkeyNotEqualTo(Integer value) {
            addCriterion("prjKey <>", value, "prjkey");
            return (Criteria) this;
        }

        public Criteria andPrjkeyGreaterThan(Integer value) {
            addCriterion("prjKey >", value, "prjkey");
            return (Criteria) this;
        }

        public Criteria andPrjkeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("prjKey >=", value, "prjkey");
            return (Criteria) this;
        }

        public Criteria andPrjkeyLessThan(Integer value) {
            addCriterion("prjKey <", value, "prjkey");
            return (Criteria) this;
        }

        public Criteria andPrjkeyLessThanOrEqualTo(Integer value) {
            addCriterion("prjKey <=", value, "prjkey");
            return (Criteria) this;
        }

        public Criteria andPrjkeyIn(List<Integer> values) {
            addCriterion("prjKey in", values, "prjkey");
            return (Criteria) this;
        }

        public Criteria andPrjkeyNotIn(List<Integer> values) {
            addCriterion("prjKey not in", values, "prjkey");
            return (Criteria) this;
        }

        public Criteria andPrjkeyBetween(Integer value1, Integer value2) {
            addCriterion("prjKey between", value1, value2, "prjkey");
            return (Criteria) this;
        }

        public Criteria andPrjkeyNotBetween(Integer value1, Integer value2) {
            addCriterion("prjKey not between", value1, value2, "prjkey");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_tracker_component
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 16 10:50:13 ICT 2015
     */
    @SuppressWarnings("ucd")
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_tracker_component
     *
     * @mbggenerated Thu Jul 16 10:50:13 ICT 2015
     */
    @SuppressWarnings("ucd")
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}