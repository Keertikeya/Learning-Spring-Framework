package com.gupta.keertikeya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		// Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from container
		Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach theFootballCoach = context.getBean("footballCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theTennisCoach.getDailyWorkout());
		System.out.println(theTennisCoach.getDailyFortune());
		System.out.println(theTennisCoach.getDailyWeather());
		System.out.println(theTennisCoach.getAnotherFortuneService());
		
		System.out.println();
		
		System.out.println(theFootballCoach.getDailyWorkout());
		System.out.println(theFootballCoach.getDailyFortune());
		System.out.println(theFootballCoach.getDailyWeather());
		
		// Close the container
		context.close();

	}

}
