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
@Table(name="studentdetails")
public class StudentDetails {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="studentfName")
	String studentfName;
	
	@Column(name="studentlName")
	String studentlName;
	
	@Column(name="grade")
	String grade;
	
	@Column(name="section")
	String section;
	
	@Column(name="classTeacher")
	String classTeacher;
	
	
	@Column(name="subjects")
	String subjects;
	
	@Column(name="maxScore")
	int maxScore;
	
	@Column(name="totalScore")
	int totalScore;
	
	//String[] hobbies;//checkBox
	
	public StudentDetails() {
		super();
	}

	public StudentDetails(int id, String studentfName, String studentlName, String grade, String section,
			String classTeacher, String subjects, int maxScore, int totalScore) {
		super();
		this.id = id;
		this.studentfName = studentfName;
		this.studentlName = studentlName;
		this.grade = grade;
		this.section = section;
		this.classTeacher = classTeacher;
		this.subjects = subjects;
		this.maxScore = maxScore;
		this.totalScore = totalScore;
	}

	public StudentDetails(String studentfName, String studentlName, String grade, String section, String classTeacher,
			String subjects, int maxScore, int totalScore) {
		super();
		this.studentfName = studentfName;
		this.studentlName = studentlName;
		this.grade = grade;
		this.section = section;
		this.classTeacher = classTeacher;
		this.subjects = subjects;
		this.maxScore = maxScore;
		this.totalScore = totalScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentfName() {
		return studentfName;
	}

	public void setStudentfName(String studentfName) {
		this.studentfName = studentfName;
	}

	public String getStudentlName() {
		return studentlName;
	}

	public void setStudentlName(String studentlName) {
		this.studentlName = studentlName;
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

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", studentfName=" + studentfName + ", studentlName=" + studentlName
				+ ", grade=" + grade + ", section=" + section + ", classTeacher=" + classTeacher + ", subjects="
				+ subjects + ", maxScore=" + maxScore + ", totalScore=" + totalScore + "]";
	}
	
}
