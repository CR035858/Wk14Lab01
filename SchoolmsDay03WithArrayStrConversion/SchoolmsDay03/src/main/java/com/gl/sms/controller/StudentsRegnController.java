package com.gl.sms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.sms.model.StudentRegn;
import com.gl.sms.service.StudentRegnService;

@Controller
@RequestMapping("/studentRegn")
public class StudentsRegnController {
	
	@Autowired
	StudentRegnService studentRegnService;
	
	
	/*	This is the Old Method which was just to show the 
		Data in the Confirmation Page and Not Saving in DB
	 	Initial Part of the Project */
	@PostMapping("/register")
	public String showConfirmationPage(@ModelAttribute("studRegn") StudentRegn studRegn)
	{
		System.out.println("In Regn Process ");
		studentRegnService.saveStudentRegnDetail(studRegn);
		return "confirmation";
	}
	
	//Fetch all StudentRegn Details
	
	
	@RequestMapping("/getAllStudentRegnDetails")
	public String getAllStudentRegnDetails(Model model)
	{
		List <StudentRegn> studentRegnDetails;
		studentRegnDetails = studentRegnService.getStudentRegnDetails();
		model.addAttribute("studentRegnDetails", studentRegnDetails);
		return "studentRegnList";
	}
	
	@RequestMapping("/getStudentRegnDetailById")
	public StudentRegn getStudentRegnById(int id)
	{
		StudentRegn studentRegn = new StudentRegn();
		return studentRegn;
	}
	//Save Student Registration Details
	@PostMapping("/registerStudentRegnDetail")
	public String registerStudent(@ModelAttribute("studRegn") StudentRegn studRegn)
	{
		System.out.println("In Process Regn");
		studentRegnService.saveStudentRegnDetail(studRegn);
		return "studentRegnList";
	}
	
	@RequestMapping("/deleteStudentRegnDetailById")
	public String deleteStudentRegnById(int id)
	{
		studentRegnService.deleteStudentRegnDetailById(id);
		return "studentRegnList";
	}
	
	


}
