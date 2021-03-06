package com.example.dstest.configure;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @program: spring-boot-example
 * @description: 数据源配置类
 * @author:
 * @create: 2018-05-03 14:35
 **/

//@Configuration
//public class DataSourceConfig {
//
//    @Primary
//    @Bean(name = "primaryDataSourceProperties")
//    @Qualifier("primaryDataSourceProperties")
//    @ConfigurationProperties(prefix = "spring.datasource.primary")
//    public DataSourceProperties primaryDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Primary
//    @Bean(name = "primaryDataSource")
//    @Qualifier("primaryDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.primary")
//    public DataSource primaryDataSource(@Qualifier("primaryDataSourceProperties") DataSourceProperties dataSourceProperties) {
//        return dataSourceProperties.initializeDataSourceBuilder().build();
//    }
//
//    @Bean(name = "secondaryDataSourceProperties")
//    @Qualifier("secondaryDataSourceProperties")
//    @ConfigurationProperties(prefix = "spring.datasource.secondary")
//    public DataSourceProperties secondaryDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean(name = "secondaryDataSource")
//    @Qualifier("secondaryDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.secondary")
//    public DataSource secondaryDataSource(@Qualifier("secondaryDataSourceProperties") DataSourceProperties dataSourceProperties) {
//        return dataSourceProperties.initializeDataSourceBuilder().build();
//    }
//
//
//
//    @Bean(name = "primaryJdbcTemplate")
//    public JdbcTemplate primaryJdbcTemplate(
//            @Qualifier("primaryDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//
//    @Bean(name = "secondaryJdbcTemplate")
//    public JdbcTemplate secondaryJdbcTemplate(
//            @Qualifier("secondaryDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//}
