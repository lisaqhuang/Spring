package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.LoginDao;

public class Demo2DaoAction {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginDao loginDao = context.getBean("loginDao",LoginDao.class);
		//測試DAO
		boolean result = loginDao.checkLogin("jerry","pwd");
		System.out.println("result:"+ result);
		context.close();
		
		
	}

}
