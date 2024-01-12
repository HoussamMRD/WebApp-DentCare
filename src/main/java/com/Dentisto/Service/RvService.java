package com.Dentisto.Service;





import java.util.List;


import com.Dentisto.Entity.rendezVous;


public interface RvService {
	
	
List<rendezVous> getAllrendezVous();
	
rendezVous saverendezVous(rendezVous rendezVous);
	
	
	
	
rendezVous getrendezVousById(Long id);
	
	
rendezVous updaterendezVous(rendezVous rendezVous);
	
	
	
	void deleterendezVousById(Long id);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
