package com.eric.relationships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eric.relationships.models.License;
import com.eric.relationships.models.Person;
import com.eric.relationships.services.LicenseService;

@Controller
public class HomeController {
private final LicenseService licenseService;

	public HomeController(LicenseService licenseService) {
		this.licenseService = licenseService;
	}

	@GetMapping("/")
	public String person(Model model, @ModelAttribute("person") Person person) {
		model.addAttribute("allPerson", this.licenseService.allPerson());
		return "/newperson.jsp";
	}
	
	@PostMapping("/")
	public String newLicense(@ModelAttribute("person") Person person, Model model, BindingResult result) {
		this.licenseService.createPerson(person);
		return "redirect:/license";
	}
	@GetMapping("/license")
	public String license(Model model, @ModelAttribute("license") License license) {
		model.addAttribute("allPeople", this.licenseService.unlicencedPerson());
		return "/newlicense.jsp";
	}
	
	@PostMapping("/license/new")
	public String newLicense(@ModelAttribute("license") License license, Model model, BindingResult result) {
		this.licenseService.createLicense(license);
		return "redirect:/";
	}
	@GetMapping("/{id}")
    public String findPersonById(Model model, @PathVariable("id")Long id) {
    	model.addAttribute("person", licenseService.getPerson(id));
    	return "/dashboard.jsp";
    } 
	
	
}