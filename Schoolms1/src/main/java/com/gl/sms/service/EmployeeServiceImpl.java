package com.gl.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.sms.dao.EmployeeDao;
import com.gl.sms.model.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.transaction.Transactional;



@Service
@EnableTransactionManagement
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	public EmployeeServiceImpl()
	{
		
	}


	@Override
	public List<Employee> getEmployeesSvc() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeesDao();
	}

	@Override
	public Employee getEmployeeByIdSvc(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByIdDao(id);
	}

	@Override
	public void deleteEmployeeSvc(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployeeDao(id);
	}

	@Override
	public void saveEmployeeSvc(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.saveEmployeeDao(employee);
	}
	
	
	
}
