package com.Dentisto.Controller;







import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.Dentisto.Service.MedicFileService;

import com.Dentisto.Entity.MedicFile;
























@Controller
public class MedicFileController {

	
	
	private MedicFileService medicFileService;

	public MedicFileController(MedicFileService medicFileService) {
		super();
		this.medicFileService = medicFileService;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// handler method to handle list PATIENt
	
			@GetMapping("user/dash/medicFile")
			public String listMedicFile(Model model) {
				model.addAttribute(" medicFile", medicFileService.getAllMedicFile());
				return "user/medicFile";
			}
	
	
	
	
	
			
			
			
			// handler method to handle add PATIENT 
			
			
			
			@GetMapping("user/dash/medicFile/AddMedicFile")
			public String AddMedicFile(Model model) {
				
				// create Patient object to hold Patient form data
				MedicFile MedicFile = new MedicFile();
				model.addAttribute("MedicFile", MedicFile);
				return "user/AddMedicFile";
			}
			
		
			@PostMapping("medicFile/save")
			public String saveMedicFile(@ModelAttribute("medicFile") MedicFile medicFile) {
				medicFileService.saveMedicFile(medicFile);
				return "redirect:/user/dash/medicFile";
			}



			
			
			
			
			
			

			// handler method to handle delete PATIENT 
			
			
			@GetMapping("user/dash/medicFile/{id}")
			public String deleteMedicFile(@PathVariable Long id) {
				medicFileService.deleteMedicFileById(id);
				return "redirect:/user/dash/medicFile";
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
