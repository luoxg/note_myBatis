package com.onyx.note.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by User on 2019/2/22.
 */
public class UploadRequestBean {
    private String md5;
    private String name;
    @JSONField(name = "package")
    private String packageName;
    private String deviceMAC;
    private String notemodel;

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackage() {
        return packageName;
    }

    public void setPackage(String packageName) {
        this.packageName = packageName;
    }

    public String getDeviceMAC() {
        return deviceMAC;
    }

    public void setDeviceMAC(String deviceMAC) {
        this.deviceMAC = deviceMAC;
    }

    public String getNotemodel() {
        return notemodel;
    }

    public void setNotemodel(String notemodel) {
        this.notemodel = notemodel;
    }
}
