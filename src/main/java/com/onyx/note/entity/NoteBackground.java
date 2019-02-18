package com.onyx.note.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     author : lxw
 *     time   : 2018/4/25 16:22
 *     desc   :
 * </pre>
 */
public class NoteBackground implements Serializable {

    public Map<String, BkGroundRes> pageBKGroundMap = new HashMap<>();
    public BkGroundRes docBKGround = BkGroundRes.create();
    public BkGroundRes subBKGround;
    public boolean useDocBKGround;

    public NoteBackground() {
    }

    public void setPageBKGroundMap(Map<String, BkGroundRes> pageBKGroundMap) {
        this.pageBKGroundMap = pageBKGroundMap;
    }

    public Map<String, BkGroundRes> getPageBKGroundMap() {
        return pageBKGroundMap;
    }

    public BkGroundRes getDocBKGround() {
        return docBKGround;
    }

    public void setDocBKGround(BkGroundRes docBKGround) {
        this.docBKGround = docBKGround;
    }

    public BkGroundRes getSubBKGround() {
        return subBKGround;
    }

    public void setSubBKGround(BkGroundRes subBKGround) {
        this.subBKGround = subBKGround;
    }

    public boolean isUseDocBKGround() {
        return useDocBKGround;
    }

    public void setUseDocBKGround(boolean useDocBKGround) {
        this.useDocBKGround = useDocBKGround;
    }

}
