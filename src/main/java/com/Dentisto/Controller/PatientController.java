package com.Dentisto.Controller;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Dentisto.Service.PatientService;

import com.Dentisto.Entity.Patient;






@Controller
public class PatientController {
	
	
	private PatientService patientService;

	public PatientController(PatientService patientService) {
		super();
		this.patientService = patientService;
	}
	
	
	
// handler method to handle list PATIENt
	
		@GetMapping("admin/dash/patients")
		public String listPatients(Model model) {
			model.addAttribute("patients", patientService.getAllPatients());
			return "admin/patients";
		}
		
	
	
		
		
		
		
		
// handler method to handle add PATIENT 
		
		
		
		@GetMapping("admin/dash/patients/AddPatient")
		public String AddPatients(Model model) {
			
			// create Patient object to hold Patient form data
			Patient Patient = new Patient();
			model.addAttribute("Patient", Patient);
			return "admin/AddPatient";
		}
		
	
		@PostMapping("patients/save")
		public String savePatient(@ModelAttribute("patient") Patient patient) {
			patientService.savePatient(patient);
			return "redirect:/admin/dash/patients";
		}
		
		
		
		
// handler method to handle edit PATIENT 
		
		
		
		@GetMapping("admin/dash/patients/editPatient/{id}")
		public String editPatientForm(@PathVariable Long id, Model model) {
			model.addAttribute("patient", patientService.getPatientById(id));
			return "admin/editPatient";
		}
		
		
		@PostMapping("patients/{id}")
		public String updatePatient(@PathVariable Long id,
				@ModelAttribute("patient") Patient patient,
				Model model) {
			
			// get student from database by id
			Patient existingPatient = patientService.getPatientById(id);
			existingPatient.setId(id);
			existingPatient.setFirstName(patient.getFirstName());
			existingPatient.setLastName(patient.getLastName());
			existingPatient.setCIN(patient.getCIN());
			existingPatient.setEmail(patient.getEmail());
			existingPatient.setAdress(patient.getAdress());
			existingPatient.setTel(patient.getTel());
			existingPatient.setGender(patient.getGender());
			existingPatient.setDateNaissance(patient.getDateNaissance());
			
			// save updated student object
			patientService.updatePatient(existingPatient);
			return "redirect:/admin/dash/patients";		
		}
		
		
		
		
		
// handler method to handle delete PATIENT 
		
		
		@GetMapping("admin/dash/patients/{id}")
		public String deletePatient(@PathVariable Long id) {
			patientService.deletePatientById(id);
			return "redirect:/admin/dash/patients";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
