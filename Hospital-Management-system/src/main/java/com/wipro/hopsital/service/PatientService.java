package com.wipro.hopsital.service;

import java.util.List;

import com.wipro.hospital.dto.PatientDto;
import com.wipro.hospital.entity.Patient;

public interface PatientService {

	Patient addPatient(PatientDto patientDto);

	List<Patient> getAllPatient();

	Patient updatePatient(PatientDto patientDto);

	List<Patient> getAllPatients();

	Patient getPatientById(Long id);

	Patient createPatient(Patient patient);

	Patient updatePatient(Long id, Patient patientDetails);

	public String deletePatient(Long id);

}
