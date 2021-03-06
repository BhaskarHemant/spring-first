package com.fs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.fs.service" })
@Import(PersistenceConfig.class)
@EnableTransactionManagement
public class ServiceConfig {

}
