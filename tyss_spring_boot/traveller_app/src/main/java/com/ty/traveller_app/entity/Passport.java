package com.ty.traveller_app.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String passportNumber;
	private String natinality;
	private String gender;
	private LocalDate dateOfIssue;
	private LocalDate dateOfExpiry;
}
