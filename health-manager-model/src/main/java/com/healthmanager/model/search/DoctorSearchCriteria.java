package com.healthmanager.model.search;

import lombok.Data;

@Data
public class DoctorSearchCriteria {

	private String zipCode;
	
	private Long district;
	
	private Long State;
	
	private String name;
	
}
