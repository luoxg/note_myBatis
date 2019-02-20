package com.onyx.note.handler;

import com.alibaba.fastjson.JSON;
import com.onyx.note.entity.ShapeTextStyle;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lxg on 2019/2/14.
 */
public class ShapeTextStyleTypeHandler extends BaseTypeHandler<ShapeTextStyle> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, ShapeTextStyle parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSON.toJSONString(parameter));
    }

    @Override
    public ShapeTextStyle getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return JSON.parseObject(rs.getString(columnName), ShapeTextStyle.class);
    }

    @Override
    public ShapeTextStyle getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public ShapeTextStyle getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
