package com.gl.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.sms.model.Login;

import com.gl.sms.model.StudentRegn;
import com.gl.sms.service.LoginService;

import com.gl.sms.service.StudentRegnService;

@Controller
@RequestMapping("/greet")
public class GreetingsController {
	
	@Autowired
	LoginService loginService;
	@Autowired
	StudentRegnService studentRegnService;
	
	
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
		
		Login login = new Login();
		String successmsg = (String) model.getAttribute("loginsuccess");
		if(successmsg != null)
		{
			model.addAttribute("loginsuccess", successmsg);
		}
		
		model.addAttribute("loginmsg", loginmsg);
		model.addAttribute("login", login);
		return "loginpage";
	}
	@RequestMapping("/showStudentDetails")
	public String showStudentDetailsPage(Model model)
	{
	/*	List <StudentDetails> studentDetails ;
		studentDetails = studentDetailService.getStudentDetails();
		System.out.println(studentDetails);
		model.addAttribute("studentDetails", studentDetails);
		return "studentsDetailsList";*/
		return null;
					
	}
	@RequestMapping("/showRegnDetails")
	public String showStudentRegistrationDetailsPage(Model model)
	{
		List <StudentRegn> studentRegnDetails;
		studentRegnDetails = studentRegnService.getStudentRegnDetails();
		model.addAttribute("studentRegnDetails", studentRegnDetails);		
		return "studentRegnList";
		
	}
	@GetMapping("/register")
	public String showRegistrationPage(Model model)
	{
		String regmsg = "Welcome to the School Management System Registration Page...";
		StudentRegn studentRegnDetails = new StudentRegn();
		
		String[] grades = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
		String[] sections = {"A","B","C","D","E"};
		
		model.addAttribute("grades", grades);
		model.addAttribute("sections", sections);
		model.addAttribute("studentRegnDetails", studentRegnDetails);
		model.addAttribute("regmsg", regmsg);
		
		return "studentRegistrationForm";
	}
	
	@PostMapping("/register")
	public String showConfirmationPage(@ModelAttribute("studRegn") StudentRegn studRegn)
	{
		System.out.println("In Process Regn");
		return "confirmation";
	}
	
	@PostMapping("/login")
	public String showStudentsManagementPage(@ModelAttribute("login") Login login)
	{
		if(loginService.validateLoginSvc(login))
		{
			System.out.println("Login Details "+login);
			return "studentsMgmtPage";
		}
		else
		{
			return "failedLogin";
		}
	}
	@RequestMapping("/validated")
	public String showStudentsManagementPage()
	{
		return "studentsMgmtPage";
	}
	
	

}
