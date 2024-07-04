package com.wipro.hospital.dto;

import java.time.LocalDateTime;

public class AppointmentDTO {
	

	    private LocalDateTime startTime;
	    private LocalDateTime endTime;
	    private String description;
	    private String location;
	
	    
	    public AppointmentDTO(LocalDateTime startTime, LocalDateTime endTime, String description, String location) {
			super();
			this.startTime = startTime;
			this.endTime = endTime;
			this.description = description;
			this.location = location;
		}


		public AppointmentDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public LocalDateTime getStartTime() {
			return startTime;
		}


		public void setStartTime(LocalDateTime startTime) {
			this.startTime = startTime;
		}


		public LocalDateTime getEndTime() {
			return endTime;
		}


		public void setEndTime(LocalDateTime endTime) {
			this.endTime = endTime;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}


	    
}


    