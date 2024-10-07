package zglcathymemvc1.gl.thyme.controller;

import java.util.Arrays;

public class User {
	
	String userName;
	String password;
	String gender;
	String employed;
	String city;
	String[] hobbies;
	
	
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public User(String userName, String password, String gender, String employed, String city) {
		super();
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.employed = employed;
		this.city = city;
	}


	public User() {
		super();
		hobbies = new String[5];
	}


	public String[] getHobbies() {
		return hobbies;
	}


	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}


	public User(String userName, String password, String gender, String employed, String city, String[] hobbies) {
		super();
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.employed = employed;
		this.city = city;
		this.hobbies = hobbies;
	}


	public User(String userName, String password, String gender, String employed) {
		super();
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.employed = employed;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmployed() {
		return employed;
	}


	public void setEmployed(String employed) {
		this.employed = employed;
	}


	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", gender=" + gender + ", employed=" + employed
				+ ", city=" + city + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
	
	
	

}
