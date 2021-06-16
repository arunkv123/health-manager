package com.healthmanager.model.doctor;

import lombok.Data;

@Data
public class Patient {

	private String name;
	
	private String salutation;
	
	private String dateOfBirth;
	
	private String phoneNumber;
	
	private String email;
	
	private Address address;
	
}
