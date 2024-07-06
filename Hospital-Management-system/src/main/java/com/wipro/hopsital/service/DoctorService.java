package com.wipro.hopsital.service;

import java.util.List;
import java.util.Optional;

import com.wipro.hospital.dto.DoctorDto;
import com.wipro.hospital.entity.Doctor;

public interface DoctorService {

	public Doctor addDoctor(DoctorDto doctorDto);

	List<Doctor> getAllDoctor();

	Doctor updateDoctor(DoctorDto doctorDto);

	public Doctor saveDoctor(Doctor doctor);

	public List<Doctor> getAllDoctors();

	public Optional<Doctor> getDoctorById(Long id);

	public String deleteDoctor(Long id);

	public Optional<Doctor> updateDoctor(Long id, Doctor doctorDetails);
	
	

}
