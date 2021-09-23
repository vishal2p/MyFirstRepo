package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.*;
public class AutowireTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("empaccconfig.xml");
		
		Employee em = (Employee)ctx.getBean("emp");
		em.printValues();
	}

}
