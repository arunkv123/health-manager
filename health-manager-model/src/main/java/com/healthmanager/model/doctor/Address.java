package com.healthmanager.model.doctor;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Address {

	@NonNull
	private String state;

	@NonNull
	private String district;

	@NonNull
	private String address1;

	@NonNull
	private String address2;

	@NonNull
	private String pincode;
}
