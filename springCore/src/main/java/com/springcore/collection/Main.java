package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("Prog Start .........");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/configCollection.xml");
		//(eg. if file present in package com.springcore.collection then path is ""com/springcore/collection/fileName" )
		
		Employe em1 = (Employe) context.getBean("emp1"); 
		System.out.println(em1);
		//for seprate
		System.out.println(em1.getName());
		System.out.println(em1.getPhones());
		System.out.println(em1.getAddress());
		System.out.println(em1.getCourses());
	}
}
