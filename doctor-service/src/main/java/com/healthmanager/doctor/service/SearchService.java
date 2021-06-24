package com.healthmanager.doctor.service;

import java.util.List;
import java.util.Optional;

import com.healthmanager.model.doctor.Doctor;
import com.healthmanager.model.search.DoctorSearchCriteria;

public interface SearchService {

	Optional<List<Doctor>> searchDoctor(DoctorSearchCriteria doctorSearchCriteria) ;
	
	Optional<List<Doctor>> getAllDoctors();
}
