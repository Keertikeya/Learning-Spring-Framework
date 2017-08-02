package com.gupta.keertikeya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCoachClass", CricketCoach.class);
		
		
		System.out.println("You have been selected to play for " + theCoach.getTeamName());
		
		System.out.println("Please email your availability to the coach at: " + theCoach.getCoachEmail());
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();
	}

}
