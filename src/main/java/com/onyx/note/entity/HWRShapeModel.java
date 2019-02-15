package com.onyx.note.entity;

import java.sql.Blob;
import java.util.Date;

/**
 * <pre>
 *     author : lxg
 *     time   : 2018/9/10 15:47
 *     desc   :
 * </pre>
 */
public class HWRShapeModel {

    private String uniqueId;

    private String groupId;

    private String pageUniqueId;

    private Date createdAt = null;

    private Date updatedAt = null;

    private int hwrShapeType = 16;

    private int hwrType = 0;

    private Blob points;

    private String matrixValues = null;

    private String textStyle;

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

    public String getExtraAttributes() {
        return extraAttributes;
    }

    public void setExtraAttributes(String extraAttributes) {
        this.extraAttributes = extraAttributes;
    }

    public int getHwrShapeType() {
        return hwrShapeType;
    }

    public void setHwrShapeType(int hwrShapeType) {
        this.hwrShapeType = hwrShapeType;
    }

    public int getHwrType() {
        return hwrType;
    }

    public void setHwrType(int hwrType) {
        this.hwrType = hwrType;
    }

    public Blob getPoints() {
        return points;
    }

    public void setPoints(Blob points) {
        this.points = points;
    }

    public String getMatrixValues() {
        return matrixValues;
    }

    public void setMatrixValues(String matrixValues) {
        this.matrixValues = matrixValues;
    }

    public String getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(String textStyle) {
        this.textStyle = textStyle;
    }
}
