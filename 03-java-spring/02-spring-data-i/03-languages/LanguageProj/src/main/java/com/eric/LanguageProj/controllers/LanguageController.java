package com.eric.LanguageProj.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.eric.LanguageProj.models.Language;
import com.eric.LanguageProj.services.LanguageService;

@Controller
public class LanguageController {
private final LanguageService languageService;
	
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/languages")
	public String index(Model model, @ModelAttribute("languages") Language languages) {
        model.addAttribute("allLangauge", this.languageService.allLanguage());
        return "/languages/index.jsp";
    }
	
	@PostMapping("/languages")
    public String create(@Valid @ModelAttribute("languages") Language languages, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	model.addAttribute("allLangauge", this.languageService.allLanguage());
            return "/languages/index.jsp";
        } else {
        	this.languageService.createLanguage(languages);
            return "redirect:/languages";
        }
    }

	@GetMapping("/languages/{index}")
    public String findLanguageByIndex(Model model, @PathVariable("index")Long id) {
    	Language language = languageService.findLanguage(id);
    	model.addAttribute("language", language);
    	return "/languages/show.jsp";
    } 
	
    @GetMapping("/languages/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("language", this.languageService.findLanguage(id));
        return "/languages/edit.jsp";
    }
    
    @PutMapping("/languages/{id}/edit")
    public String update(@Valid @ModelAttribute("languages") Language languages, BindingResult result, Model model, @PathVariable("id") Long id) {
        if (result.hasErrors()) {
        	model.addAttribute("language", this.languageService.findLanguage(id));
            return "/languages/edit.jsp";
        } else {
        	this.languageService.updateLanguage(languages);
            return "redirect:/languages/{id}";
        }
    }
    @DeleteMapping("/languages/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
    	this.languageService.deleteById(id);
        return "redirect:/languages";
    }
	
}
