package zmavenmvchibernate.gl.hib.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import zmavenmvchibernate.gl.hib.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.transaction.Transactional;



@Repository
@EnableTransactionManagement
public class EmployeeServiceImpl implements EmployeeService{

	SessionFactory sessionFactory;
	Session session;
	
	public EmployeeServiceImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}
	
	
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
				List <Employee> employees = session.createQuery("from Employee").list();
		tx.commit();
		return employees;
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
			Employee employee  = session.get(Employee.class, id);
		tx.commit();
		return employee;
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Employee employee  = session.get(Employee.class, id);
		session.delete(employee);
		tx.commit();
		
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		
	}

}
