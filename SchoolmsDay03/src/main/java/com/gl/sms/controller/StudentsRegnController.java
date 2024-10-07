package com.gl.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.sms.model.Login;
import com.gl.sms.model.StudentRegn;
import com.gl.sms.service.LoginService;
import com.gl.sms.service.StudentRegnService;

@Controller
@RequestMapping("/studentRegn")
public class StudentsRegnController {
	
	@Autowired
	StudentRegnService studentRegnService;
	
	@Autowired
	LoginService loginService;
	
	
	/*	This is the Old Method which was just to show the 
		Data in the Confirmation Page and Not Saving in DB
	 	Initial Part of the Project */
	@PostMapping("/saveRegnDetails")
	public String saveStudentRegnDetails(Model model,@ModelAttribute("studentRegnDetails") StudentRegn studRegn)
	{
		System.out.println("In Regn Process ");
		System.out.println("modifying id "+studRegn.getId());
		studentRegnService.saveStudentRegnDetail(studRegn);
		
		/*SIMULTANEOUSLY LOGIN TABLE SHOULD GET iNSERTED/UPDATED WITH USERNAME & PASSWORD
		FOR UPDATION , SHOULD CHECK IF RECORD EXIST AND THEN - SAVEORUPDATE to Be performed by
		DAO accordingly*/
		String userName = studRegn.getUserName();
		String password = studRegn.getPassword();
		int id = studRegn.getId();
		Login loginCheck = new Login(userName,password);
		Login  login = loginService.getLoginById(id);
		
		System.out.println("Existing "+login);
		if(login != null)
		{
			login.setUserName(userName); // Changing only New username & Password with Same ID
			login.setPassword(password);
			loginService.saveLogin(login);
		}
		else
		{
			loginService.saveLogin(loginCheck);
		}
		model.addAttribute("loginsuccess", "Congrats!!! Registered Successfully!!! Please Login");
		return "redirect:/greet/login";
	}
	
	//Fetch all StudentRegn Details
	
	
	@RequestMapping("/getAllStudentRegnDetails")
	public String getAllStudentRegnDetails(Model model)
	{
		List <StudentRegn> studentRegnDetails;
		studentRegnDetails = studentRegnService.getStudentRegnDetails();
		model.addAttribute("studentRegnDetails", studentRegnDetails);
		return "/greet/studentRegnList";
	}
	
	@RequestMapping("/getStudentRegnDetailById")
	public StudentRegn getStudentRegnById(int id)
	{
		StudentRegn studentRegn = new StudentRegn();
		return studentRegn;
	}
	//Save Student Registration Details
/*	@PostMapping("/registerStudentRegnDetail")
	public String registerStudent(@ModelAttribute("studRegn") StudentRegn studRegn)
	{
		System.out.println("In Process Regn");
		studentRegnService.saveStudentRegnDetail(studRegn);
		return "studentRegnList";
	}*/
	
	@PostMapping("/showFormForUpdate")
	public String showStudentRegnFormForUpdate(Model model,@RequestParam("studRegnId") int studRegnId)
	{
		StudentRegn studentRegnDetails = studentRegnService.getStudentRegnDetailById(studRegnId);
		model.addAttribute("studentRegnDetails", studentRegnDetails);
		String[] grades = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
		String[] sections = {"A","B","C","D","E"};
		
		model.addAttribute("grades", grades);
		model.addAttribute("sections", sections);
		
		return "studentRegistrationForm";
		
	}
	@RequestMapping("/deleteStudentRegnDetailById")
	public String deleteStudentRegnById(@RequestParam("studRegnId") int studRegnId)
	{
		studentRegnService.deleteStudentRegnDetailById(studRegnId);
		return "redirect:/greet/showRegnDetails";
	}
	
	


}
