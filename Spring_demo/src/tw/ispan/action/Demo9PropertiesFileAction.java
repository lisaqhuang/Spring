package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.LightBean;

public class Demo9PropertiesFileAction {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		LightBean light1 = context.getBean("light",LightBean.class);
		System.out.println("id:"+ light1.getId());
		System.out.println("red:"+ light1.getRed());
		System.out.println("green:"+ light1.getGreen());
		System.out.println("yellow:"+ light1.getYellow());
		context.close();
	}

}
