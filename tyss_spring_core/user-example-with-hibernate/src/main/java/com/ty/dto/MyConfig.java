package com.ty.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty")
public class MyConfig {
	@Bean(value = "em")
	public EntityManager createEMF() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		return emf.createEntityManager();
	}
	@Bean(value = "et")
	public EntityTransaction createET() {
		return createEMF().getTransaction();
	}
}
