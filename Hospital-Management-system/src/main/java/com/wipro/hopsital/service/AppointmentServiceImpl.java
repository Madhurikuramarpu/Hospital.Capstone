package com.wipro.hopsital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.hopsital.repository.AppointmentRepository;
import com.wipro.hospital.dto.AppointmentDTO;
import com.wipro.hospital.entity.Appointment;

@Service
public  abstract class AppointmentServiceImpl implements AppointmentService {

	
	@Autowired
	AppointmentRepository appointmentRepository;
	@Override
	public Appointment addAppointment(AppointmentDTO appointmentDTO) {
		
		Appointment appointment=new Appointment();
		appointment.setId(appointmentDTO.getId());
		appointment.setStartTime(appointmentDTO.getStartTime());
		appointment.setEndTime(appointmentDTO.getEndTime());
		appointment.setDescription(appointmentDTO.getDescription());
		appointment.setLocation(appointmentDTO.getLocation());
				
		return appointmentRepository.save(appointment);
		
	}
	@Override
	public List<Appointment > getAllAppointment() {
					return appointmentRepository.findAll();
				
		}
	
	@Override
	public Appointment updateAppointment(AppointmentDTO appointmentDTO) {
		
		Appointment appointment=new Appointment();
		appointment.setId(appointmentDTO.getId());
		appointment.setStartTime(appointmentDTO.getStartTime());
		appointment.setEndTime(appointmentDTO.getEndTime());
		appointment.setDescription(appointmentDTO.getDescription());
		appointment.setLocation(appointmentDTO.getLocation());
				
		return appointmentRepository.save(appointment);
		
		
	}

	
    public Appointment getById(Long Id) {
		
		Appointment appointment=new Appointment();
		AppointmentDTO appointmentDTO=new AppointmentDTO();
		appointment.setId(appointmentDTO.getId());
		appointment.setStartTime(appointmentDTO.getStartTime());
		appointment.setEndTime(appointmentDTO.getEndTime());
		appointment.setDescription(appointmentDTO.getDescription());
		appointment.setLocation(appointmentDTO.getLocation());
				
		return appointmentRepository.findById(appointment);
		
	}
	
    public String deleteAppointment(Long id) {
				
		appointmentRepository.deleteById(id);
		return "delete success";
		
	}

}
