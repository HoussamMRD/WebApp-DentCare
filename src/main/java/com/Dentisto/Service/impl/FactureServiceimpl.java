package com.Dentisto.Service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.Dentisto.Entity.Facture;
import com.Dentisto.Repository.FactureRepository;

import com.Dentisto.Service.FactureService;









@Service


public class FactureServiceimpl implements FactureService {
	
	
	
	
	private FactureRepository factureRepository;
	
	
	
	
	
	public FactureServiceimpl(FactureRepository factureRepository) {
		super();
		this.factureRepository = factureRepository;
	}
	
	
	
	
	
	
	
	
	
	
	
	


	@Override
	public List<Facture> getAllFactures() {
		return factureRepository.findAll();
	}
	
	
	
	
	
	
	
	
	
	

	@Override
	public Facture saveFacture(Facture facture) {
		return factureRepository.save(facture);
	}

	
	
	
	
	
	
	
	
	
	

	
	
	@Override
	public Facture getFactureById(Long id) {
		return factureRepository.findById(id).get() ;
	}
	
	
	
	
	
	

	@Override
	public Facture updateFacture(Facture facture) {
		return factureRepository.save(facture);
	}

	@Override
	public void deleteFactureById(Long id) {
		factureRepository.deleteById(id);
		
	}

}
