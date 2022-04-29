package com.springdemos.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/set/config.xml");
		// get employee from container
		CarDealer car = (CarDealer) context.getBean("cardealer");
		// print employee
		System.out.println(car);
		System.out.println(car.getModels().getClass());
	}

}
