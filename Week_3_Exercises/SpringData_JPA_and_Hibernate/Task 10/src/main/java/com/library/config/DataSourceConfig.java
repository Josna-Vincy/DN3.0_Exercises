package com.library.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.primary")
    public DataSourceProperties primaryDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    public DataSource primaryDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(primaryDataSourceProperties().getDriverClassName());
        dataSource.setUrl(primaryDataSourceProperties().getUrl());
        dataSource.setUsername(primaryDataSourceProperties().getUsername());
        dataSource.setPassword(primaryDataSourceProperties().getPassword());
        return dataSource;
    }

    @Bean
    @ConfigurationProperties("spring.datasource.secondary")
    public DataSourceProperties secondaryDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Qualifier("secondaryDataSource")
    public DataSource secondaryDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(secondaryDataSourceProperties().getDriverClassName());
        dataSource.setUrl(secondaryDataSourceProperties().getUrl());
        dataSource.setUsername(secondaryDataSourceProperties().getUsername());
        dataSource.setPassword(secondaryDataSourceProperties().getPassword());
        return dataSource;
    }
}
