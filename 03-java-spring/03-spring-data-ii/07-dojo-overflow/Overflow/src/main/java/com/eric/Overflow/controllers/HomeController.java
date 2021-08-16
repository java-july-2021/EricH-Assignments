package com.eric.Overflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eric.Overflow.models.Answer;
import com.eric.Overflow.models.Question;
import com.eric.Overflow.services.QuestService;
import com.eric.Overflow.valid.tagValidator;

@Controller
public class HomeController {
private final QuestService qService;
@Autowired
private tagValidator validator;

	public HomeController(QuestService qService) {
		this.qService = qService;
	}
	
	@GetMapping("/questions")
	public String Dashboard(Model model) {
		model.addAttribute("allQuestions", this.qService.allQuestions());
		return "question.jsp";
	}

	@GetMapping("/new")
	public String newQuestion(@ModelAttribute("newQuestion") Question question) {
		return "new.jsp";
	}
	@PostMapping("/questions/new")
	public String newQuestion(@Valid @ModelAttribute("newQuestion") Question question, BindingResult result) {
		validator.validate(question, result);
		if(result.hasErrors()) {
			return "new.jsp";
		}
		this.qService.createQuestion(question);
		return "redirect:/questions/new";
	}
	
	@GetMapping("/questions/{id}")
	public String showAnswer(@PathVariable("id")Long id, @ModelAttribute("answer") Answer answer, Model model) {
		model.addAttribute("question", this.qService.getQuestion(id));
		return "show.jsp";
	}
	@PostMapping("/answer")
	public String newAnswer(@Valid @ModelAttribute("answer") Answer answer, Model model, BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("question", this.qService.getQuestion(answer.getQuestion().getId()));
			return "show.jsp";
		}
		this.qService.createAnswer(answer);
		return "redirect:/questions/" + answer.getQuestion().getId();
	}
	

}
