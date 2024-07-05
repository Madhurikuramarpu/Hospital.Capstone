package com.wipro.hopsital.service;

import java.util.List;

import com.wipro.hospital.dto.MedicalRecordDto;
import com.wipro.hospital.entity.MedicalRecord;

public interface MedicalRecordService {

	MedicalRecord addMedicalRecord(MedicalRecordDto medicalRecordDto);

	List<MedicalRecord> getAllMedicalRecord();

	MedicalRecord updateMedicalRecord(MedicalRecordDto medicalRecordDto);

}
