package com.gl.sms.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.sms.model.StudentRegn;



@Repository
@EnableTransactionManagement
public class StudentRegnDao {
	
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	
	public StudentRegnDao(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}
	@Transactional
	public List <StudentRegn> getStudentsRegnDao() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		List <StudentRegn> studentRegns = session.createQuery("from StudentRegn").list();
		tx.commit();
		return studentRegns;
	}

	
	@Transactional
	public StudentRegn getStudentRegnIdDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
			StudentRegn studentRegn  = session.get(StudentRegn.class, id);
		tx.commit();
		return studentRegn;
	}


	@Transactional
	public void deleteStudentRegnDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		StudentRegn studentRegn  = session.get(StudentRegn.class, id);
		session.delete(studentRegn);
		tx.commit();
		
	}

	@Transactional
	public void saveStudentRegnDao(StudentRegn studentRegn) {
		// TODO Auto-generated method stub
		System.out.println("Calling StudentRegn Save DAO");
		session = sessionFactory.openSession();
		session.saveOrUpdate(studentRegn);
		
	
		/*
		 * 	session = sessionFactory.openSession();
		//	Transaction tx = session.beginTransaction();
			session.saveOrUpdate(studentDetail);
		//	tx.commit();
		// PLEASE NOTE WHEN SAVEORUPDATE METHOD IS USED 
		// IT DOES NOT NEED NEW TRANSACTION
		// AS WELL AS IF SAVEORUPDATE IS EXECUTED IN THE EXISTING SESSION
		//IT THROWS EXCEPTION SAYING THERE IS AN INSTANCE WITH THE ID ALREADY
			 */
		
		
	}

}
