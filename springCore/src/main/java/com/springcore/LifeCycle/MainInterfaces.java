package com.springcore.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInterfaces {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/LifeCycle/Interfacesconfig.xml");
		
		Samosa s = (Samosa) context.getBean("s1");
		Pepsi p = (Pepsi) context.getBean("p1");
		
		System.out.println(s);
		System.out.println(p);
	}
}
