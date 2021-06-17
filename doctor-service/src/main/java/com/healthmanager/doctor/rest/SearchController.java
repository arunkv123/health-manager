package com.healthmanager.doctor.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthmanager.doctor.service.SearchService;
import com.healthmanager.model.doctor.Doctor;
import com.healthmanager.model.search.DoctorSearchCriteria;

@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private SearchService searchService;

	@GetMapping("/doctor")
	public ResponseEntity<List<Doctor>> searchDoctor(@RequestParam DoctorSearchCriteria doctorSearchCriteria) {
		List<Doctor> doctors = searchService.searchDoctor(doctorSearchCriteria);
		return ResponseEntity.accepted().body(doctors);
	}
}
