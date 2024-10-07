package com.gl.sms.model;

public class Login {
	
	int id;
	String userName;
	String password;
	
	public Login() {
		super();
	}

	public Login(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public Login(String userName, String password) {
		super();
	
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Login [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	

}
