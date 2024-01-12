package com.Dentisto.Controller;





import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.Dentisto.Service.PatientUserService;

import com.Dentisto.Entity.PatientUser;




















@Controller

public class PatientUserController {

	
	
	
	private PatientUserService patientUserService;

	public PatientUserController(PatientUserService patientUserService) {
		super();
		this.patientUserService = patientUserService;
	}
	
	
	
// handler method to handle list PATIENt
	
		@GetMapping("user/dash/patientUser")
		public String listPatientUser(Model model) {
			model.addAttribute("patientUser", patientUserService.getAllPatientUser());
			return "user/patientUser";
		}
		
	
	
	
	
	
	
		
		// handler method to handle add PATIENT 
		
		
		
				@GetMapping("user/dash/patientUser/AddPatientUser")
				public String AddPatientUser(Model model) {
					
					// create Patient object to hold Patient form data
					PatientUser PatientUser = new PatientUser();
					model.addAttribute("PatientUser", PatientUser);
					return "user/AddPatientUser";
				}
				
			
				@PostMapping("patientUser/save")
				public String savePatientUser(@ModelAttribute("patientUser") PatientUser patientUser) {
					patientUserService.savePatientUser(patientUser);
					return "redirect:/user/dash/patientUser";
				}
	
	
	
				
				
				
				
				
				
				
				
				
				
				// handler method to handle delete PATIENT 
				
				
				@GetMapping("user/dash/patientUser/{id}")
				public String deletePatientUser(@PathVariable Long id) {
					patientUserService.deletePatientUserById(id);
					return "redirect:/user/dash/patientUser";
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
