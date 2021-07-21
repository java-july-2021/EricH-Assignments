package com.eric.routing.controllers2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo")
	 public String dojo() {
	            return "The dojo is awesome!";
	    }
	@RequestMapping("/dojo/{location}")
	 public String dojoLocation(@PathVariable("location") String location) {
		switch (location) {
		case "Burbank":
			return "Burbank Dojo is located in Southern California!";
		case "San-Jose":
			return "SJ dojo is the headquarters!";
		default:
			return String.format("%s is pretty sweet", location);
		}
		
	}

}
