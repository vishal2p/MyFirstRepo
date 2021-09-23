package test;
import bean.*;

	import java.util.Scanner;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class stdMain {
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
			Student std = (Student)ctx.getBean("stdObj");
			std.printdetails();
			System.out.println("-------------------------------");
			Student std1 = (Student)ctx.getBean("stdObj1");
			System.out.println("Student Name : ");
			std1.setSname(sc.next());
			System.out.println("Student Course : ");
			std1.setCourse(sc.next());
			System.out.println("Course Fees : ");
			std1.setFees(sc.nextFloat());		
			std1.printdetails();		
		}
	}


