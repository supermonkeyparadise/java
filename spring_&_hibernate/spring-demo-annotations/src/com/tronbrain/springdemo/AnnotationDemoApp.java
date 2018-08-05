package com.tronbrain.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read string config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

		// call a method on the bean
		System.out.print(theCoach.getDailyWorkout());

		// close the context
		context.close();

	}

}
