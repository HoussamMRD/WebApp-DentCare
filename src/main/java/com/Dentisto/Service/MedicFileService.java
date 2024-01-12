package com.Dentisto.Service;


import java.util.List;


import com.Dentisto.Entity.MedicFile;











public interface MedicFileService {
	
	
	List<MedicFile> getAllMedicFile();
	
	MedicFile saveMedicFile(MedicFile medicFile);
		
		
		
		
	MedicFile getMedicFileById(Long id);
		
		
	MedicFile updateMedicFile(MedicFile medicFile);
		
		
		
		void deleteMedicFileById(Long id);

		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
