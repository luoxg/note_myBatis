package com.onyx.note.entity;


import java.io.Serializable;

/**
 * Created by zhuzeng on 4/22/16.
 */
public class TouchPoint implements Serializable, Cloneable {

    public float x;

    public float y;

    public float pressure;

    public float size;

    public long timestamp;

    public TouchPoint() {
    }

    public TouchPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public TouchPoint(final float px, final float py, final float p, final float s, final long ts) {
        x = px;
        y = py;
        pressure = p;
        size = s;
        timestamp = ts;
    }

    public TouchPoint(final TouchPoint source) {
        x = source.getX();
        y = source.getY();
        pressure = source.getPressure();
        size = source.getSize();
        timestamp = source.getTimestamp();
    }

    public void set(final TouchPoint point) {
        x = point.x;
        y = point.y;
        pressure = point.pressure;
        size = point.size;
        timestamp = point.timestamp;
    }

    public void offset(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getPressure() {
        return pressure;
    }

    public float getSize() {
        return size;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void scale(final float scaleValue) {
        x = x * scaleValue;
        y = y * scaleValue;
    }

    @Override
    public TouchPoint clone() throws CloneNotSupportedException {
        TouchPoint clone;
        clone = (TouchPoint) super.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "x:" + x + " y:" + y;
    }

    public static float getPointAngle(TouchPoint start, TouchPoint end) {
        double tan = Math.atan2(end.x - start.x, start.y - end.y);
        return (float) (180*tan/Math.PI);
    }

    public static float getPointDistance(float x1, float y1, float x2, float y2) {
        return (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
