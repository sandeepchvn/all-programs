package com.ty.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value = "prototype")
public class Userrr {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	public int id;
//	@Value(value = "sandy")
//
//	public String name;
//	
//	@Value(value = "sandy@email.com")
//
//	public String email;
//	
//	@Value(value = "123")
//
//	public String password;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Value(value = "gagan")
	private String name;
	@Value(value = "gagan@gmail.com")
	private String email;
	@OneToMany
	private List<Accomadation> accomadations;
	@OneToMany
	private List<Flight> flights;

	@CreationTimestamp
	private LocalDateTime createDataTime;
	
	@Column(nullable = true)
	@Value(value = "15000")
	private double balence;
	
	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	public LocalDateTime getCreateDataTime() {
		return createDataTime;
	}

//	public void setCreateDataTime(LocalDateTime createDataTime) {
//		this.createDataTime = createDataTime;
//	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

	public List<Accomadation> getAccomadations() {
		return accomadations;
	}

	public void setAccomadations(List<Accomadation> accomadations) {
		this.accomadations = accomadations;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

}
