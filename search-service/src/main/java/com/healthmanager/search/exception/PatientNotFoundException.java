package com.healthmanager.search.exception;

public class PatientNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public PatientNotFoundException() {
		super("Patient not found");
	}
}
