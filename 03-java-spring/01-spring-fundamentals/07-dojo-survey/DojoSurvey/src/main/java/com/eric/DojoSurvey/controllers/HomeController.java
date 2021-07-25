package com.eric.DojoSurvey.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	 
    @RequestMapping("/")
    public String login () {
    		return "index.jsp";
    }
    @RequestMapping(path = "/dashboard", method=RequestMethod.POST)
    public String dashboard(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="comments") String comments, Model model){
    	model.addAttribute("name", name);
    	model.addAttribute("location", location);
    	model.addAttribute("language", language);
    	model.addAttribute("comments", comments);
    		return "dashboard.jsp";
    }

}
