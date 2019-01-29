package com.onyx.note.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;

/**
 * Created by zhuzeng on 6/21/16.
 * Represent library container and document. When document id is not null, it's a document
 * when library id is not null, it's a library.
 */
public class NoteModel {
    private long id;
    private Date createdAt = null;
    private Date updatedAt = null;
    private String uniqueId;
    private String parentUniqueId;
    private String subPageName;
    private String title;
    private String extraAttributes;
    private int type;
    private float strokeWidth;
    private float eraserWidth;
    private JSONObject noteBackground = null;
    private int strokeColor = 0;
    private int currentShapeType = -1;
    private int background;
    private int lineLayoutBackground;
    private int position;
    private JSONObject pageNameList = null;
    private float pageOriginWidth;
    private float pageOriginHeight;
    private String source = DEFAULT_SOURCE;
    private String pin;
    private int asyncStatus;

    private static final float DEFAULT_STROKE_WIDTH = 2.0f;
    private static float DEFAULT_ERASER_WIDTH = 20.0f;
    private static float DEFAULT_ERASER_RADIUS = 15.0f;
    private static int DEFAULT_STROKE_COLOR = -1;
    private static String DEFAULT_SOURCE = "Local";
    public static String LOCAL_UPDATE_SOURCE = "Local_Update";

    public NoteModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getParentUniqueId() {
        return parentUniqueId;
    }

    public void setParentUniqueId(String parentUniqueId) {
        this.parentUniqueId = parentUniqueId;
    }

    public String getSubPageName() {
        return subPageName;
    }

    public void setSubPageName(String subPageName) {
        this.subPageName = subPageName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExtraAttributes() {
        return extraAttributes;
    }

    public void setExtraAttributes(String extraAttributes) {
        this.extraAttributes = extraAttributes;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public float getEraserWidth() {
        return eraserWidth;
    }

    public void setEraserWidth(float eraserWidth) {
        this.eraserWidth = eraserWidth;
    }

    public String getNoteBackground() {
        return JSON.toJSONString(noteBackground);
    }

    public void setNoteBackground(JSONObject noteBackground) {
        this.noteBackground = noteBackground;
    }

    public int getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(int strokeColor) {
        this.strokeColor = strokeColor;
    }

    public int getCurrentShapeType() {
        return currentShapeType;
    }

    public void setCurrentShapeType(int currentShapeType) {
        this.currentShapeType = currentShapeType;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public int getLineLayoutBackground() {
        return lineLayoutBackground;
    }

    public void setLineLayoutBackground(int lineLayoutBackground) {
        this.lineLayoutBackground = lineLayoutBackground;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getPageNameList() {
        return JSON.toJSONString(pageNameList);
    }

    public void setPageNameList(JSONObject pageNameList) {
        this.pageNameList = pageNameList;
    }

    public float getPageOriginWidth() {
        return pageOriginWidth;
    }

    public void setPageOriginWidth(float pageOriginWidth) {
        this.pageOriginWidth = pageOriginWidth;
    }

    public float getPageOriginHeight() {
        return pageOriginHeight;
    }

    public void setPageOriginHeight(float pageOriginHeight) {
        this.pageOriginHeight = pageOriginHeight;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getAsyncStatus() {
        return asyncStatus;
    }

    public void setAsyncStatus(int asyncStatus) {
        this.asyncStatus = asyncStatus;
    }
}
