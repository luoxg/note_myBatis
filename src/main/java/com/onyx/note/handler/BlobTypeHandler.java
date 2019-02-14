package com.onyx.note.handler;

import com.onyx.note.entity.TouchPointList;
import com.onyx.note.utils.SerializationUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

/**
 * Created by User on 2019/2/14.
 */
public class BlobTypeHandler extends BaseTypeHandler<TouchPointList> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, TouchPointList parameter, JdbcType jdbcType) throws SQLException {
        InputStream inputStream = SerializationUtils.pointsToInputStream(parameter);
        try {
            ps.setBinaryStream(i, inputStream, inputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public TouchPointList getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Blob blob = rs.getBlob(columnName);
        byte[] returnValue = null;
        if (null != blob) {
            returnValue = blob.getBytes(1, (int) blob.length());
        }
        return SerializationUtils.pointsFromByteArray(returnValue);
    }

    @Override
    public TouchPointList getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public TouchPointList getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
