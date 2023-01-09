package tw.ispan.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.Student;

public class Demo7ComponentAction {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu1 = context.getBean("student",Student.class);
        stu1.setName("Jerry");
        System.out.println("name:"+ stu1.getName());
        
        context.close();
        
	}

}
