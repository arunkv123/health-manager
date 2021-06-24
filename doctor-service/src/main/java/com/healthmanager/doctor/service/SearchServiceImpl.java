package com.healthmanager.doctor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.healthmanager.doctor.model.DoctorEntity;
import com.healthmanager.doctor.persistance.DoctorDataRepository;
import com.healthmanager.doctor.persistance.adapter.DoctorAdapter;
import com.healthmanager.model.doctor.Doctor;
import com.healthmanager.model.search.DoctorSearchCriteria;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

	@Autowired
	private DoctorDataRepository doctorDataRepository;

	@Autowired
	private DoctorAdapter doctorAdapter;

	@Override
	public Optional<List<Doctor>> searchDoctor(DoctorSearchCriteria doctorSearchCriteria) {
		List<DoctorEntity> entities = doctorDataRepository
				.findByOrganisationAndDepartmentAndNameLikeAndZipCodeAndDistrictAndState(
						doctorSearchCriteria.getOrganisation(), doctorSearchCriteria.getDepartment(),
						doctorSearchCriteria.getName(), doctorSearchCriteria.getZipCode(),
						doctorSearchCriteria.getDistrict(), doctorSearchCriteria.getState());
		return Optional.of(mapEntity(entities));
	}

	@Override
	public Optional<List<Doctor>> getAllDoctors() {
		List<DoctorEntity> entities = doctorDataRepository.findAll();
		return Optional.of(mapEntity(entities));
	}

	private List<Doctor> mapEntity(List<DoctorEntity> entities) {
		List<Doctor> doctors = new ArrayList<>();
		if (!CollectionUtils.isEmpty(entities)) {
			doctors = entities.parallelStream().map(d -> doctorAdapter.voAdapter(d)).collect(Collectors.toList());
		}
		return doctors;
	}

}
