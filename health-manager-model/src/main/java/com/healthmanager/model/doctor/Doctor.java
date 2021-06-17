package com.healthmanager.model.doctor;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Doctor {

	private String name;
	
	private String salutation;
	
	private String dateOfBirth;
	
	private String phoneNumber;
	
	private String email;
	
	private String organisation;
	
	private String department;
	
	private Address address;
}
