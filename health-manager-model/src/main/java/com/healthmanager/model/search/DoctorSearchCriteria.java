package com.healthmanager.model.search;

import lombok.Data;

@Data
public class DoctorSearchCriteria {

	private String zipCode;
	
	private String district;
	
	private String State;
	
	private String name;
	
	private String organisation;
	
	private String department;
	
}
