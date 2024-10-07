package com.gl.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gst")
public class HelloController {

	@RequestMapping("/hello")
	public String showWelcomeMessage(ModelMap model) {
		System.out.println("I am in Hello");
		model.addAttribute("message", "Spring MVC thymeleaf hello world");
		return "welcome";
	}
}
