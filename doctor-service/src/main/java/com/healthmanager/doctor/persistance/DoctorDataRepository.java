package com.healthmanager.doctor.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthmanager.model.doctor.Doctor;

public interface DoctorDataRepository extends JpaRepository<Doctor, Long> {

	List<Doctor> findByNameLike(String name);
}
