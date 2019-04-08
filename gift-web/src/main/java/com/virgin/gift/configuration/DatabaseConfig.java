package com.virgin.gift.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.virgin.gift.mapper")
public class DatabaseConfig {
    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DataSource dataSource(){
        return new DriverManagerDataSource();
    }
}
