package com.onyx.note.entity;

import java.util.Date;

/**
 * <pre>
 *     author : lxg
 *     time   : 2018/9/10 15:47
 *     desc   :
 * </pre>
 */
public class HWRDataModel {

    private String uniqueId;

    private String groupId;

    private String pageUniqueId;

    private Date createdAt = null;

    private Date updatedAt = null;

    private String hwrResult;

    private String candidates;

    private String boundingRect = null;

    private String lang;

    private String extraAttributes;

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPageUniqueId() {
        return pageUniqueId;
    }

    public void setPageUniqueId(String pageUniqueId) {
        this.pageUniqueId = pageUniqueId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getHwrResult() {
        return hwrResult;
    }

    public void setHwrResult(String hwrResult) {
        this.hwrResult = hwrResult;
    }

    public String getCandidates() {
        return candidates;
    }

    public void setCandidates(String candidates) {
        this.candidates = candidates;
    }

    public String getBoundingRect() {
        return boundingRect;
    }

    public void setBoundingRect(String boundingRect) {
        this.boundingRect = boundingRect;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getExtraAttributes() {
        return extraAttributes;
    }

    public void setExtraAttributes(String extraAttributes) {
        this.extraAttributes = extraAttributes;
    }
}
