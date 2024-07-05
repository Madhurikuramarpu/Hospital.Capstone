package com.wipro.hopsital.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.hopsital.service.AppointmentService;
import com.wipro.hospital.dto.AppointmentDTO;
import com.wipro.hospital.entity.Appointment;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/add")
	public Appointment addAppointment(@RequestBody AppointmentDTO appointmentDTO) {
		
	return appointmentService.addAppointment(appointmentDTO);	
	}

}
