package com.Dentisto.Service;




import java.util.List;

import com.Dentisto.Entity.Patient;


public interface PatientService {
	
	
	
	List<Patient> getAllPatients();
	
	Patient savePatient(Patient patient);
	
	
	
	
	Patient getPatientById(Long id);
	
	
	Patient updatePatient(Patient patient);
	
	
	
	void deletePatientById(Long id);

}
