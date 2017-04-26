package com.taiji.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Sleeb on 2017/4/25.
 */
@Configuration
public class JdbcPooledDataSource {

    @Bean(name = "dataSource",destroyMethod = "close")
    @Qualifier(value = "dataSource")
    @ConfigurationProperties(prefix = "pooled.c3p0")
    public DataSource dataSource(){
        return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
    }

}
