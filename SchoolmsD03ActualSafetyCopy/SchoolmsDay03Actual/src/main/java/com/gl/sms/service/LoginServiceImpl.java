package com.gl.sms.service;

import java.util.List;

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

	@Override
	public void saveLogin(Login login) {
		// TODO Auto-generated method stub
		loginDao.saveLoginDao(login);
	}

	@Override
	public Login checkIfLoginExist(Login login) {
		// TODO Auto-generated method stub
		List <Login> logins = loginDao.getLoginDao();
		for(Login chklogin:logins)
		{
			if(chklogin.equals(login))
			{
				return chklogin;
			}
		}
		return null;
	}

	@Override
	public Login getLoginById(int id) {
		// TODO Auto-generated method stub
		return loginDao.getLoginByIdDao(id);
	}

}
