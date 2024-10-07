package com.gl.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.sms.dao.StudentDetailsDao;
import com.gl.sms.model.StudentDetails;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {
	
	@Autowired
	StudentDetailsDao studentDetailsDao;

	@Override
	public List<StudentDetails> getStudentDetails() {
		// TODO Auto-generated method stub
		return studentDetailsDao.getStudentDetailsDao();
	}

	@Override
	public StudentDetails getStudentDetailById(int id) {
		// TODO Auto-generated method stub
		return studentDetailsDao.getStudentDetailsByIdDao(id);
	}

	@Override
	public void saveStudentDetails(StudentDetails studentDetail) {
		// TODO Auto-generated method stub
		studentDetailsDao.saveStudentDetailsDao(studentDetail);
	}

	@Override
	public void deleteStudentDetailById(int id) {
		// TODO Auto-generated method stub
		 studentDetailsDao.deleteStudentDetailsDao(id);;
	}
	
	

}
