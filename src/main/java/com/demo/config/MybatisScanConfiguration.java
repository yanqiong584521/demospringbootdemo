package com.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration  
@MapperScan("com.demo.dao") 
public class MybatisScanConfiguration {

}
