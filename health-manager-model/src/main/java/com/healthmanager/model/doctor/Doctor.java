package com.healthmanager.model.doctor;

import lombok.Data;

@Data
public class Doctor {

	private String name;
	
	private String salutation;
	
	private String dateOfBirth;
	
	private String phoneNumber;
	
	private String email;
	
	private int organisationId;
	
	private int department;
	
	private Address address;
}
