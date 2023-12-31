package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.LanguageMaster;
import com.example.repository.LanguageMasterRepository;

@Service
public class language_master_services_Impl implements language_master_services{
	@Autowired
	private LanguageMasterRepository laRepository;
	@Override
	public List<LanguageMaster> getalllanguage() {
		return laRepository.findAll();
	
	}

	@Override
	public void updatelanguage(long id, LanguageMaster language) {
		laRepository.update(language.getLanguageDesc(),id);
		
	
	}

	

	@Override
	public Optional<LanguageMaster> getlanguagebytypeid(Long id) {
		
		return laRepository.findById(id);
	}

	@Override
	public Optional<LanguageMaster> getlanguagebyitsType(String type) {
		
		return laRepository.listoflanguage(type);
	}
	

}
