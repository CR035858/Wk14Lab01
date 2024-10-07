package com.gl.sms.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentregn")
public class StudentRegn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="userName")
	String userName;
	
	@Column(name="password")
	String password;
	
	@Column(name="studentName")
	String studentName;//text
	
	@Column(name="studentAddress")
	String studentAddress;//textarea
	
	@Column(name="parentMobile")
	String parentMobile;//text
	
	@Column(name="parentFname")
	String parentFname;//text
	
	@Column(name="parentMname")
	String parentMname;//text
	
	@Column(name="studentEmail")
	String studentEmail; //text
	
	@Column(name="grade")
	String grade;//drop down
	
	@Column(name="section")
	String section; // drop down
	
	@Column(name="gender")
	String gender;//radio
	
	
	@Column(name="hobbies")
	String hobbies;//checkBox
	
	public StudentRegn() {
		super();
	}

	
	public StudentRegn(int id, String userName, String password, String studentName, String studentAddress,
			String parentMobile, String parentFname, String parentMname, String studentEmail, String grade,
			String section, String gender, String hobbies) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.parentMobile = parentMobile;
		this.parentFname = parentFname;
		this.parentMname = parentMname;
		this.studentEmail = studentEmail;
		this.grade = grade;
		this.section = section;
		this.gender = gender;
		this.hobbies = hobbies;
	}


	public StudentRegn(String userName, String password, String studentName, String studentAddress, String parentMobile,
			String parentFname, String parentMname, String studentEmail, String grade, String section, String gender,
			String hobbies) {
		super();
		this.userName = userName;
		this.password = password;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.parentMobile = parentMobile;
		this.parentFname = parentFname;
		this.parentMname = parentMname;
		this.studentEmail = studentEmail;
		this.grade = grade;
		this.section = section;
		this.gender = gender;
		this.hobbies = hobbies;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getParentMobile() {
		return parentMobile;
	}

	public void setParentMobile(String parentMobile) {
		this.parentMobile = parentMobile;
	}

	public String getParentFname() {
		return parentFname;
	}

	public void setParentFname(String parentFname) {
		this.parentFname = parentFname;
	}

	public String getParentMname() {
		return parentMname;
	}

	public void setParentMname(String parentMname) {
		this.parentMname = parentMname;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "StudentRegn [id=" + id + ", userName=" + userName + ", password=" + password + ", studentName="
				+ studentName + ", studentAddress=" + studentAddress + ", parentMobile=" + parentMobile
				+ ", parentFname=" + parentFname + ", parentMname=" + parentMname + ", studentEmail=" + studentEmail
				+ ", grade=" + grade + ", section=" + section + ", gender=" + gender + ", hobbies=" + hobbies + "]";
	}

	

	
	
	

}
