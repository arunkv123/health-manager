package com.healthmanager.patient.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthmanager.model.doctor.Patient;
import com.healthmanager.model.search.PatientSearchCriteria;


@RestController
@RequestMapping("/search")
public class SearchController {

	@GetMapping("/patient")
	public ResponseEntity<Patient> searchPatient(@RequestParam PatientSearchCriteria patientSearchCriteria) {
		Patient patient = new Patient();
		return ResponseEntity.accepted().body(patient);
	}
}
