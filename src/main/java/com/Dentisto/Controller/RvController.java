package com.Dentisto.Controller;



import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.Dentisto.Service.RvService;

import com.Dentisto.Entity.rendezVous;






@Controller

public class RvController {
	
	
	
	private RvService rvService;

	public RvController(RvService rvService) {
		super();
		this.rvService = rvService;
	}
	
	
	
	
	
	// handler method to handle list 
	
			@GetMapping("admin/dash/rendvous")
			public String listRv(Model model) {
				model.addAttribute("rendvous", rvService.getAllrendezVous());
				return "admin/rendvous";
			}
			
	
	
	
			
// handler method to handle add  
			
			
			
			@GetMapping("admin/dash/rendvous/AddRV")
			public String AddRV(Model model) {
				
				// create Patient object to hold Patient form data
				rendezVous rendezVous = new rendezVous();
				model.addAttribute("rendezVous", rendezVous);
				return "admin/AddRV";
			}
			
	
			
			@PostMapping("rendvous/save")
			public String saverendezVous(@ModelAttribute("rendezVous") rendezVous rendezVous) {
				rvService.saverendezVous(rendezVous);
				return "redirect:/admin/dash/rendvous";
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
			// handler method to handle delete PATIENT 
			
			
			@GetMapping("admin/dash/rendvous/{id}")
			public String deleterendezVous(@PathVariable Long id) {
				rvService.deleterendezVousById(id);
				return "redirect:/admin/dash/rendvous";
			}
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
