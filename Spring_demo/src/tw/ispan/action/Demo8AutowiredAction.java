package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.CompanySoGo;

public class Demo8AutowiredAction {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CompanySoGo sogo = context.getBean("companySoGo",CompanySoGo.class);
		sogo.useCard();
		
		context.close();
	}

}
