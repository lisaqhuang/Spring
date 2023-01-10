package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.Employee;

public class Demo11PostConstructAction {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp = context.getBean("employee",Employee.class);
		
		System.out.println("vacation:"+emp.getVacation());
		context.close();
	}

}
