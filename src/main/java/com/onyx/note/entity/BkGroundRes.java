package com.onyx.note.entity;

import java.io.Serializable;

/**
 * <pre>
 *     author : lxw
 *     time   : 2018/4/27 14:28
 *     desc   :
 * </pre>
 */
public class BkGroundRes implements Serializable {

    public int type = NoteBackgroundType.defaultBackground();
    public String value;
    public int resIndex;

    public BkGroundRes() {
    }

    public BkGroundRes(BkGroundRes res) {
        if (res == null) {
            return;
        }
        type = res.type;
        value = res.value;
        resIndex = res.resIndex;
    }

    public BkGroundRes(int type) {
        this.type = type;
    }

    public BkGroundRes(int type, String value) {
        this.type = type;
        this.value = value;
    }

    public BkGroundRes(int type, String value, int resIndex) {
        this.type = type;
        this.value = value;
        this.resIndex = resIndex;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public int getResIndex() {
        return resIndex;
    }

    public BkGroundRes setResIndex(int resIndex) {
        this.resIndex = resIndex;
        return this;
    }

    public boolean hasBkGround() {
        return type > NoteBackgroundType.EMPTY;
    }

    public boolean isFullScreenBKGround() {
        return type == NoteBackgroundType.JD_MEETING_MINUTES
                || type == NoteBackgroundType.JD_TODO_LIST
                || type == NoteBackgroundType.JD_WEEK_PLAN;
    }

    public static BkGroundRes create() {
        return new BkGroundRes();
    }

    public static BkGroundRes create(int type) {
        return new BkGroundRes(type);
    }

    public static BkGroundRes create(int type, String value) {
        return new BkGroundRes(type, value);
    }

    public static BkGroundRes create(int type, String value, int resIndex) {
        return new BkGroundRes(type, value, resIndex);
    }

    public static int resIndexMapping(int pageIndex, int resCount) {
        if (resCount == 0) {
            return 0;
        }
        return pageIndex % resCount;
    }

    public static boolean isPdfBkGroundRes(BkGroundRes bkGroundRes) {
        return bkGroundRes.getType() == NoteBackgroundType.PDF_FILE;
    }

    public static boolean isImageBkGroundRes(BkGroundRes bkGroundRes) {
        return bkGroundRes.getType() == NoteBackgroundType.IMAGE_FILE;
    }
}
