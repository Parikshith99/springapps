package com.springdemos.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/reftypes/config.xml");
		Scores score = (Scores) context.getBean("scores");
		Student student=(Student) context.getBean("student");
		System.out.println(student);
	}

}
