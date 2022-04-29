package com.springdemos.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/properties/config.xml");
		// get employee from container
		Locations loc = (Locations) context.getBean("location");
		// print employee
		System.out.println(loc);
		System.out.println(loc.getDialect().getClass());
		
	}

}
