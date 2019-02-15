package com.onyx.note.entity;

/**
 * Created by lxg on 2019/2/14.
 */
public class TestData {
    private long id;
    private String name;
    private TouchPointList data;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TouchPointList getData() {
        return data;
    }

    public void setData(TouchPointList data) {
        this.data = data;
    }
}
