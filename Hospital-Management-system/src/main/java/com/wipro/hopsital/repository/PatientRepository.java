package com.wipro.hopsital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.hospital.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
