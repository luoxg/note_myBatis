package com.onyx.note.handler;

import com.alibaba.fastjson.JSON;
import com.onyx.note.entity.RectF;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lxg on 2019/2/14.
 */
public class RectFTypeHandler extends BaseTypeHandler<RectF> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, RectF parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSON.toJSONString(parameter));
    }

    @Override
    public RectF getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return JSON.parseObject(rs.getString(columnName), RectF.class);
    }

    @Override
    public RectF getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public RectF getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
