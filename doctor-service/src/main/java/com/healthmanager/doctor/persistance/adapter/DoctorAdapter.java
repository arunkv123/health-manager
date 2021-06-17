package com.healthmanager.doctor.persistance.adapter;

import org.springframework.stereotype.Component;

import com.healthmanager.doctor.model.DoctorEntity;
import com.healthmanager.model.doctor.Address;
import com.healthmanager.model.doctor.Doctor;

@Component
public class DoctorAdapter implements Adapter<DoctorEntity, Doctor> {

	@Override
	public DoctorEntity entityAdapter(Doctor k) {
		return null;
	}

	@Override
	public Doctor voAdapter(DoctorEntity entity) {
		Address address = Address.builder().address1(entity.getAddress1()).address2(entity.getAddress2())
				.district(entity.getDistrict()).state(entity.getState()).build();
		return Doctor.builder().address(address).department(entity.getDepartment()).dateOfBirth(entity.getDateOfBirth())
				.name(entity.getName()).email(entity.getEmail()).phoneNumber(entity.getPhoneNumber())
				.salutation(entity.getSalutation()).build();

	}

}
