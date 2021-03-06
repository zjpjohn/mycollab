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
package com.mycollab.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("ucd")
public class LiveInstanceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    public LiveInstanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
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
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
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

        public Criteria andAppversionIsNull() {
            addCriterion("appVersion is null");
            return (Criteria) this;
        }

        public Criteria andAppversionIsNotNull() {
            addCriterion("appVersion is not null");
            return (Criteria) this;
        }

        public Criteria andAppversionEqualTo(String value) {
            addCriterion("appVersion =", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotEqualTo(String value) {
            addCriterion("appVersion <>", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionGreaterThan(String value) {
            addCriterion("appVersion >", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionGreaterThanOrEqualTo(String value) {
            addCriterion("appVersion >=", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionLessThan(String value) {
            addCriterion("appVersion <", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionLessThanOrEqualTo(String value) {
            addCriterion("appVersion <=", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionLike(String value) {
            addCriterion("appVersion like", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotLike(String value) {
            addCriterion("appVersion not like", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionIn(List<String> values) {
            addCriterion("appVersion in", values, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotIn(List<String> values) {
            addCriterion("appVersion not in", values, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionBetween(String value1, String value2) {
            addCriterion("appVersion between", value1, value2, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotBetween(String value1, String value2) {
            addCriterion("appVersion not between", value1, value2, "appversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionIsNull() {
            addCriterion("javaVersion is null");
            return (Criteria) this;
        }

        public Criteria andJavaversionIsNotNull() {
            addCriterion("javaVersion is not null");
            return (Criteria) this;
        }

        public Criteria andJavaversionEqualTo(String value) {
            addCriterion("javaVersion =", value, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionNotEqualTo(String value) {
            addCriterion("javaVersion <>", value, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionGreaterThan(String value) {
            addCriterion("javaVersion >", value, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionGreaterThanOrEqualTo(String value) {
            addCriterion("javaVersion >=", value, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionLessThan(String value) {
            addCriterion("javaVersion <", value, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionLessThanOrEqualTo(String value) {
            addCriterion("javaVersion <=", value, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionLike(String value) {
            addCriterion("javaVersion like", value, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionNotLike(String value) {
            addCriterion("javaVersion not like", value, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionIn(List<String> values) {
            addCriterion("javaVersion in", values, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionNotIn(List<String> values) {
            addCriterion("javaVersion not in", values, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionBetween(String value1, String value2) {
            addCriterion("javaVersion between", value1, value2, "javaversion");
            return (Criteria) this;
        }

        public Criteria andJavaversionNotBetween(String value1, String value2) {
            addCriterion("javaVersion not between", value1, value2, "javaversion");
            return (Criteria) this;
        }

        public Criteria andInstalleddateIsNull() {
            addCriterion("installedDate is null");
            return (Criteria) this;
        }

        public Criteria andInstalleddateIsNotNull() {
            addCriterion("installedDate is not null");
            return (Criteria) this;
        }

        public Criteria andInstalleddateEqualTo(Date value) {
            addCriterion("installedDate =", value, "installeddate");
            return (Criteria) this;
        }

        public Criteria andInstalleddateNotEqualTo(Date value) {
            addCriterion("installedDate <>", value, "installeddate");
            return (Criteria) this;
        }

        public Criteria andInstalleddateGreaterThan(Date value) {
            addCriterion("installedDate >", value, "installeddate");
            return (Criteria) this;
        }

        public Criteria andInstalleddateGreaterThanOrEqualTo(Date value) {
            addCriterion("installedDate >=", value, "installeddate");
            return (Criteria) this;
        }

        public Criteria andInstalleddateLessThan(Date value) {
            addCriterion("installedDate <", value, "installeddate");
            return (Criteria) this;
        }

        public Criteria andInstalleddateLessThanOrEqualTo(Date value) {
            addCriterion("installedDate <=", value, "installeddate");
            return (Criteria) this;
        }

        public Criteria andInstalleddateIn(List<Date> values) {
            addCriterion("installedDate in", values, "installeddate");
            return (Criteria) this;
        }

        public Criteria andInstalleddateNotIn(List<Date> values) {
            addCriterion("installedDate not in", values, "installeddate");
            return (Criteria) this;
        }

        public Criteria andInstalleddateBetween(Date value1, Date value2) {
            addCriterion("installedDate between", value1, value2, "installeddate");
            return (Criteria) this;
        }

        public Criteria andInstalleddateNotBetween(Date value1, Date value2) {
            addCriterion("installedDate not between", value1, value2, "installeddate");
            return (Criteria) this;
        }

        public Criteria andSysidIsNull() {
            addCriterion("sysId is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("sysId is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(String value) {
            addCriterion("sysId =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(String value) {
            addCriterion("sysId <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(String value) {
            addCriterion("sysId >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(String value) {
            addCriterion("sysId >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(String value) {
            addCriterion("sysId <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(String value) {
            addCriterion("sysId <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLike(String value) {
            addCriterion("sysId like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotLike(String value) {
            addCriterion("sysId not like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<String> values) {
            addCriterion("sysId in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<String> values) {
            addCriterion("sysId not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(String value1, String value2) {
            addCriterion("sysId between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(String value1, String value2) {
            addCriterion("sysId not between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesIsNull() {
            addCriterion("sysProperties is null");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesIsNotNull() {
            addCriterion("sysProperties is not null");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesEqualTo(String value) {
            addCriterion("sysProperties =", value, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesNotEqualTo(String value) {
            addCriterion("sysProperties <>", value, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesGreaterThan(String value) {
            addCriterion("sysProperties >", value, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("sysProperties >=", value, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesLessThan(String value) {
            addCriterion("sysProperties <", value, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesLessThanOrEqualTo(String value) {
            addCriterion("sysProperties <=", value, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesLike(String value) {
            addCriterion("sysProperties like", value, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesNotLike(String value) {
            addCriterion("sysProperties not like", value, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesIn(List<String> values) {
            addCriterion("sysProperties in", values, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesNotIn(List<String> values) {
            addCriterion("sysProperties not in", values, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesBetween(String value1, String value2) {
            addCriterion("sysProperties between", value1, value2, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andSyspropertiesNotBetween(String value1, String value2) {
            addCriterion("sysProperties not between", value1, value2, "sysproperties");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateIsNull() {
            addCriterion("lastUpdatedDate is null");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateIsNotNull() {
            addCriterion("lastUpdatedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateEqualTo(Date value) {
            addCriterion("lastUpdatedDate =", value, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateNotEqualTo(Date value) {
            addCriterion("lastUpdatedDate <>", value, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateGreaterThan(Date value) {
            addCriterion("lastUpdatedDate >", value, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUpdatedDate >=", value, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateLessThan(Date value) {
            addCriterion("lastUpdatedDate <", value, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateLessThanOrEqualTo(Date value) {
            addCriterion("lastUpdatedDate <=", value, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateIn(List<Date> values) {
            addCriterion("lastUpdatedDate in", values, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateNotIn(List<Date> values) {
            addCriterion("lastUpdatedDate not in", values, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateBetween(Date value1, Date value2) {
            addCriterion("lastUpdatedDate between", value1, value2, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andLastupdateddateNotBetween(Date value1, Date value2) {
            addCriterion("lastUpdatedDate not between", value1, value2, "lastupdateddate");
            return (Criteria) this;
        }

        public Criteria andNumprojectsIsNull() {
            addCriterion("numProjects is null");
            return (Criteria) this;
        }

        public Criteria andNumprojectsIsNotNull() {
            addCriterion("numProjects is not null");
            return (Criteria) this;
        }

        public Criteria andNumprojectsEqualTo(Integer value) {
            addCriterion("numProjects =", value, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumprojectsNotEqualTo(Integer value) {
            addCriterion("numProjects <>", value, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumprojectsGreaterThan(Integer value) {
            addCriterion("numProjects >", value, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumprojectsGreaterThanOrEqualTo(Integer value) {
            addCriterion("numProjects >=", value, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumprojectsLessThan(Integer value) {
            addCriterion("numProjects <", value, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumprojectsLessThanOrEqualTo(Integer value) {
            addCriterion("numProjects <=", value, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumprojectsIn(List<Integer> values) {
            addCriterion("numProjects in", values, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumprojectsNotIn(List<Integer> values) {
            addCriterion("numProjects not in", values, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumprojectsBetween(Integer value1, Integer value2) {
            addCriterion("numProjects between", value1, value2, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumprojectsNotBetween(Integer value1, Integer value2) {
            addCriterion("numProjects not between", value1, value2, "numprojects");
            return (Criteria) this;
        }

        public Criteria andNumusersIsNull() {
            addCriterion("numUsers is null");
            return (Criteria) this;
        }

        public Criteria andNumusersIsNotNull() {
            addCriterion("numUsers is not null");
            return (Criteria) this;
        }

        public Criteria andNumusersEqualTo(Integer value) {
            addCriterion("numUsers =", value, "numusers");
            return (Criteria) this;
        }

        public Criteria andNumusersNotEqualTo(Integer value) {
            addCriterion("numUsers <>", value, "numusers");
            return (Criteria) this;
        }

        public Criteria andNumusersGreaterThan(Integer value) {
            addCriterion("numUsers >", value, "numusers");
            return (Criteria) this;
        }

        public Criteria andNumusersGreaterThanOrEqualTo(Integer value) {
            addCriterion("numUsers >=", value, "numusers");
            return (Criteria) this;
        }

        public Criteria andNumusersLessThan(Integer value) {
            addCriterion("numUsers <", value, "numusers");
            return (Criteria) this;
        }

        public Criteria andNumusersLessThanOrEqualTo(Integer value) {
            addCriterion("numUsers <=", value, "numusers");
            return (Criteria) this;
        }

        public Criteria andNumusersIn(List<Integer> values) {
            addCriterion("numUsers in", values, "numusers");
            return (Criteria) this;
        }

        public Criteria andNumusersNotIn(List<Integer> values) {
            addCriterion("numUsers not in", values, "numusers");
            return (Criteria) this;
        }

        public Criteria andNumusersBetween(Integer value1, Integer value2) {
            addCriterion("numUsers between", value1, value2, "numusers");
            return (Criteria) this;
        }

        public Criteria andNumusersNotBetween(Integer value1, Integer value2) {
            addCriterion("numUsers not between", value1, value2, "numusers");
            return (Criteria) this;
        }

        public Criteria andEditionIsNull() {
            addCriterion("edition is null");
            return (Criteria) this;
        }

        public Criteria andEditionIsNotNull() {
            addCriterion("edition is not null");
            return (Criteria) this;
        }

        public Criteria andEditionEqualTo(String value) {
            addCriterion("edition =", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotEqualTo(String value) {
            addCriterion("edition <>", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionGreaterThan(String value) {
            addCriterion("edition >", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionGreaterThanOrEqualTo(String value) {
            addCriterion("edition >=", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionLessThan(String value) {
            addCriterion("edition <", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionLessThanOrEqualTo(String value) {
            addCriterion("edition <=", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionLike(String value) {
            addCriterion("edition like", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotLike(String value) {
            addCriterion("edition not like", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionIn(List<String> values) {
            addCriterion("edition in", values, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotIn(List<String> values) {
            addCriterion("edition not in", values, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionBetween(String value1, String value2) {
            addCriterion("edition between", value1, value2, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotBetween(String value1, String value2) {
            addCriterion("edition not between", value1, value2, "edition");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_live_instances
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 24 11:44:39 ICT 2016
     */
    @SuppressWarnings("ucd")
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_live_instances
     *
     * @mbggenerated Wed Aug 24 11:44:39 ICT 2016
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