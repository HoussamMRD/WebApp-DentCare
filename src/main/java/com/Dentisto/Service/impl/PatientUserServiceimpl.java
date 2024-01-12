package com.Dentisto.Service.impl;




import java.util.List;

import org.springframework.stereotype.Service;


import com.Dentisto.Entity.PatientUser;

import com.Dentisto.Repository.PatientUserRepository;
import com.Dentisto.Service.PatientUserService;






@Service
public class PatientUserServiceimpl   implements PatientUserService {
	
	
	
	
	
private PatientUserRepository patientUserRepository;
	
	
	

	public PatientUserServiceimpl(PatientUserRepository patientUserRepository) {
		super();
		this.patientUserRepository = patientUserRepository;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public List<PatientUser> getAllPatientUser() {
		return patientUserRepository.findAll();
	}

	
	
	
	
	
	
	
	

	
	
	
	
	@Override
	public PatientUser savePatientUser(PatientUser patientUser) {
		
		return patientUserRepository.save(patientUser);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public PatientUser getPatientUserById(Long id) {
		return patientUserRepository.findById(id).get() ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public PatientUser updatePatientUser(PatientUser patientUser) {
		return patientUserRepository.save(patientUser);
	}

	@Override
	public void deletePatientUserById(Long id) {
		 patientUserRepository.deleteById(id);
		
	}

}
