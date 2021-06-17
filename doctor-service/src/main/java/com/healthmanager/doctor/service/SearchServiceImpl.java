package com.healthmanager.doctor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.healthmanager.doctor.exception.DoctorNotFoundException;
import com.healthmanager.doctor.model.DoctorEntity;
import com.healthmanager.doctor.persistance.DoctorDataRepository;
import com.healthmanager.doctor.persistance.adapter.DoctorAdapter;
import com.healthmanager.model.doctor.Doctor;
import com.healthmanager.model.search.DoctorSearchCriteria;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private DoctorDataRepository doctorDataRepository;

	@Autowired
	private DoctorAdapter doctorAdapter;

	@Override
	public List<Doctor> searchDoctor(DoctorSearchCriteria doctorSearchCriteria) throws DoctorNotFoundException {
		List<DoctorEntity> entities = doctorDataRepository
				.findByOrganisationAndDepartmentAndNameLikeAndZipCodeAndDistrictAndState(
						doctorSearchCriteria.getOrganisation(), doctorSearchCriteria.getDepartment(),
						doctorSearchCriteria.getName(), doctorSearchCriteria.getZipCode(),
						doctorSearchCriteria.getDistrict(), doctorSearchCriteria.getState());
		return mapEntity(entities);
	}

	@Override
	public List<Doctor> getAllDoctors() throws DoctorNotFoundException {
		List<DoctorEntity> entities = doctorDataRepository.findAll();
		return mapEntity(entities);
	}

	private List<Doctor> mapEntity(List<DoctorEntity> entities) throws DoctorNotFoundException {
		List<Doctor> doctors = new ArrayList<>();
		if (CollectionUtils.isEmpty(entities)) {
			throw new DoctorNotFoundException();
		} else {
			doctors = entities.parallelStream().map(d -> doctorAdapter.voAdapter(d)).collect(Collectors.toList());
		}
		return doctors;
	}

}
