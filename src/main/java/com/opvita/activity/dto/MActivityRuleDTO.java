package com.opvita.activity.dto;

import java.math.BigDecimal;
import java.util.Date;

public class MActivityRuleDTO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.ISSUER_ID
     *
     * @mbggenerated
     */
    private String issuerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.QUALIFICATION
     *
     * @mbggenerated
     */
    private String qualification;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.PAY_TYPE
     *
     * @mbggenerated
     */
    private String payType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.MUTEX
     *
     * @mbggenerated
     */
    private String mutex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.PRIORITY
     *
     * @mbggenerated
     */
    private BigDecimal priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.SECTION_BEGIN
     *
     * @mbggenerated
     */
    private Long sectionBegin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.SECTION_END
     *
     * @mbggenerated
     */
    private Long sectionEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.CREATE_USER
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.CREATE_TIMESTAMP
     *
     * @mbggenerated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.UPDATE_USER
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_ACTIVITY_RULE.UPDATE_TIMESTAMP
     *
     * @mbggenerated
     */
    private Date updateTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.ID
     *
     * @return the value of M_ACTIVITY_RULE.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.ID
     *
     * @param id the value for M_ACTIVITY_RULE.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.ISSUER_ID
     *
     * @return the value of M_ACTIVITY_RULE.ISSUER_ID
     *
     * @mbggenerated
     */
    public String getIssuerId() {
        return issuerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.ISSUER_ID
     *
     * @param issuerId the value for M_ACTIVITY_RULE.ISSUER_ID
     *
     * @mbggenerated
     */
    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId == null ? null : issuerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.STATUS
     *
     * @return the value of M_ACTIVITY_RULE.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.STATUS
     *
     * @param status the value for M_ACTIVITY_RULE.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.QUALIFICATION
     *
     * @return the value of M_ACTIVITY_RULE.QUALIFICATION
     *
     * @mbggenerated
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.QUALIFICATION
     *
     * @param qualification the value for M_ACTIVITY_RULE.QUALIFICATION
     *
     * @mbggenerated
     */
    public void setQualification(String qualification) {
        this.qualification = qualification == null ? null : qualification.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.PAY_TYPE
     *
     * @return the value of M_ACTIVITY_RULE.PAY_TYPE
     *
     * @mbggenerated
     */
    public String getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.PAY_TYPE
     *
     * @param payType the value for M_ACTIVITY_RULE.PAY_TYPE
     *
     * @mbggenerated
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.MUTEX
     *
     * @return the value of M_ACTIVITY_RULE.MUTEX
     *
     * @mbggenerated
     */
    public String getMutex() {
        return mutex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.MUTEX
     *
     * @param mutex the value for M_ACTIVITY_RULE.MUTEX
     *
     * @mbggenerated
     */
    public void setMutex(String mutex) {
        this.mutex = mutex == null ? null : mutex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.PRIORITY
     *
     * @return the value of M_ACTIVITY_RULE.PRIORITY
     *
     * @mbggenerated
     */
    public BigDecimal getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.PRIORITY
     *
     * @param priority the value for M_ACTIVITY_RULE.PRIORITY
     *
     * @mbggenerated
     */
    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.SECTION_BEGIN
     *
     * @return the value of M_ACTIVITY_RULE.SECTION_BEGIN
     *
     * @mbggenerated
     */
    public Long getSectionBegin() {
        return sectionBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.SECTION_BEGIN
     *
     * @param sectionBegin the value for M_ACTIVITY_RULE.SECTION_BEGIN
     *
     * @mbggenerated
     */
    public void setSectionBegin(Long sectionBegin) {
        this.sectionBegin = sectionBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.SECTION_END
     *
     * @return the value of M_ACTIVITY_RULE.SECTION_END
     *
     * @mbggenerated
     */
    public Long getSectionEnd() {
        return sectionEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.SECTION_END
     *
     * @param sectionEnd the value for M_ACTIVITY_RULE.SECTION_END
     *
     * @mbggenerated
     */
    public void setSectionEnd(Long sectionEnd) {
        this.sectionEnd = sectionEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.CREATE_USER
     *
     * @return the value of M_ACTIVITY_RULE.CREATE_USER
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.CREATE_USER
     *
     * @param createUser the value for M_ACTIVITY_RULE.CREATE_USER
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.CREATE_TIMESTAMP
     *
     * @return the value of M_ACTIVITY_RULE.CREATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.CREATE_TIMESTAMP
     *
     * @param createTimestamp the value for M_ACTIVITY_RULE.CREATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.UPDATE_USER
     *
     * @return the value of M_ACTIVITY_RULE.UPDATE_USER
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.UPDATE_USER
     *
     * @param updateUser the value for M_ACTIVITY_RULE.UPDATE_USER
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_ACTIVITY_RULE.UPDATE_TIMESTAMP
     *
     * @return the value of M_ACTIVITY_RULE.UPDATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_ACTIVITY_RULE.UPDATE_TIMESTAMP
     *
     * @param updateTimestamp the value for M_ACTIVITY_RULE.UPDATE_TIMESTAMP
     *
     * @mbggenerated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}