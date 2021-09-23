package test;
import bean.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		//Student std1 = (Student)ctx.getBean("stdObj");
		//Student std2 = (Student)ctx.getBean("stdObj1");
		
		System.out.println(ctx.getBean("stdObj"));
		System.out.println(ctx.getBean("stdObj"));
		
	}

}

