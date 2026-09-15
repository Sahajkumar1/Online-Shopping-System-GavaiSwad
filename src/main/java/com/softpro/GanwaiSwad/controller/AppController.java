package com.softpro.GanwaiSwad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String home() {
		return "user/index";
	}

	@GetMapping("/about")
	public String about() {
		return "user/about";
	}


	@GetMapping("/contact")
	public String contact() {
		return "user/contact";
	}


	@GetMapping("/products")
	public String products() {
		return "user/products";
	}
    
	 @GetMapping("/login")
	 public String login() {
		 return "/login";
	 }
	 
	 @GetMapping("/register")
	 public String register() {
		 return "/register";
	 }

	
	 
	 

}
