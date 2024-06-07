package com.univ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Prog. Start........");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//creating object of student class
		Student std1 = (Student) context.getBean("student1");
		System.out.println(std1);
		
		Student std2 = (Student) context.getBean("student2");
		System.out.println(std2);
		
		Student std3 = (Student) context.getBean("student3");
		System.out.println(std3);
		
		System.out.println("Prog. Ends........");
	}
}
