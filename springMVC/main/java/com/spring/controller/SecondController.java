package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondController {

	@RequestMapping("/second_controller")
	public String next_page() {
		
		return "next_page";
	}
	
	@RequestMapping("login_page")
	public String user_login() {
		return "user_login";
	}
	
	@RequestMapping("/user_login")
	// read the  form data 
	public String login(@RequestParam("name") String n,@RequestParam("pass") String p,Model m) {
		if(p.equals("admin")) {
			
			String msg ="Welcome User !"+n;
			m.addAttribute("message" , msg);
			return "login_sucess";
		}
		else {
			String msg =" Wrong Password try again ";
			
			m.addAttribute("message", msg);
			return "login_error";
		}
		
		
		
	}
}
