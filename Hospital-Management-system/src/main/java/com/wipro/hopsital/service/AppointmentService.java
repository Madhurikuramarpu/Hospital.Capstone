package com.wipro.hopsital.service;

import com.wipro.hospital.dto.AppointmentDTO;
import com.wipro.hospital.entity.Appointment;
import java.util.List;


public interface AppointmentService {

	public Appointment addAppointment(AppointmentDTO appointmentDTO);

	public Appointment updateAppointment(AppointmentDTO appointmentDTO);

	public Appointment getById(AppointmentDTO appointmentDTO);
	
	public String deleteAppointment(Long id);
	
	public List<Appointment > getAllApointment();

	List<Appointment> getAllAppointment();
	

}
