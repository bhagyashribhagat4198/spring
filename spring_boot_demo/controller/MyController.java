package com.spring.spring_boot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String home() {
		return "This is my Home page";
	}
}
