package com.springcore.JavaAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Product pp() {
		Product p = new Product();
		
		p.setPid(11);
		p.setPname("Pen");
		
		return p;          //return object b/c user define method is a user define data type     
	}
}
