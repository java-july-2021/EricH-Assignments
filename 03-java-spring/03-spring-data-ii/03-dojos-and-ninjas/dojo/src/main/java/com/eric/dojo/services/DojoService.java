package com.eric.dojo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.dojo.models.Dojo;
import com.eric.dojo.models.Ninja;
import com.eric.dojo.repositories.dRepo;
import com.eric.dojo.repositories.nRepo;

@Service
public class DojoService {
	private final dRepo  dRepo;
	private final nRepo nRepo;
	
	public DojoService(dRepo dRepo, nRepo nRepo) {
		this.dRepo = dRepo;
		this.nRepo = nRepo;
		
	}
	public List<Dojo> allDojos(){
		return dRepo.findAll();
	}
	public List<Ninja> allNinjas(){
		return nRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dRepo.save(dojo);
	}
	public Dojo getDojo(Long id) {
		return dRepo.findById(id).orElse(null);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return nRepo.save(ninja);
	}
	public Ninja getNinja(Long id) {
		return nRepo.findById(id).orElse(null);
	}
	
}
