package com.wipro.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "medical_records")
public class MedicalRecord {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String patientName;
    private int age;
    private String diagnosis;
    private String treatment;
    private Date dateOfRecord;

    // Constructors
    public MedicalRecord() {
    }

    public MedicalRecord(Long id, String patientName, Date dateOfBirth, String diagnosis, String treatment, Date dateOfRecord, int age) {
    	this.id = id;
        this.patientName = patientName;
        this.age = age;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.dateOfRecord = dateOfRecord;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Date getDateOfRecord() {
        return dateOfRecord;
    }

    public void setDateOfRecord(Date dateOfRecord) {
        this.dateOfRecord = dateOfRecord;
    }	
	


}
