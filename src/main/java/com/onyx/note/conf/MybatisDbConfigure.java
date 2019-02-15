package com.onyx.note.conf;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by lxg on 2019/1/28.
 */

@Configuration
public class MybatisDbConfigure {

    @Value(value = "${driverClassName:com.mysql.cj.jdbc.Driver}")
    private String driverClassName;

    @Value(value = "${dataUserName:root}")
    private String dataUserName;

    @Value(value = "${url:jdbc:mysql://localhost:3306/note_sync?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC}")
    private String url;

    @Value(value = "${passWord:root}")
    private String passWord;

    protected static Log log = LogFactory.getLog(MybatisDbConfigure.class);

    @Bean(name = "sqlSessionFactoryBean")
    public SqlSessionFactoryBean myGetSqlSessionFactory(DataSource dataSource) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mapping/*Mapper.xml"));
        } catch (IOException e) {
            log.info("sqlSessionFactoryBean的setMapperLocations有问题");
            e.printStackTrace();
        }
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;

    }

    @Bean(name = "dataSource")
    public BasicDataSource myGetDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setPassword(passWord);
        dataSource.setUsername(dataUserName);
        dataSource.setMaxIdle(2);
        dataSource.setMaxActive(20);
        dataSource.setMaxWait(1000);
        dataSource.setInitialSize(2);

        //
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setRemoveAbandoned(true);
        dataSource.setTestWhileIdle(true);
        dataSource.setTimeBetweenEvictionRunsMillis(30000);
        dataSource.setNumTestsPerEvictionRun(30);
        dataSource.setMinEvictableIdleTimeMillis(1800000);
        return dataSource;
    }
}
