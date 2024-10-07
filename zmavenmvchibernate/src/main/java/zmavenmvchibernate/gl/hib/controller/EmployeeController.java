package zmavenmvchibernate.gl.hib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zmavenmvchibernate.gl.hib.entity.Employee;
import zmavenmvchibernate.gl.hib.service.EmployeeService;


@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/getAll")
	public String getAllEmployees(Model model)
	{
		List <Employee> employees = employeeService.getEmployees();
		model.addAttribute("employees", employees);
		return "employeeslist";
		
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
		employee  = employeeService.getEmployeeById(eId);
		model.addAttribute("employee", employee);
		return "employeeform";
	}
	
	@RequestMapping("/save")
	public String saveEmployee(@RequestParam("empId") int eId,@RequestParam("empName") String eName,@RequestParam("empAddress") String eAddr,@RequestParam("empPhone") String ePhone,@RequestParam("empSalary") int eSal,Model model)
	{
		Employee employee = new Employee();
		if(eId != 0)
		{
			employee = employeeService.getEmployeeById(eId);
			employee.setEmployeeName(eName);
			employee.setEmployeeAddress(eAddr);
			employee.setEmployeePhone(ePhone);
			employee.setEmployeeSalary(eSal);
		}
		else
		{
			employee = new Employee(eName,eAddr,ePhone,eSal);
		}
		employeeService.saveEmployee(employee);
		return "redirect:/employees/getAll";
	}
	
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("empId") int eId)
	{
		Employee employee = new Employee();
		employeeService.deleteEmployee(eId);
		return "redirect:/employees/getAll";
	}
		
}
