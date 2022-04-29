package com.springdemos.springcore.challenge;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/challenge/config.xml");
		// get employee from container
		Item item = (Item) context.getBean("items");
		shoppingCart shoppingCart =(shoppingCart) context.getBean("shoppingCart");
		// print employee
		System.out.println(shoppingCart);
		
	}

}
