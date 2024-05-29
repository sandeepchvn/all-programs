package com.ty.traveller_app.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Travler {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dob;
	private String email;
	private long phoneNumber;
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	private Passport passport;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Country> countries;
}
