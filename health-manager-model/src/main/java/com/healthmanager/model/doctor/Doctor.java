package com.healthmanager.model.doctor;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Doctor {

	@NonNull
	private String name;

	@NonNull
	private String salutation;

	@NonNull
	@DateTimeFormat(pattern = "dd-MM-YYYY")
	private Date dateOfBirth;

	@NonNull
	@Digits(integer = 10, fraction = 0, message = "Phone number should be 10 character long")
	private String phoneNumber;

	@NonNull
	private String email;

	@NonNull
	private String organisation;

	@NonNull
	private String department;

	private Address address;
}
