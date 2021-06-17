package com.healthmanager.model.doctor;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

	private String state;

	private String district;

	private String address1;

	private String address2;

	private String pincode;
}
