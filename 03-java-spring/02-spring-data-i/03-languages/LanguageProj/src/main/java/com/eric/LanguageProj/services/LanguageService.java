package com.eric.LanguageProj.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eric.LanguageProj.models.Language;
import com.eric.LanguageProj.repositories.LanguageRepo;

@Service
public class LanguageService {

    private final LanguageRepo languageRepo;
    
    public LanguageService(LanguageRepo languageRepo) {
        this.languageRepo = languageRepo;
    }
    
    public List<Language> allLanguage() {
        return languageRepo.findAll();
    }
    
    public Language createLanguage(Language b) {
        return languageRepo.save(b);
    }
 
    public Language updateLanguage(Language b) {
       return languageRepo.save(b);
    }
 
    public void deleteById(Long id) {
    	this.languageRepo.deleteById(id);
    }
    
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepo.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
	public Language updateLanguage(Long id, String name, String creator, Float currentVersion) {
		return null;
	}
}
