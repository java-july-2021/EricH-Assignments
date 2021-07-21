package com.eric.HelloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "Human")String name) {
        model.addAttribute("name", name);    
		return "index.jsp";
    }

}
