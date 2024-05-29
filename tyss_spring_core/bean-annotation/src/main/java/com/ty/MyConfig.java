package com.ty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty")
public class MyConfig {

	@Bean(name = "stu")
	public Student getStudent() {
		return new Student();
	}
}
