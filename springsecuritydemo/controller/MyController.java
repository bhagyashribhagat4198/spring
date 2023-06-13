package com.spring.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@RequestMapping("/")
	public String home() {
		return "this is Spring security example";
	}
}
