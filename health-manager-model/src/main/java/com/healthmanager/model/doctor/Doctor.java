package com.healthmanager.model.doctor;

import java.util.Date;

import javax.validation.constraints.Digits;

import org.springframework.format.annotation.DateTimeFormat;

import com.healthmanager.model.annotation.Dob;

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
	@Dob(doctor = true, message = "Doctor age should be >21 and not a future date")
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
