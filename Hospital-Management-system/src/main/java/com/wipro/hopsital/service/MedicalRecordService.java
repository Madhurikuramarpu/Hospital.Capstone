package com.wipro.hopsital.service;

import java.util.List;
import java.util.Optional;

import com.wipro.hospital.dto.MedicalRecordDto;
import com.wipro.hospital.entity.MedicalRecord;

public interface MedicalRecordService {

	MedicalRecord addMedicalRecord(MedicalRecordDto medicalRecordDto);

	List<MedicalRecord> getAllMedicalRecord();

	MedicalRecord updateMedicalRecord(MedicalRecordDto medicalRecordDto);

	List<MedicalRecord> getAllMedicalRecords();

	Optional<MedicalRecord> getMedicalRecordById(Long id);

	MedicalRecord createMedicalRecord(MedicalRecord medicalRecord);

	Optional<MedicalRecord> updateMedicalRecord(Long id, MedicalRecord medicalRecordDetails);

	public String deleteMedicalRecord(Long id);

}
