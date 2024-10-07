package zmavenmvchibernate.gl.hib.service;

import java.util.List;

import org.springframework.stereotype.Service;

import zmavenmvchibernate.gl.hib.entity.Employee;



//@Service
public interface EmployeeService {

	public List <Employee> getEmployees();
	public Employee getEmployeeById(int id);
	public void deleteEmployee(int id);
	public void saveEmployee(Employee employee);
	
}
