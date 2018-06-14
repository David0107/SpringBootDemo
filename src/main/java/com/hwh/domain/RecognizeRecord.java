package com.hwh.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 识别记录
 * @author Harve
 *
 */
public class RecognizeRecord implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long recognizeRecordId;

    private Long orgId;

    private String orgName;

    private String catchImageUrl;

    private String matchImageUrl;

    private Long personId;

    private Long userId;

    private Byte recognizeUserType;

    private Long facePicId;

    private String mobile;

    private String realName;

    private String identityNo;

    private String uniqueNumber;

    private Long recognizeTime;

    private Long subOrgId;

    private String subOrgCode;

    private String subOrgRemark;

    private String relationSubOrgRemark;

    private String department;

    private Double quality;

    private Double confidence;

    private Integer recognizeType;

    private Byte status;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getRecognizeRecordId() {
        return recognizeRecordId;
    }

    public void setRecognizeRecordId(Long recognizeRecordId) {
        this.recognizeRecordId = recognizeRecordId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getCatchImageUrl() {
        return catchImageUrl;
    }

    public void setCatchImageUrl(String catchImageUrl) {
        this.catchImageUrl = catchImageUrl == null ? null : catchImageUrl.trim();
    }

    public String getMatchImageUrl() {
        return matchImageUrl;
    }

    public void setMatchImageUrl(String matchImageUrl) {
        this.matchImageUrl = matchImageUrl == null ? null : matchImageUrl.trim();
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getRecognizeUserType() {
        return recognizeUserType;
    }

    public void setRecognizeUserType(Byte recognizeUserType) {
        this.recognizeUserType = recognizeUserType;
    }

    public Long getFacePicId() {
        return facePicId;
    }

    public void setFacePicId(Long facePicId) {
        this.facePicId = facePicId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber == null ? null : uniqueNumber.trim();
    }

    public Long getRecognizeTime() {
        return recognizeTime;
    }

    public void setRecognizeTime(Long recognizeTime) {
        this.recognizeTime = recognizeTime;
    }

    public Long getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(Long subOrgId) {
        this.subOrgId = subOrgId;
    }

    public String getSubOrgCode() {
        return subOrgCode;
    }

    public void setSubOrgCode(String subOrgCode) {
        this.subOrgCode = subOrgCode == null ? null : subOrgCode.trim();
    }

    public String getSubOrgRemark() {
        return subOrgRemark;
    }

    public void setSubOrgRemark(String subOrgRemark) {
        this.subOrgRemark = subOrgRemark == null ? null : subOrgRemark.trim();
    }

    public String getRelationSubOrgRemark() {
        return relationSubOrgRemark;
    }

    public void setRelationSubOrgRemark(String relationSubOrgRemark) {
        this.relationSubOrgRemark = relationSubOrgRemark == null ? null : relationSubOrgRemark.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Double getQuality() {
        return quality;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public Integer getRecognizeType() {
        return recognizeType;
    }

    public void setRecognizeType(Integer recognizeType) {
        this.recognizeType = recognizeType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}