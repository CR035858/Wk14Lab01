package com.gl.sms.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.sms.model.Employee;



@Repository
@EnableTransactionManagement
public class EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	
	public EmployeeDao(SessionFactory sessionFactory)
	{
		/*sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();*/

		//create session
		//Session session = sessionFactory.getCurrentSession();
		
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();/**/
	}
	
	@Transactional
	public List<Employee> getEmployeesDao() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
				List <Employee> employees = session.createQuery("from Employee").list();
		tx.commit();
		return employees;
	}

	
	@Transactional
	public Employee getEmployeeByIdDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
			Employee employee  = session.get(Employee.class, id);
		tx.commit();
		return employee;
	}


	@Transactional
	public void deleteEmployeeDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Employee employee  = session.get(Employee.class, id);
		session.delete(employee);
		tx.commit();
		
	}

	@Transactional
	public void saveEmployeeDao(Employee employee) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		
	}


}
