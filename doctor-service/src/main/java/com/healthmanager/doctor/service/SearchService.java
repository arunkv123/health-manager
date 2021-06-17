package com.healthmanager.doctor.service;

import java.util.List;

import com.healthmanager.doctor.exception.DoctorNotFoundException;
import com.healthmanager.model.doctor.Doctor;
import com.healthmanager.model.search.DoctorSearchCriteria;

public interface SearchService {

	List<Doctor> searchDoctor(DoctorSearchCriteria doctorSearchCriteria) throws DoctorNotFoundException;
	
	List<Doctor> getAllDoctors() throws DoctorNotFoundException;
}
