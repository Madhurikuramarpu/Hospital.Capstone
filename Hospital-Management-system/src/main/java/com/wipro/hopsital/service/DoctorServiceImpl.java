package com.wipro.hopsital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.hopsital.repository.DoctorRepository;
import com.wipro.hospital.dto.DoctorDto;
import com.wipro.hospital.entity.Appointment;
import com.wipro.hospital.entity.Doctor;

@Service

public class DoctorServiceImpl implements DoctorService {
     
	
	@Autowired
	DoctorRepository doctorRepository;
	Doctor doctor=new Doctor();
	@Override
	public Doctor addDoctor(DoctorDto doctorDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
