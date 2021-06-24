package com.healthmanager.doctor.service;

import com.healthmanager.model.doctor.Doctor;

public interface DoctorDataModifyService {

	Long addOrUpdateDoctorData(Doctor doctorData);
	
	void deletDoctorData();
}
