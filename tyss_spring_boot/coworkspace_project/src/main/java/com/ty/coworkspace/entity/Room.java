package com.ty.coworkspace.entity;

import java.util.List;

import com.ty.coworkspace.util.Facility;
import com.ty.coworkspace.util.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roomId;
	@OneToMany
	private List<Facility> facilities;
	@Enumerated(EnumType.STRING)
	private Type type;
}
