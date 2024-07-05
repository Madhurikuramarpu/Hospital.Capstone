package com.wipro.hopsital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.hopsital.repository.PatientRepository;
import com.wipro.hospital.dto.PatientDto;
import com.wipro.hospital.entity.Patient;

@Service
public abstract class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	@Override
	public Patient addPatient(PatientDto patientDto) {
		Patient patient = new Patient();
		patient.setPatientId(patientDto.getPatientId());
		patient.setUsername(patientDto.getUsername());
		patient.setPassword(patientDto.getPassword());
		patient.setFullName(patientDto.getFullName());
		patient.setGender(patientDto.getGender());
		patient.setage(patientDto.getAge());
		patient.setContactNumber(patientDto.getContactNumber());
		patient.setAppointments(patientDto.getAppointments());
		patient.setMedicalHistory(patientDto.getMedicalHistory());
		patient.setSymptoms(patientDto.getSymptoms());
		patient.setNature_of_visit(patientDto.getNature_of_visit());
		return patientRepository.save(patient);
		
	
	}
	
	@Override
	public List<Patient> getAllPatient(){
		
		return patientRepository.findAll();
		
	}
	
	@Override
	public Patient updatePatient(PatientDto patientDto) {
		
		Patient patient = new Patient();
		patient.setPatientId(patientDto.getPatientId());
		patient.setUsername(patientDto.getUsername());
		patient.setPassword(patientDto.getPassword());
		patient.setFullName(patientDto.getFullName());
		patient.setGender(patientDto.getGender());
		patient.setage(patientDto.getAge());
		patient.setContactNumber(patientDto.getContactNumber());
		patient.setAppointments(patientDto.getAppointments());
		patient.setMedicalHistory(patientDto.getMedicalHistory());
		patient.setSymptoms(patientDto.getSymptoms());
		patient.setNature_of_visit(patientDto.getNature_of_visit());
		
		return patientRepository.save(patient);
		
	}
	
	public Patient getById(Long Id) {
		
		Patient patient = new Patient();
		PatientDto patientDto= new PatientDto();
		patient.setPatientId(patientDto.getPatientId());
		patient.setUsername(patientDto.getUsername());
		patient.setPassword(patientDto.getPassword());
		patient.setFullName(patientDto.getFullName());
		patient.setGender(patientDto.getGender());
		patient.setage(patientDto.getAge());
		patient.setContactNumber(patientDto.getContactNumber());
		patient.setAppointments(patientDto.getAppointments());
		patient.setMedicalHistory(patientDto.getMedicalHistory());
		patient.setSymptoms(patientDto.getSymptoms());
		patient.setNature_of_visit(patientDto.getNature_of_visit());
		
		return patientRepository.findById(patient);
		
	}
	
	public String deletePatient(Long id) {
		patientRepository.deleteById(id);
		return "delete success";
		
	}
	
	

	

}