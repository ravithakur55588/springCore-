package com.springcore.Referance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Referance/configReference.xml");
		
		A mm = (A) context.getBean("aref");
		
		System.out.println(mm);   //(class A contains x,class B contains y)
		
		System.out.println(mm.getX());
		
		//using B class object
		System.out.println(mm.getOb().getY());
	}
}
