package com.Dentisto.Service;





import java.util.List;

import com.Dentisto.Entity.Facture;






public interface FactureService {
	
	
	
	
	
	
	
List<Facture> getAllFactures();
	
Facture saveFacture(Facture facture);
	
	
	
	
Facture getFactureById(Long id);
	
	
Facture updateFacture(Facture facture);
	
	
	
	void deleteFactureById(Long id);


}
