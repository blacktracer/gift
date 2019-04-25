package com.virgin.gift.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.virgin.gift.mapper")
public class DatabaseConfig {

}
