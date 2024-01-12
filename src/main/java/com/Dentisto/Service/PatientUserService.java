package com.Dentisto.Service;




import java.util.List;


import com.Dentisto.Entity.PatientUser;






public interface PatientUserService {
	
	
	
	
List<PatientUser> getAllPatientUser();
	
PatientUser savePatientUser(PatientUser patientUser);
	
	
	
	
PatientUser getPatientUserById(Long id);
	
	
PatientUser updatePatientUser(PatientUser patientUser);
	
	
	
	void deletePatientUserById(Long id);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
