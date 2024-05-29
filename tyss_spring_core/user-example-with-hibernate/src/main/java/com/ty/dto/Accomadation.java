package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "ac")
@Entity
@Scope(value = "prototype")
public class Accomadation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Value(value = "BTM PG")
	private String name;
	@Value(value = "400")
	private double price;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
