package com.onyx.note.handler;

import com.alibaba.fastjson.JSON;
import com.onyx.note.entity.PageNameList;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lxg on 2019/2/14.
 */
public class PageNameListTypeHandler extends BaseTypeHandler<PageNameList> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, PageNameList parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSON.toJSONString(parameter));
    }

    @Override
    public PageNameList getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return JSON.parseObject(rs.getString(columnName), PageNameList.class);
    }

    @Override
    public PageNameList getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public PageNameList getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
