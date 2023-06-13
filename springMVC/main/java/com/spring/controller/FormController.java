package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/user_registration")
	public String user(Model m) {	
		UserRegistration u=new UserRegistration();
		 m.addAttribute("user", u);	
		return "registration_form";
	}
	@RequestMapping("/submit")
	public String submit_form(@ModelAttribute("user")UserRegistration u) {
		
		return "registration_success";
	}
}
