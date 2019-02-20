package com.onyx.note.entity;

import java.util.Date;

/**
 * Created by zhuzeng on 6/3/16.
 * Data model for all shapes.
 */
public class ShapeModel{

    private long id;
    private String shapeUniqueId;
    private Date createdAt = null;
    private Date updatedAt = null;
    private String documentUniqueId;
    private String pageUniqueId;
    private String subPageName;
    private String appId;
    private int pageOriginWidth;
    private int pageOriginHeight;
    private int color;
    private float thickness;
    private int zorder;
    private TouchPointList points;
    private RectF boundingRect = null;
    private MatrixValues matrixValues = null;
    private ShapeTextStyle textStyle;
    private String text;
    private int shapeType;
    private String extraAttributes;
    private String groupId;
    private int layoutType;
    private float orientation = 0f;
    private float rotationPointXCoordinate = 0f;
    private float rotationPointYCoordinate = 0f;

    public ShapeModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShapeUniqueId() {
        return shapeUniqueId;
    }

    public void setShapeUniqueId(String shapeUniqueId) {
        this.shapeUniqueId = shapeUniqueId;
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

    public String getDocumentUniqueId() {
        return documentUniqueId;
    }

    public void setDocumentUniqueId(String documentUniqueId) {
        this.documentUniqueId = documentUniqueId;
    }

    public String getPageUniqueId() {
        return pageUniqueId;
    }

    public void setPageUniqueId(String pageUniqueId) {
        this.pageUniqueId = pageUniqueId;
    }

    public String getSubPageName() {
        return subPageName;
    }

    public void setSubPageName(String subPageName) {
        this.subPageName = subPageName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public int getPageOriginWidth() {
        return pageOriginWidth;
    }

    public void setPageOriginWidth(int pageOriginWidth) {
        this.pageOriginWidth = pageOriginWidth;
    }

    public int getPageOriginHeight() {
        return pageOriginHeight;
    }

    public void setPageOriginHeight(int pageOriginHeight) {
        this.pageOriginHeight = pageOriginHeight;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public int getZorder() {
        return zorder;
    }

    public void setZorder(int zorder) {
        this.zorder = zorder;
    }

    public TouchPointList getPoints() {
        return points;
    }

    public void setPoints(TouchPointList points) {
        this.points = points;
    }

    public RectF getBoundingRect() {
        return boundingRect;
    }

    public void setBoundingRect(RectF boundingRect) {
        this.boundingRect = boundingRect;
    }

    public MatrixValues getMatrixValues() {
        return matrixValues;
    }

    public void setMatrixValues(MatrixValues matrixValues) {
        this.matrixValues = matrixValues;
    }

    public ShapeTextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(ShapeTextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getShapeType() {
        return shapeType;
    }

    public void setShapeType(int shapeType) {
        this.shapeType = shapeType;
    }

    public String getExtraAttributes() {
        return extraAttributes;
    }

    public void setExtraAttributes(String extraAttributes) {
        this.extraAttributes = extraAttributes;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(int layoutType) {
        this.layoutType = layoutType;
    }

    public float getOrientation() {
        return orientation;
    }

    public void setOrientation(float orientation) {
        this.orientation = orientation;
    }

    public float getRotationPointXCoordinate() {
        return rotationPointXCoordinate;
    }

    public void setRotationPointXCoordinate(float rotationPointXCoordinate) {
        this.rotationPointXCoordinate = rotationPointXCoordinate;
    }

    public float getRotationPointYCoordinate() {
        return rotationPointYCoordinate;
    }

    public void setRotationPointYCoordinate(float rotationPointYCoordinate) {
        this.rotationPointYCoordinate = rotationPointYCoordinate;
    }
}