package com.healthmanager.model.doctor;

import lombok.Data;

@Data
public class Address {

	private int stateId;

	private int districtId;

	private String address1;

	private String address2;

	private String pincode;
}
