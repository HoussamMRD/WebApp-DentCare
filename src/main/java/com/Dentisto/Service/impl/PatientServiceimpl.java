package com.Dentisto.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Dentisto.Entity.Patient;
import com.Dentisto.Repository.PatientRepository;
import com.Dentisto.Service.PatientService;











@Service
public class PatientServiceimpl implements PatientService {
	
	
	
	private PatientRepository patientRepository;
	
	
	

	public PatientServiceimpl(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}




	@Override
	public List<Patient> getAllPatients() {
		
		return patientRepository.findAll();
	}




	@Override
	public Patient savePatient(Patient patient) {
		
		return patientRepository.save(patient);
	}




	@Override
	public Patient getPatientById(Long id) {
		
		return patientRepository.findById(id).get() ;
	}




	@Override
	public Patient updatePatient(Patient patient) {
		
		return patientRepository.save(patient);
	}




	@Override
	public void deletePatientById(Long id) {
		
		 patientRepository.deleteById(id);
	}

}
