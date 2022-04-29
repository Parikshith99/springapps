package com.springdemos.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/list/config.xml");
		// get employee from container
		Hospital hos = (Hospital) context.getBean("hos");
		// print employee
		System.out.println(hos);
	}

}
