package com.onyx.note.utils;

import com.onyx.note.entity.TouchPoint;
import com.onyx.note.entity.TouchPointList;

import java.io.*;

/**
 */
public class SerializationUtils {

    /**
     *
     * @param touchPointList
     * @return return null if failed
     */
    public static InputStream pointsToInputStream(TouchPointList touchPointList) {
        if (touchPointList == null) {
            return new DataInputStream(new ByteArrayInputStream(new byte[0]));
        }
        DataOutputStream dout = null;
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            dout = new DataOutputStream(bout);
            for (TouchPoint p : touchPointList.getPoints()) {
                dout.writeFloat(p.getX());
                dout.writeFloat(p.getY());
                dout.writeFloat(p.getPressure());
                dout.writeFloat(p.getSize());
                dout.writeLong(p.getTimestamp());
            }
            byte[] bytes = bout.toByteArray();
            return new ByteArrayInputStream(bytes);
        } catch (Throwable tr) {
            tr.printStackTrace();
        } finally {
            if (dout != null) {
                try {
                    dout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return new DataInputStream(new ByteArrayInputStream(new byte[0]));
    }

    /**
     *
     * @param blob
     * @return return null if failed
     */
    public static TouchPointList pointsFromByteArray(byte[] blob) {
        TouchPointList points = new TouchPointList(100);
        if (blob == null) {
            return points;
        }

        ByteArrayInputStream bin = null;
        try {
            bin = new ByteArrayInputStream(blob);
            DataInputStream din = new DataInputStream(bin);
            for (int i = 0; i < blob.length / 24; i++) {
                float x = din.readFloat();
                float y = din.readFloat();
                float pressure = din.readFloat();
                float size = din.readFloat();
                long event_time = din.readLong();
                points.add(new TouchPoint(x, y, pressure, size, event_time));
            }

            return points;
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            if (bin != null) {
                try {
                    bin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return points;
    }
}
