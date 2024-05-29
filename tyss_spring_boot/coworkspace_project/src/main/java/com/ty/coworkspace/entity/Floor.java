package com.ty.coworkspace.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
public class Floor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long floodId;
	@OneToMany
	private List<WorkSpace> workSpaces;
}
