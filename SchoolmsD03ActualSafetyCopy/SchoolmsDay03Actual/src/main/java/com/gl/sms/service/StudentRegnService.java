package com.gl.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.gl.sms.model.StudentRegn;

@Service
public interface StudentRegnService {

	public List <StudentRegn> getStudentRegnDetails();
	public StudentRegn getStudentRegnDetailById(int id);
	public void saveStudentRegnDetail(StudentRegn studentRegn);
	public void deleteStudentRegnDetailById(int id);
	
}
