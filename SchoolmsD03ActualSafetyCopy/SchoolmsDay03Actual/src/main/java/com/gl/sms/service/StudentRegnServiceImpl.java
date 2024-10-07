package com.gl.sms.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.sms.dao.StudentRegnDao;

import com.gl.sms.model.StudentRegn;

@Service
public class StudentRegnServiceImpl implements StudentRegnService {

	@Autowired
	StudentRegnDao studentRegnDao;

	@Override
	public List<StudentRegn> getStudentRegnDetails() {
		// TODO Auto-generated method stub
		return studentRegnDao.getStudentsRegnDao();
	}

	@Override
	public StudentRegn getStudentRegnDetailById(int id) {
		// TODO Auto-generated method stub
		return studentRegnDao.getStudentRegnIdDao(id);
	}

	@Override
	public void saveStudentRegnDetail(StudentRegn studentRegn) {
		// TODO Auto-generated method stub
		System.out.println("Calling StudentRegn Save Service");
		studentRegnDao.saveStudentRegnDao(studentRegn);
	}

	@Override
	public void deleteStudentRegnDetailById(int id) {
		// TODO Auto-generated method stub
		studentRegnDao.deleteStudentRegnDao(id);
	}

	
	
	
	
	
}
