package com.Dentisto.Controller;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Dentisto.Service.FactureService;

import com.Dentisto.Entity.Facture;






@Controller

public class FactureController {
	
	
	private FactureService factureService;

	public FactureController(FactureService factureService) {
		super();
		this.factureService = factureService;
	}
	
	
	
	
	
	
	
	
	// handler method to handle list Facture
	
			@GetMapping("admin/dash/factures")
			public String listFactures(Model model) {
				model.addAttribute("factures", factureService.getAllFactures());
				return "admin/factures";
			}
	
	
	
	
			
			// handler method to handle add Facture 
			
			
			
			@GetMapping("admin/dash/factures/AddFacture")
			public String AddFactures(Model model) {
				
				// create Patient object to hold Patient form data
				Facture Facture = new Facture();
				model.addAttribute("Facture", Facture);
				return "admin/AddFacture";
			}
			
		
			@PostMapping("factures/save")
			public String saveFacture(@ModelAttribute("Facture") Facture facture) {
				factureService.saveFacture(facture);
				return "redirect:/admin/dash/factures";
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			// handler method to handle delete Facture 
			
			
			@GetMapping("admin/dash/factures/{id}")
			public String deleteFacture(@PathVariable Long id) {
				factureService.deleteFactureById(id);
				return "redirect:/admin/dash/factures";
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
