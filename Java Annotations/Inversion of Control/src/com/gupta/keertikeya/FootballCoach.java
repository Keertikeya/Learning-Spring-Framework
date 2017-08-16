package com.gupta.keertikeya;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Run 50 laps of the ground.";
	}

}
