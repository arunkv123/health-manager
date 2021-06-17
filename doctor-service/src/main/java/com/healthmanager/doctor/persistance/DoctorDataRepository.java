package com.healthmanager.doctor.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthmanager.doctor.model.DoctorEntity;

@Repository
public interface DoctorDataRepository extends JpaRepository<DoctorEntity, Long> {

	List<DoctorEntity> findByOrganisationAndDepartmentAndNameLikeAndZipCodeAndDistrictAndState(String orgnaisation,
			String department, String name, String zipcode, String district, String state);
}
