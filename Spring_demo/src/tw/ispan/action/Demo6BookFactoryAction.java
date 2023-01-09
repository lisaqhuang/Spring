package tw.ispan.action;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.model.Book;

public class Demo6BookFactoryAction {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book3 = context.getBean("marketBook",Book.class);
        System.out.println("book3 name:"+ book3.getBookName());
        
        Book book4 = context.getBean("spyBook",Book.class);
        System.out.println("book4 name:"+ book4.getBookName());
        context.close();
	}

}
