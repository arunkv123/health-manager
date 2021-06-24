package com.healthmanager.doctor.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthmanager.doctor.service.DoctorDataModifyService;
import com.healthmanager.model.doctor.Doctor;

@RestController
public class DoctorDataModifyController {

	@Autowired
	DoctorDataModifyService doctorDataModifyService;

	@PostMapping("/add")
	public ResponseEntity<Long> addDoctor(@RequestBody @Valid Doctor doctor) {
		Long doctorId = doctorDataModifyService.addOrUpdateDoctorData(doctor);
		return ResponseEntity.accepted().contentType(MediaType.APPLICATION_JSON).body(doctorId);
	}
}
