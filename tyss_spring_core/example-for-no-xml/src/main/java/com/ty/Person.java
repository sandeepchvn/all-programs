package com.ty;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Configurable
@ComponentScan(basePackages = "com.ty")
public class Person {
	@Value(value = "78")
	int age;
}
