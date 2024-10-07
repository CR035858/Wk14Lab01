package com.gl.sms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.sms.model.StudentDetails;
import com.gl.sms.service.StudentDetailsService;


@Controller
@RequestMapping("/studentDetails")
public class StudentsDetailsController {
	
	@Autowired
	StudentDetailsService studentDetailService; 
	
	@PostMapping("/saveStudentDetails")
	public String saveStudentDetails(@ModelAttribute("studentDetails") StudentDetails studentDetail)
	{
		System.out.println("In Process Regn");
		studentDetailService.saveStudentDetails(studentDetail);
		return "redirect:/greet/showStudentDetails";
	}
	
	//Fetch all StudentRegn Details
	
	@RequestMapping("/showFormForAdd")
	public String showAddStudentDetailsForm(Model model)
	{
		StudentDetails studentDetail = new StudentDetails();
		model.addAttribute("studentDetail", studentDetail);
		return "StudentDetailsForm";
	}
	@RequestMapping("/getAllStudentDetails")
	public String getAllStudentDetails(Model model)
	{
		List <StudentDetails> studentDetails ;
		studentDetails = studentDetailService.getStudentDetails();
		model.addAttribute("studentDetails", studentDetails);
		return "redirect:/greet/showStudentDetails";
	}
	
	@RequestMapping("/getStudentDetailsById")
	public String getStudentDetailsById(int id)
	{
		StudentDetails studentDetail ;
		studentDetail =  studentDetailService.getStudentDetailById(id);
		
		return "studentsDetailsList";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showStudentDetailsUpdateForm(Model model,@RequestParam("studId") int studId)
	{
		StudentDetails studentDetail = studentDetailService.getStudentDetailById(studId);
		model.addAttribute("studentDetail", studentDetail);
		return "StudentDetailsForm";
	}
	
	@RequestMapping("/deleteStudentDetailsById")
	public String deleteStudentDetailsById(@RequestParam("studId") int studId)
	{
		studentDetailService.deleteStudentDetailById(studId);
		return "redirect:/greet/showStudentDetails";
	}
	
	
	
	

}
