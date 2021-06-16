package com.healthmanager.doctor.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthmanager.model.doctor.Doctor;
import com.healthmanager.model.search.DoctorSearchCriteria;

@RestController
@RequestMapping("/search")
public class SearchController {

	@GetMapping("/doctor")
	public ResponseEntity<List<Doctor>> searchDoctor(@RequestParam DoctorSearchCriteria doctorSearchCriteria) {
		Doctor doctor = new Doctor();
		List<Doctor> doctors = new ArrayList<>();
		return ResponseEntity.accepted().body(doctors);
	}
}
