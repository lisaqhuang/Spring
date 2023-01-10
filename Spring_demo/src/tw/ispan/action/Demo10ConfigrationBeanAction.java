package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.Phone;

public class Demo10ConfigrationBeanAction {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Phone phone = context.getBean("myPhone",Phone.class);
		System.out.println("name:"+ phone.getPhoneName());
		System.out.println("brand:"+ phone.getPhoneBrand());
		context.close();
		
	}

}
