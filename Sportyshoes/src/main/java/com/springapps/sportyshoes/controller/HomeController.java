package com.springapps.sportyshoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String showHome() {
		return "home";
	}
	@RequestMapping("/userreg")
	public String showUserRegistrationPage() {
		return "userreg";
	}
	
	@RequestMapping("/adminlogin")
	public String showAdminLoginPage() {
		return "adminlogin";
	}
}
