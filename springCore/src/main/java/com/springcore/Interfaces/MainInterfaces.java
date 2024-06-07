package com.springcore.Interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInterfaces {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Interfaces/Interfacesconfig.xml");
		
		//registering shutdown hook
		context.registerShutdownHook();
				
		Samosa s = (Samosa) context.getBean("s1");
		Pepsi p = (Pepsi) context.getBean("p1");
		
		System.out.println(s);
		System.out.println("--------------------");
		System.out.println(p);
			
	}
}
