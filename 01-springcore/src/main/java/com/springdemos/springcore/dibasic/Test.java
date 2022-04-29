package com.springdemos.springcore.dibasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/dibasic/config.xml");
		// get employee from container
		Employee emp = (Employee) context.getBean("emp");
		// print employee
		System.out.println(emp);
	}

}
