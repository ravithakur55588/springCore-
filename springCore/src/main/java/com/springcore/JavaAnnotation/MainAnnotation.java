package com.springcore.JavaAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {
	public static void main(String[] args) {
		ApplicationContext ancontext = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Product p = (Product) ancontext.getBean("pp");
		
		System.out.println(p);
	}
}
