package com.ty.coworkspace.entity;

import java.util.List;

import com.ty.coworkspace.util.Address;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
public class Building {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long buildingId;
	private String buildingName;
	private String area;
	@OneToOne
	private Address address;
	@OneToMany
	private List<Floor> floors;
}
