package com.wipro.hopsital.service;

import java.util.List;

import com.wipro.hospital.dto.DoctorDto;
import com.wipro.hospital.entity.Doctor;

public interface DoctorService {

	public Doctor addDoctor(DoctorDto doctorDto);

	List<Doctor> getAllDoctor();

	Doctor updateDoctor(DoctorDto doctorDto);
	
	

}
