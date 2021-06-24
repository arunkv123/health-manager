package com.healthmanager.doctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthmanager.doctor.persistance.DoctorDataRepository;
import com.healthmanager.doctor.persistance.adapter.DoctorAdapter;
import com.healthmanager.model.doctor.Doctor;

@Service("doctorDataModifyService")
public class DoctorDataModifyServiceImpl implements DoctorDataModifyService {

	@Autowired
	private DoctorDataRepository doctorDataRepository;

	@Autowired
	private DoctorAdapter doctorAdapter;

	@Override
	public Long addOrUpdateDoctorData(Doctor doctorData) {
		return doctorDataRepository.save(doctorAdapter.entityAdapter(doctorData)).getId();
	}

	@Override
	public void deletDoctorData() {
		// TODO Auto-generated method stub

	}

}
