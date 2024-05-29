package com.ty;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.ty")
@PropertySource(value = "classpath:myStudent.properties")
public class Config {

	
}
