package tw.ispan.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.Teacher;

public class Demo1XmlAction {

	public static void main(String[] args) {

		//建Spring Ioc容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Teacher teacher =(Teacher) context.getBean("teacher1");
//		teacher.teach("授課");
		
		String string0 = context.getBean("string0",String.class);
		System.out.println("string0:"+ string0);
		
		String string1 = context.getBean("string1",String.class);
		System.out.println("string1:"+string1);
		
		
		((ConfigurableApplicationContext)context).close();
	}

}
