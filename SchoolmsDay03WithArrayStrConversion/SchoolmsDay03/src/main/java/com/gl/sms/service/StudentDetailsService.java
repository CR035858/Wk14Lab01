package com.gl.sms.service;

import java.util.List;

import com.gl.sms.model.StudentDetails;

public interface StudentDetailsService {
	
	public List <StudentDetails> getStudentDetails();
	public StudentDetails getStudentDetailById(int id);
	public void saveStudentDetails(StudentDetails studentDetail);
	public void deleteStudentDetailById(int id);

}
