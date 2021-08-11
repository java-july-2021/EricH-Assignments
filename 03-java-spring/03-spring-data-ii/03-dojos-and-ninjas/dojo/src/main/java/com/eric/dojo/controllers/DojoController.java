package com.eric.dojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eric.dojo.models.Dojo;
import com.eric.dojo.models.Ninja;
import com.eric.dojo.services.DojoService;

@Controller
public class DojoController {
private final DojoService dojoService;
	
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	@GetMapping("/dojo/new")
	public String Dojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		model.addAttribute("allDojos", this.dojoService.allDojos());
		return "/dojo/newdojo.jsp";
	}
	@GetMapping("/ninja/new")
	public String Ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", this.dojoService.allDojos());
		return "/ninja/newninja.jsp";
	}
	@GetMapping("/dojo/{id}")
	public String findDojoById(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.getDojo(id));
		return "/dojo/dashboard.jsp";
	}
	
	@PostMapping("/dojo/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model, BindingResult result) {
		this.dojoService.createDojo(dojo);
			return "redirect:/ninja/new";
	}
	@PostMapping("/ninja/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model, BindingResult result) {
		this.dojoService.createNinja(ninja);
			return "redirect:/ninja/new";
	}
	
}
