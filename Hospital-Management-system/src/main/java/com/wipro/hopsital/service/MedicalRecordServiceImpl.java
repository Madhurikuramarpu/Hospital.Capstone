package com.wipro.hopsital.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.hopsital.repository.MedicalRecordRepository;
import com.wipro.hospital.dto.MedicalRecordDto;
import com.wipro.hospital.entity.MedicalRecord;

@Service
public abstract class MedicalRecordServiceImpl implements MedicalRecordService {
	
	@Autowired
	MedicalRecordRepository medicalRecordRepository;
	@Override
	public MedicalRecord addMedicalRecord(MedicalRecordDto medicalRecordDto) {
		
		MedicalRecord medicalRecord = new MedicalRecord();
		medicalRecord.setId(medicalRecordDto.getId());
		medicalRecord.setPatientName(medicalRecordDto.getPatientName());
		medicalRecord.setage(medicalRecordDto.getAge());
		medicalRecord.setDiagnosis(medicalRecordDto.getDiagnosis());
		medicalRecord.setTreatment(medicalRecordDto.getTreatment());
		medicalRecord.setDateOfRecord(medicalRecordDto.getDateOfRecord());
		return medicalRecordRepository.save(medicalRecord);
		
	}
	
	@Override
	public List<MedicalRecord> getAllMedicalRecord(){
		return medicalRecordRepository.findAll();
	}
	
	@Override 
	public MedicalRecord updateMedicalRecord(MedicalRecordDto medicalRecordDto) {
		
		MedicalRecord medicalRecord = new MedicalRecord();
		medicalRecord.setId(medicalRecordDto.getId());
		medicalRecord.setPatientName(medicalRecordDto.getPatientName());
		medicalRecord.setage(medicalRecordDto.getAge());
		medicalRecord.setDiagnosis(medicalRecordDto.getDiagnosis());
		medicalRecord.setTreatment(medicalRecordDto.getTreatment());
		medicalRecord.setDateOfRecord(medicalRecordDto.getDateOfRecord());
		return medicalRecordRepository.save(medicalRecord);
		
	}
	
	public MedicalRecord getById(Long Id) {
		
		MedicalRecord medicalRecord = new MedicalRecord();
		MedicalRecordDto medicalRecordDto = new MedicalRecordDto();
		medicalRecord.setId(medicalRecordDto.getId());
		medicalRecord.setPatientName(medicalRecordDto.getPatientName());
		medicalRecord.setage(medicalRecordDto.getAge());
		medicalRecord.setDiagnosis(medicalRecordDto.getDiagnosis());
		medicalRecord.setTreatment(medicalRecordDto.getTreatment());
		medicalRecord.setDateOfRecord(medicalRecordDto.getDateOfRecord());
		return medicalRecordRepository.findById(medicalRecord);
		
	}
	
	public String deleteMedicalRecord(Long id) {
		medicalRecordRepository.deleteById(id);
		return "delete success";
		
	}
}
