
package com.Dentisto.Service.impl;

import org.springframework.stereotype.Service;



import java.util.List;



import com.Dentisto.Entity.rendezVous;
import com.Dentisto.Repository.RvRepository;
import com.Dentisto.Service.RvService;












@Service
public class RvServiceimpl implements RvService {
	
	
private RvRepository rvRepository;
	
	
	

	public RvServiceimpl(RvRepository rvRepository) {
		super();
		this.rvRepository = rvRepository;
	}




	@Override
	public List<rendezVous> getAllrendezVous() {
		return rvRepository.findAll();
	}




	@Override
	public rendezVous saverendezVous(rendezVous rendezVous) {
		return rvRepository.save(rendezVous);
		}




	@Override
	public rendezVous getrendezVousById(Long id) {
		return rvRepository.findById(id).get() ;
	}




	@Override
	public rendezVous updaterendezVous(rendezVous rendezVous) {
		return rvRepository.save(rendezVous);
	}




	@Override
	public void deleterendezVousById(Long id) {
		 rvRepository.deleteById(id);
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	

}
