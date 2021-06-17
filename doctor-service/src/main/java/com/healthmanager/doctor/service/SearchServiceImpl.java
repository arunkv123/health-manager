package com.healthmanager.doctor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.healthmanager.model.doctor.Doctor;
import com.healthmanager.model.search.DoctorSearchCriteria;

@Service
public class SearchServiceImpl implements SearchService {

	@Override
	public List<Doctor> searchDoctor(DoctorSearchCriteria doctorSearchCriteria) {
		List<Doctor> doctors = new ArrayList<>();
		return doctors;
	}

}
