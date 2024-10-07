package com.gl.sms.service;

import com.gl.sms.model.Login;

public interface LoginService {
	
	public boolean validateLoginSvc(Login login);
	
	public void saveLogin(Login login);
	
	public Login checkIfLoginExist(Login login);
	
	public Login getLoginById(int id);

}
