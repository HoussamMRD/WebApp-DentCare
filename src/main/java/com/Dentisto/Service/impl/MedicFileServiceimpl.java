package com.Dentisto.Service.impl;



import java.util.List;

import org.springframework.stereotype.Service;


import com.Dentisto.Entity.MedicFile;

import com.Dentisto.Repository.MedicFileRepository;

import com.Dentisto.Service.MedicFileService;








@Service

public class MedicFileServiceimpl implements  MedicFileService {
	
	
	
	
private MedicFileRepository medicFileRepository;
	
	
	

	public MedicFileServiceimpl(MedicFileRepository medicFileRepository) {
		super();
		this.medicFileRepository = medicFileRepository;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public List<MedicFile> getAllMedicFile() {
		return medicFileRepository.findAll();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public MedicFile saveMedicFile(MedicFile medicFile) {
		return medicFileRepository.save(medicFile);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public MedicFile getMedicFileById(Long id) {
		return medicFileRepository.findById(id).get();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public MedicFile updateMedicFile(MedicFile medicFile) {
		return medicFileRepository.save(medicFile);
	}

	
	
	
	
	
	
	
	
	
	
	@Override
	public void deleteMedicFileById(Long id) {
		medicFileRepository.deleteById(id);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
