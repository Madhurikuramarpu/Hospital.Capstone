package com.wipro.hospital.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Appointment")
public class Appointment {

	
	@Id
	private Long Id; 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private String location;

    
    // Constructor
    public Appointment( Long Id,LocalDateTime startTime, LocalDateTime endTime, String description, String location) {
        this.Id = Id;
    	this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.location = location;
    }

    // Getters and Setters
    
    
    
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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


