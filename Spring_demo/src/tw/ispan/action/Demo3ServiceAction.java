package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.LoginDao;
import tw.ispan.service.LoginService;

public class Demo3ServiceAction {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//constructor注入
//	    LoginService service = context.getBean("loginService",LoginService.class);
//	    
//	    boolean result = service.checkLogin("jerry", "pw");
//	    System.out.println("result:"+ result);

		//setter注入
		LoginService service2 = context.getBean("loginService2", LoginService.class);

		boolean result = service2.checkLogin("jerry", "pwdd2");
		System.out.println("result:" + result);

		context.close();

	}

}
