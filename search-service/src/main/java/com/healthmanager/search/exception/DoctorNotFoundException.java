package com.healthmanager.search.exception;

public class DoctorNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public DoctorNotFoundException() {
		super("Patient not found");
	}
}
