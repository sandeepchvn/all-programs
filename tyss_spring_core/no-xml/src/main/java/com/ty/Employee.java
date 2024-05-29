package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	String name;

	public int getId() {
		return id;
	}

	@Value(value = "1")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Value(value = "sandy")
	public void setName(String name) {
		this.name = name;
	}

}
