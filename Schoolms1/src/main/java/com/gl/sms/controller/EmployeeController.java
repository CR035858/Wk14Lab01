package com.gl.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.sms.model.Employee;
import com.gl.sms.service.EmployeeService;




@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/getAll")
	public String getAllEmployees(Model model)
	{
		List <Employee> employees = employeeService.getEmployeesSvc();
		model.addAttribute("employees", employees);
		System.out.println(employees);
		return "list-employees";
		
	}
	
	@RequestMapping("/add")
	public String showFormForAdd(Model model)
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employeeform";
	}
	@RequestMapping("/update")
	public String showFormForUpdate(@RequestParam("empId") int eId,Model model)
	{
		Employee employee = new Employee();
		employee  = employeeService.getEmployeeByIdSvc(eId);
		model.addAttribute("employee", employee);
		return "employeeform";
	}
	
	@RequestMapping("/save")
	public String saveEmployee(@RequestParam("empId") int eId,@RequestParam("empName") String eName,@RequestParam("empAddress") String eAddr,@RequestParam("empPhone") String ePhone,@RequestParam("empSalary") int eSal,Model model)
	{
		Employee employee = new Employee();
		if(eId != 0)
		{
			employee = employeeService.getEmployeeByIdSvc(eId);
			employee.setEmployeeName(eName);
			employee.setEmployeeAddress(eAddr);
			employee.setEmployeePhone(ePhone);
			employee.setEmployeeSalary(eSal);
		}
		else
		{
			employee = new Employee(eName,eAddr,ePhone,eSal);
		}
		employeeService.saveEmployeeSvc(employee);
		return "redirect:/employees/getAll";
	}
	
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("empId") int eId)
	{
		Employee employee = new Employee();
		employeeService.deleteEmployeeSvc(eId);
		return "redirect:/employees/getAll";
	}
		
}
