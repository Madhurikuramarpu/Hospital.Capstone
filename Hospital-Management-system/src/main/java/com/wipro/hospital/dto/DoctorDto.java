package com.wipro.hospital.dto;

public class DoctorDto {
	
	private int doctorId;
	private String doctorName;
	private String phoneNumber;
	private String email;
	private int yearsOfExperience;
	private String specialization;
	
	
	
	
	
	public DoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public DoctorDto(int doctorId, String doctorName, String phoneNumber, String email, int yearsOfExperience,
			String specialization) {
		
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.yearsOfExperience = yearsOfExperience;
		this.specialization = specialization;
	}



	public int getDoctorId() {
		return doctorId;
	}



	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}



	public String getDoctorName() {
		return doctorName;
	}



	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getYearsOfExperience() {
		return yearsOfExperience;
	}



	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	
}
