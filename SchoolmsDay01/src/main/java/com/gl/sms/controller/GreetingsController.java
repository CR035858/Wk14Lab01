package com.gl.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")
public class GreetingsController {
	
	@RequestMapping("/sayHello")
	public String greetPeople(Model model)
	{
		String message = "Welcome to the School Management System Home Page...";
		model.addAttribute("mymessage", message);
		return "homepage";
	}
	
	@RequestMapping("/login")
	public String showLoginPage(Model model)
	{
		String loginmsg = "Welcome to the School Management System Login  Page...";
		model.addAttribute("loginmsg", loginmsg);
		return "loginpage";
	}
	
	@RequestMapping("/register")
	public String showRegistrationPage(Model model)
	{
		String regmsg = "Welcome to the School Management System Registration Page...";
		model.addAttribute("regmsg", regmsg);
		return "registration";
	}

}
