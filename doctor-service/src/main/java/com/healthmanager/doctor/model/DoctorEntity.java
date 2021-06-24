package com.healthmanager.doctor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity(name = "Doctor")
public class DoctorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String salutation;

	private Date dateOfBirth;

	private String phoneNumber;

	private String email;

	private String organisation;

	private String department;

	private String state;

	private String district;

	private String zipCode;

	private String address1;

	private String address2;
}
