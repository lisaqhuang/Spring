package tw.ispan.service;

import tw.ispan.model.LoginDao;

public class LoginService {
	
	private LoginDao loginDao;

	public LoginService() {
	}
	
	//依賴注入(建構子注入)
	public LoginService(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	
    //setter注入
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public boolean checkLogin(String username,String pwd) {
		
		return loginDao.checkLogin(username, pwd);
	}
}
