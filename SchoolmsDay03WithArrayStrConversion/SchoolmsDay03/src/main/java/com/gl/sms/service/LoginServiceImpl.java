package com.gl.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.sms.dao.LoginDao;
import com.gl.sms.model.Login;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao loginDao;
	
	@Override
	public boolean validateLoginSvc(Login login) {
		// TODO Auto-generated method stub
		return loginDao.validateLogin(login);
	}

}
