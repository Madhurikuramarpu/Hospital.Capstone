package com.wipro.hopsital.service;

import com.wipro.hospital.dto.AppointmentDTO;
import com.wipro.hospital.entity.Appointment;
import java.util.List;
import java.util.Optional;


public interface AppointmentService {

	public Appointment addAppointment(AppointmentDTO appointmentDTO);

	public Appointment updateAppointment(AppointmentDTO appointmentDTO);

	public Appointment getById(AppointmentDTO appointmentDTO);
	
	public String deleteAppointment(Long id);
	
	public List<Appointment > getAllApointment();

	List<Appointment> getAllAppointment();

	public Optional<Appointment> getAppointmentById(Long id);

	public List<Appointment> getAllAppointments();

	public Appointment createAppointment(Appointment appointment);

	public Optional<Appointment> updateAppointment(Long id, Appointment appointmentDetails);
	

}
