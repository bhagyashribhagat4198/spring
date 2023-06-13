package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/second_page")
	public String second_page() {
		return "second_page";
	}
	
	@RequestMapping("/user_info")
	public String user_info(HttpServletRequest request,Model m) {
		
		String name =request.getParameter("name");
		String pass=request.getParameter("pass");
		if(pass.equals("admin")) {	
			String msg ="Welcome User "+name;
			m.addAttribute("message",msg);
			return "success";		
		}
		else {
			String msg="Sorry invalid password try again!";
			m.addAttribute("message",msg);
			return "error";
		}
	
	}
}
