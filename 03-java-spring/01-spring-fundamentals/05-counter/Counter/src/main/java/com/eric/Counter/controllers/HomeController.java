package com.eric.Counter.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String hello(HttpSession session) {
    	 if (session.getAttribute("count") == null) {
    		 session.setAttribute("count", 0); 
    	 }
         else {
        	 int counter = (int)session.getAttribute("count");
        	 counter++;
        	 session.setAttribute("count", counter);
         }
    	 return "index.jsp";
    }
    
    @RequestMapping("/counter")
    public String count(HttpSession session, Model model) {
    	Integer currentCount = (Integer) session.getAttribute("count");
    	if (currentCount == null) {
    		model.addAttribute("current", 0);
    	}
    	else {
    		model.addAttribute("current", currentCount);
    	}
        return "counter.jsp";
       
    }
    
    @RequestMapping("/reset")
    public String reset(HttpSession session) {
    	session.setAttribute("count", 0);
    	return "redirect:/counter";
    }
}
