package com.springdemos.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/map/config.xml");
		// get employee from container
		Customer customer = (Customer) context.getBean("customer");
		// print employee
		System.out.println(customer);
		System.out.println(customer.getProducts().getClass());
		
	}

}
