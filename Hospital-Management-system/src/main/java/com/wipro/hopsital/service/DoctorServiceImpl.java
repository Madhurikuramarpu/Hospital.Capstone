package com.wipro.hopsital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.hopsital.repository.DoctorRepository;
import com.wipro.hospital.dto.DoctorDto;
import com.wipro.hospital.entity.Doctor;

@Service

public abstract class DoctorServiceImpl implements DoctorService {
     
	
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public Doctor addDoctor(DoctorDto doctorDto) {
         Doctor doctor = new Doctor();
         doctor.setDoctorId(doctorDto.getDoctorId());
		 doctor.setDoctorName(doctorDto.getDoctorName());
		 doctor.setEmail(doctorDto.getEmail());
         doctor.setPhoneNumber(doctorDto.getPhoneNumber());
         doctor.setSpecialization(doctorDto.getSpecialization());
         doctor.setYearsOfExperience(doctorDto.getYearsOfExperience());
         
         return doctorRepository.save(doctor);
	}
	
	@Override
	public List<Doctor> getAllDoctor() {
		return doctorRepository.findAll();
		
	}
	
	@Override
	public Doctor updateDoctor(DoctorDto doctorDto) {
		
		Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorDto.getDoctorId());
	    doctor.setDoctorName(doctorDto.getDoctorName());
		doctor.setEmail(doctorDto.getEmail());
        doctor.setPhoneNumber(doctorDto.getPhoneNumber());
        doctor.setSpecialization(doctorDto.getSpecialization());
        doctor.setYearsOfExperience(doctorDto.getYearsOfExperience());
		return doctorRepository.save(doctor);
		
	}
	
	public Doctor getById(Long Id) {
		
		Doctor doctor = new Doctor();
		DoctorDto doctorDto = new DoctorDto();
        doctor.setDoctorId(doctorDto.getDoctorId());
	    doctor.setDoctorName(doctorDto.getDoctorName());
		doctor.setEmail(doctorDto.getEmail());
        doctor.setPhoneNumber(doctorDto.getPhoneNumber());
        doctor.setSpecialization(doctorDto.getSpecialization());
        doctor.setYearsOfExperience(doctorDto.getYearsOfExperience());
		return doctorRepository.findById(doctor);
		
	}
	
	public String deleteDoctor(Long id) {
		doctorRepository.deleteById(id);
		return "delete success";
		
	}
	
	
	
	
	
	
}
