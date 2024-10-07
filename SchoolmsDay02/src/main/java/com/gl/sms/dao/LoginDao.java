package com.gl.sms.dao;

import org.springframework.stereotype.Repository;
import com.gl.sms.model.Login;

@Repository
public class LoginDao {
	
	Login login;
	
	public LoginDao() {
		super();
		login = new Login(1,"student","password");
	}

	public LoginDao(Login login) {
		super();
		this.login = login;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	public Login getLoginObject()
	{
		return this.login;
	}
	
	public boolean validateLogin(Login login)
	{
		if(this.login.getUserName().equals(login.getUserName())
				&& (this.login.getPassword().equals(login.getPassword())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
