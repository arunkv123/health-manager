package com.healthmanager.doctor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "Doctor")
public class DoctorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String salutation;

	private String dateOfBirth;

	private String phoneNumber;

	private String email;

	private Long organisation;

	private Long department;
	
	private Long state;
	
	private Long district;
	
	
}
