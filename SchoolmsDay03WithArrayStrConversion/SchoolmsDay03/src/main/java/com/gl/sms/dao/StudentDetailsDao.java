package com.gl.sms.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.sms.model.StudentDetails;



@Repository
@EnableTransactionManagement
public class StudentDetailsDao {
	
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	
	public StudentDetailsDao(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}
	
	@Transactional
	public List <StudentDetails> getStudentDetailsDao() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
				List <StudentDetails> studentDetails = session.createQuery("from StudentDetails").list();
				System.out.println(studentDetails);
		tx.commit();
		return studentDetails;
	}

	
	@Transactional
	public StudentDetails getStudentDetailsByIdDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
			StudentDetails studentDetail  = session.get(StudentDetails.class, id);
		tx.commit();
		return studentDetail;
	}


	@Transactional
	public void deleteStudentDetailsDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		StudentDetails studentDetails  = session.get(StudentDetails.class, id);
		session.delete(studentDetails);
		tx.commit();
		
	}

	@Transactional
	public void saveStudentDetailsDao(StudentDetails studentDetail) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(studentDetail);
		tx.commit();
		
	}

}
