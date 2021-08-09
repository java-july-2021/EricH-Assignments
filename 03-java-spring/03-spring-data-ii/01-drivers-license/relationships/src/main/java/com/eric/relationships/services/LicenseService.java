package com.eric.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.relationships.models.License;
import com.eric.relationships.models.Person;
import com.eric.relationships.repositories.LicenseRepo;
import com.eric.relationships.repositories.PersonRepo;

@Service
public class LicenseService {
	
	private final LicenseRepo licenseRepo;
	private final PersonRepo personRepo;
	
	public LicenseService(LicenseRepo licenseRepo, PersonRepo personRepo) {
		this.licenseRepo = licenseRepo;
		this.personRepo = personRepo;
	}
	public List<License> allLicense(){
		return licenseRepo.findAll();
	}
	public List<Person> allPerson(){
		return personRepo.findAll();
	}
	public List<Person> unlicencedPerson(){
		return personRepo.findByLicenseIdNull();
	}
	
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	public Person getPerson(Long id) {
	    return personRepo.findById(id).orElse(null);
	}
	
	public License createLicense(License license) {
		license.setNumber(this.licenseNumber());
		return this.licenseRepo.save(license);
	}
	
	public int licenseNumber() {
		License l = this.licenseRepo.findTopByOrderByNumberDesc();
		if (l == null) {
		return 1;
		}
		int prevLicenseNumber = l.getNumber();
		prevLicenseNumber++;
		return(prevLicenseNumber);
	}
	
}








