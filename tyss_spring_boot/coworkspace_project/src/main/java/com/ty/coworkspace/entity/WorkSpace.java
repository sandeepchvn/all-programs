package com.ty.coworkspace.entity;

import java.util.List;

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
public class WorkSpace {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long workSpaceId;
	@OneToOne
	private Company company;
	@OneToMany
	private List<Room> rooms;
}
